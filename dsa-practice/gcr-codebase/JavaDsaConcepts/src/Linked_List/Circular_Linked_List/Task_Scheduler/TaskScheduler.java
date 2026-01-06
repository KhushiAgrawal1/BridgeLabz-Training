package Linked_List.Circular_Linked_List.Task_Scheduler;

public class TaskScheduler {

    public static void main(String[] args) {

        TaskCircularLinkedList scheduler = new TaskCircularLinkedList();

        scheduler.addAtBeginning(1, "Design", 1, "10-02-2026");
        scheduler.addAtEnd(2, "Coding", 2, "15-02-2026");
        scheduler.addAtEnd(3, "Testing", 3, "20-02-2026");
        scheduler.addAtPosition(2, 4, "Review", 1, "12-02-2026");

        System.out.println("All Tasks:");
        scheduler.displayAll();

        System.out.println("\nView Current Tasks:");
        scheduler.viewCurrentAndMoveNext();
        scheduler.viewCurrentAndMoveNext();
        scheduler.viewCurrentAndMoveNext();

        System.out.println("\nSearch by Priority:");
        scheduler.searchByPriority(1);

        System.out.println("\nRemove Task:");
        scheduler.removeByTaskId(2);

        System.out.println("\nFinal Task List:");
        scheduler.displayAll();
    }
}
