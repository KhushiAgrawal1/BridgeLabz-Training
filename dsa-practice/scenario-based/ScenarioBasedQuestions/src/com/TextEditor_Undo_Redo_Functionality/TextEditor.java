package com.TextEditor_Undo_Redo_Functionality;

import java.util.*;

public class TextEditor {

    private StringBuilder text; // current text
    private Stack<Action> undoStack;
    private Stack<Action> redoStack;
    private Scanner sc;

    public TextEditor() {
        text = new StringBuilder();
        undoStack = new Stack<>();
        redoStack = new Stack<>();
        sc = new Scanner(System.in);
    }

    // Insert text
    public void insertText() {
        System.out.print("Enter text to insert: ");
        String input = sc.nextLine();

        System.out.print("Enter position (0 to " + text.length() + "): ");
        int pos = sc.nextInt();
        sc.nextLine(); // consume newline

        if (pos < 0 || pos > text.length()) {
            System.out.println("Invalid position!");
            return;
        }

        text.insert(pos, input);
        undoStack.push(new Action("insert", input, pos));
        redoStack.clear();

        System.out.println("Text after insertion: " + text);
    }

    // Delete text
    public void deleteText() {
        System.out.print("Enter start position to delete: ");
        int start = sc.nextInt();
        System.out.print("Enter end position to delete: ");
        int end = sc.nextInt();
        sc.nextLine(); // consume newline

        if (start < 0 || end > text.length() || start >= end) {
            System.out.println("Invalid positions!");
            return;
        }

        String deleted = text.substring(start, end);
        text.delete(start, end);
        undoStack.push(new Action("delete", deleted, start));
        redoStack.clear();

        System.out.println("Text after deletion: " + text);
    }

    // Undo last action
    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo.");
            return;
        }

        Action last = undoStack.pop();
        if (last.type.equals("insert")) {
            text.delete(last.position, last.position + last.content.length());
        } else if (last.type.equals("delete")) {
            text.insert(last.position, last.content);
        }

        redoStack.push(last);
        System.out.println("After undo: " + text);
    }

    // Redo last undone action
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo.");
            return;
        }

        Action last = redoStack.pop();
        if (last.type.equals("insert")) {
            text.insert(last.position, last.content);
        } else if (last.type.equals("delete")) {
            text.delete(last.position, last.position + last.content.length());
        }

        undoStack.push(last);
        System.out.println("After redo: " + text);
    }

    // Display current text
    public void displayText() {
        System.out.println("Current text: " + text);
    }

    // Menu-driven interface
    public void menu() {
        while (true) {
            System.out.println("\nTextEditor Menu:");
            System.out.println("1. Insert Text");
            System.out.println("2. Delete Text");
            System.out.println("3. Undo");
            System.out.println("4. Redo");
            System.out.println("5. Display Text");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> insertText();
                case 2 -> deleteText();
                case 3 -> undo();
                case 4 -> redo();
                case 5 -> displayText();
                case 6 -> {
                    System.out.println("Exiting TextEditor...");
                    return;
                }
                default -> System.out.println("Invalid option! Try again.");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.menu();
    }
}

