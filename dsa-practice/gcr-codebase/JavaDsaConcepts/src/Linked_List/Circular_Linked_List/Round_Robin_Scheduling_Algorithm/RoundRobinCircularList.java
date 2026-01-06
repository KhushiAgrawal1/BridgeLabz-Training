package Linked_List.Circular_Linked_List.Round_Robin_Scheduling_Algorithm;

public class RoundRobinCircularList {

    private ProcessNode head;
    private int processCount = 0;

    public void addProcess(int id, int burstTime, int priority) {
        ProcessNode node = new ProcessNode(id, burstTime, priority);
        processCount++;

        if (head == null) {
            head = node;
            node.next = head;
            return;
        }

        ProcessNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = node;
        node.next = head;
    }

    public void removeProcess(ProcessNode prev, ProcessNode curr) {
        if (curr == head && curr.next == head) {
            head = null;
        } else {
            if (curr == head)
                head = head.next;
            prev.next = curr.next;
        }
        processCount--;
    }

    public void simulate(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes");
            return;
        }

        int time = 0;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;

        ProcessNode curr = head;
        ProcessNode prev = null;

        while (processCount > 0) {

            displayQueue();

            if (curr.remainingTime > timeQuantum) {
                curr.remainingTime -= timeQuantum;
                time += timeQuantum;
                prev = curr;
                curr = curr.next;
            } else {
                time += curr.remainingTime;
                curr.remainingTime = 0;

                totalTurnaroundTime += time;
                totalWaitingTime += time - curr.burstTime;

                removeProcess(prev, curr);

                if (prev == null)
                    curr = head;
                else
                    curr = prev.next;
            }
        }

        System.out.println("\nAverage Waiting Time: " +
                (double) totalWaitingTime / (totalTurnaroundTime == 0 ? 1 : (totalWaitingTime + totalTurnaroundTime) / totalTurnaroundTime));

        System.out.println("Average Turnaround Time: " +
                (double) totalTurnaroundTime / (totalTurnaroundTime == 0 ? 1 : (totalWaitingTime + totalTurnaroundTime) / totalTurnaroundTime));
    }

    public void displayQueue() {
        if (head == null) {
            System.out.println("Queue empty");
            return;
        }

        ProcessNode temp = head;
        System.out.print("Queue: ");
        do {
            System.out.print(
                    "[P" + temp.processId +
                    " RT:" + temp.remainingTime + "] "
            );
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

