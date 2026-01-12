package com.BrowserBuddy_Tab_History_Manager;

class Tab {
    String url;
    Tab prev;
    Tab next;

    public Tab(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return url;
    }
}

