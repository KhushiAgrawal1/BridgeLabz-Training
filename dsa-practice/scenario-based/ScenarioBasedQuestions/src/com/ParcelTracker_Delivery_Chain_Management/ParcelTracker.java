package com.ParcelTracker_Delivery_Chain_Management;

class ParcelTracker {

    static class Stage {
        String name;
        Stage next;

        Stage(String name) {
            this.name = name;
            this.next = null;
        }
    }

    Stage head;

    void addStage(String name) {
        Stage newStage = new Stage(name);
        if (head == null) {
            head = newStage;
            return;
        }

        Stage temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newStage;
    }

    void addIntermediateStage(String after, String newStage) {
        Stage temp = head;
        while (temp != null && !temp.name.equals(after))
            temp = temp.next;

        if (temp == null) {
            System.out.println("Stage not found!");
            return;
        }

        Stage node = new Stage(newStage);
        node.next = temp.next;
        temp.next = node;
    }

    void trackParcel() {
        if (head == null) {
            System.out.println("Parcel lost!");
            return;
        }

        Stage temp = head;
        System.out.print("Tracking: ");
        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        ParcelTracker pt = new ParcelTracker();

        pt.addStage("Packed");
        pt.addStage("Shipped");
        pt.addStage("In Transit");
        pt.addStage("Delivered");

        pt.addIntermediateStage("Shipped", "Custom Check");
        pt.trackParcel();
    }
}

