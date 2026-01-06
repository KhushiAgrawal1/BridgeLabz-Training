package Linked_List.Doubly_Linked_List.UndoRedo_Functionality_for_a_TextEditor;

public class TextEditorApp {

    public static void main(String[] args) {

        TextEditorHistory editor = new TextEditorHistory();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.addState("Hello World! Java");

        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.addState("Hello World! Java Programming");
        editor.displayCurrentState();

        editor.redo(); // should not work
    }
}

