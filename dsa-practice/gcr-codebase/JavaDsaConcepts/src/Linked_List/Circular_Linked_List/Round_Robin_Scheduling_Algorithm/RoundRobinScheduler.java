package Linked_List.Circular_Linked_List.Round_Robin_Scheduling_Algorithm;

public class RoundRobinScheduler {

    ProcessNode head;
    int processCount = 0;

    // Add process at end
    void addProcess(int id, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(id, burstTime, priority);
        processCount++;

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        ProcessNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Remove process by ID
    void removeProcess(int id) {
        if (head == null) return;

        ProcessNode curr = head;
        ProcessNode prev = null;

        do {
            if (curr.processId == id) {

                // Single process
                if (curr.next == head && curr == head) {
                    head = null;
                }
                // Removing head
                else if (curr == head) {
                    ProcessNode temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    head = head.next;
                    temp.next = head;
                }
                // Removing middle/last
                else {
                    prev.next = curr.next;
                }

                processCount--;
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // Display processes
    void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in queue");
            return;
        }

        ProcessNode temp = head;
        do {
            System.out.println(
                    "PID: " + temp.processId +
                    ", Remaining Time: " + temp.remainingTime +
                    ", Priority: " + temp.priority
            );
            temp = temp.next;
        } while (temp != head);
    }

    // Round Robin Scheduling
    void simulateRoundRobin(int timeQuantum) {
        if (head == null) return;

        int currentTime = 0;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;

        ProcessNode current = head;

        while (processCount > 0) {

            if (current.remainingTime > 0) {

                int executedTime = Math.min(timeQuantum, current.remainingTime);
                current.remainingTime -= executedTime;
                currentTime += executedTime;

                // Process completed
                if (current.remainingTime == 0) {
                    int turnaroundTime = currentTime;
                    int waitingTime = turnaroundTime - current.burstTime;

                    totalTurnaroundTime += turnaroundTime;
                    totalWaitingTime += waitingTime;

                    int completedId = current.processId;
                    current = current.next;
                    removeProcess(completedId);

                    if (head == null) break;
                    continue;
                }
            }
            current = current.next;

            System.out.println("\nProcesses after current round:");
            displayProcesses();
        }

        double avgWaitingTime = (double) totalWaitingTime / (totalTurnaroundTime == 0 ? 1 : processCount + 1);
        double avgTurnaroundTime = (double) totalTurnaroundTime / (totalTurnaroundTime == 0 ? 1 : processCount + 1);

        System.out.println("\nAverage Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
    }

    // Main method
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        System.out.println("Initial Process Queue:");
        scheduler.displayProcesses();

        int timeQuantum = 3;
        System.out.println("\nSimulating Round Robin (Time Quantum = " + timeQuantum + ")");
        scheduler.simulateRoundRobin(timeQuantum);
    }
}
