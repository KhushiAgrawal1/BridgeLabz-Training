package Linked_List.Doubly_Linked_List.UndoRedo_Functionality_for_a_TextEditor;

public class TextEditorHistory {

    private TextStateNode head;
    private TextStateNode tail;
    private TextStateNode current;
    private int size;
    private final int MAX_HISTORY = 10;

    public void addState(String text) {
        TextStateNode newNode = new TextStateNode(text);

        // Remove redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
            size = calculateSize();
        }

        if (head == null) {
            head = tail = current = newNode;
            size = 1;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        current = newNode;
        size++;

        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("No more undo available");
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("No more redo available");
        }
    }

    public void displayCurrentState() {
        if (current != null)
            System.out.println("Current Text: " + current.text);
        else
            System.out.println("No text available");
    }

    private int calculateSize() {
        int count = 0;
        TextStateNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
