package Linked_List.Circular_Linked_List.Task_Scheduler;

public class TaskCircularLinkedList {

    private TaskNode head;
    private TaskNode current;

    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    public void addAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }

        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        TaskNode temp = head;

        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeByTaskId(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }

        TaskNode curr = head;
        TaskNode prev = null;

        do {
            if (curr.taskId == taskId) {
                if (prev == null) {
                    TaskNode temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }

                    if (head == head.next) {
                        head = null;
                        current = null;
                        return;
                    }

                    temp.next = head.next;
                    head = head.next;
                } else {
                    prev.next = curr.next;
                }

                if (current == curr) {
                    current = curr.next;
                }
                return;
            }

            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Task not found");
    }

    public void viewCurrentAndMoveNext() {
        if (current == null) {
            System.out.println("No tasks available");
            return;
        }

        System.out.println(
                "Current Task: " +
                current.taskId + " " +
                current.taskName + " " +
                current.priority + " " +
                current.dueDate
        );

        current = current.next;
    }

    public void displayAll() {
        if (head == null) {
            System.out.println("No tasks to display");
            return;
        }

        TaskNode temp = head;
        do {
            System.out.println(
                    temp.taskId + " " +
                    temp.taskName + " " +
                    temp.priority + " " +
                    temp.dueDate
            );
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                System.out.println(
                        temp.taskId + " " +
                        temp.taskName + " " +
                        temp.priority + " " +
                        temp.dueDate
                );
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with this priority");
        }
    }
}
