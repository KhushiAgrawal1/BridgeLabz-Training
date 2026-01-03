package Linked_List.Doubly_Linked_List.UndoRedo_Functionality_for_a_TextEditor;

public class TextEditorUndoRedo {

    TextStateNode head;
    TextStateNode tail;
    TextStateNode current;

    int maxSize = 10;
    int size = 0;

    // Add new text state
    void addState(String newText) {
        TextStateNode newNode = new TextStateNode(newText);

        // If current is not at tail, clear redo history
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

        // Maintain fixed size
        if (size > maxSize) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo operation
    void undo() {
        if (current == null || current.prev == null) {
            System.out.println("Nothing to undo");
            return;
        }
        current = current.prev;
    }

    // Redo operation
    void redo() {
        if (current == null || current.next == null) {
            System.out.println("Nothing to redo");
            return;
        }
        current = current.next;
    }

    // Display current text
    void displayCurrentState() {
        if (current == null) {
            System.out.println("Text is empty");
            return;
        }
        System.out.println("Current Text: " + current.text);
    }

    // Calculate size of list
    int calculateSize() {
        int count = 0;
        TextStateNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Display all states (for understanding)
    void displayAllStates() {
        TextStateNode temp = head;
        while (temp != null) {
            System.out.println(temp.text);
            temp = temp.next;
        }
    }

    // Main method
    public static void main(String[] args) {
        TextEditorUndoRedo editor = new TextEditorUndoRedo();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");

        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.addState("Hello World!!!");
        editor.displayCurrentState();
    }
}
