package Linked_List.Doubly_Linked_List.UndoRedo_Functionality_for_a_TextEditor;

public class TextStateNode {
    String text;
    TextStateNode prev;
    TextStateNode next;

    TextStateNode(String text) {
        this.text = text;
        this.prev = null;
        this.next = null;
    }
}

