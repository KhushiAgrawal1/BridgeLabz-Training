package com.TextEditor_Undo_Redo_Functionality;

public class Action {
    String type; // "insert" or "delete"
    String content; // text inserted or deleted
    int position; // position in the text

    public Action(String type, String content, int position) {
        this.type = type;
        this.content = content;
        this.position = position;
    }

    @Override
    public String toString() {
        return type + " \"" + content + "\" at position " + position;
    }
}
