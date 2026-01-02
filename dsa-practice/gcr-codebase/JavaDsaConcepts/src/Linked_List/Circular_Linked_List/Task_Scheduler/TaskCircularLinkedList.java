package Linked_List.Circular_Linked_List.Task_Scheduler;

public class TaskCircularLinkedList {

    TaskNode head;

    // Add at beginning
    void addAtBeginning(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
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

    // Add at end
    void addAtEnd(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Add at specific position
    void addAtPosition(int pos, int id, String name, int priority, String dueDate) {
        if (pos == 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        TaskNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove by task ID
    void removeByTaskId(int id) {
        if (head == null) return;

        TaskNode curr = head;
        TaskNode prev = null;

        do {
            if (curr.taskId == id) {

                // Only one node
                if (curr == head && curr.next == head) {
                    head = null;
                }
                // Deleting head
                else if (curr == head) {
                    TaskNode temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    head = head.next;
                    temp.next = head;
                }
                // Deleting middle or last
                else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Task not found");
    }

    // View current task and move to next
    void viewAndMoveNext() {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        System.out.println(
                "Current Task -> ID: " + head.taskId +
                ", Name: " + head.taskName +
                ", Priority: " + head.priority +
                ", Due Date: " + head.dueDate
        );

        head = head.next;
    }

    // Display all tasks
    void displayAll() {
        if (head == null) {
            System.out.println("No tasks to display");
            return;
        }

        TaskNode temp = head;
        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by priority
    void searchByPriority(int priority) {
        if (head == null) return;

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No task found with this priority");
        }
    }

    void displayTask(TaskNode t) {
        System.out.println(
                "Task ID: " + t.taskId +
                ", Name: " + t.taskName +
                ", Priority: " + t.priority +
                ", Due Date: " + t.dueDate
        );
    }

    // Main method
    public static void main(String[] args) {
        TaskCircularLinkedList scheduler = new TaskCircularLinkedList();

        scheduler.addAtEnd(1, "Design Module", 1, "10-02-2026");
        scheduler.addAtEnd(2, "Code Review", 2, "12-02-2026");
        scheduler.addAtBeginning(3, "Testing", 1, "08-02-2026");

        System.out.println("All Tasks:");
        scheduler.displayAll();

        System.out.println("\nView & Move Next:");
        scheduler.viewAndMoveNext();
        scheduler.viewAndMoveNext();

        System.out.println("\nSearch by Priority:");
        scheduler.searchByPriority(1);

        scheduler.removeByTaskId(2);

        System.out.println("\nAfter Deletion:");
        scheduler.displayAll();
    }
}
