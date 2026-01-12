package com.BrowserBuddy_Tab_History_Manager;

import java.util.*;

public class BrowserBuddy {

    private Tab current; // Current tab
    private Stack<Tab> closedTabs; // Recently closed tabs
    private Scanner sc;

    public BrowserBuddy() {
        current = null;
        closedTabs = new Stack<>();
        sc = new Scanner(System.in);
    }

    // Open a new URL
    public void openURL() {
        System.out.print("Enter URL to open: ");
        String url = sc.nextLine();
        Tab newTab = new Tab(url);

        if (current != null) {
            current.next = newTab;
            newTab.prev = current;
        }
        current = newTab;

        System.out.println("Opened: " + current.url);
    }

    // Go back in history
    public void goBack() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Went back to: " + current.url);
        } else {
            System.out.println("No previous page.");
        }
    }

    // Go forward in history
    public void goForward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Went forward to: " + current.url);
        } else {
            System.out.println("No forward page.");
        }
    }

    // Close current tab
    public void closeTab() {
        if (current == null) {
            System.out.println("No tab is open to close.");
            return;
        }

        System.out.println("Closed tab: " + current.url);
        closedTabs.push(current);

        if (current.prev != null) {
            current.prev.next = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }

        current = (current.prev != null) ? current.prev : current.next;
    }

    // Reopen last closed tab
    public void reopenTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No recently closed tabs.");
            return;
        }

        Tab reopened = closedTabs.pop();
        reopened.prev = null;
        reopened.next = null;

        if (current != null) {
            current.next = reopened;
            reopened.prev = current;
        }
        current = reopened;

        System.out.println("Reopened tab: " + current.url);
    }

    // Display current tab
    public void displayCurrent() {
        if (current != null) {
            System.out.println("Current tab: " + current.url);
        } else {
            System.out.println("No tab is open.");
        }
    }

    // Menu for user
    public void menu() {
        while (true) {
            System.out.println("\nBrowserBuddy Menu:");
            System.out.println("1. Open URL");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Close Tab");
            System.out.println("5. Reopen Last Closed Tab");
            System.out.println("6. Current Tab");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> openURL();
                case 2 -> goBack();
                case 3 -> goForward();
                case 4 -> closeTab();
                case 5 -> reopenTab();
                case 6 -> displayCurrent();
                case 7 -> {
                    System.out.println("Exiting BrowserBuddy...");
                    return;
                }
                default -> System.out.println("Invalid option! Try again.");
            }
        }
    }

    public static void main(String[] args) {
        BrowserBuddy browser = new BrowserBuddy();
        browser.menu();
    }
}

