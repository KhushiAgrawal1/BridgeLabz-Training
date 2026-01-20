package Address_Book_System;

import java.util.*;

class AddressBook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    // Add contact (duplicate check)
    void addContact(Contact c) {
        for (Contact contact : contacts) {
            if (contact.getFullName().equalsIgnoreCase(c.getFullName())) {
                System.out.println("Duplicate contact not allowed.");
                return;
            }
        }
        contacts.add(c);
        System.out.println("Contact added successfully.");
    }

    // Edit contact by name
    void editContact(String name, String newPhone, String newEmail) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(name)) {
                c.setPhone(newPhone);
                c.setEmail(newEmail);
                System.out.println("Contact updated.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Delete contact by name
    void deleteContact(String name) {
        Iterator<Contact> it = contacts.iterator();
        while (it.hasNext()) {
            if (it.next().getFullName().equalsIgnoreCase(name)) {
                it.remove();
                System.out.println("Contact deleted.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Search by city or state
    void searchByCityOrState(String key) {
        for (Contact c : contacts) {
            if (c.getAddress().getCity().equalsIgnoreCase(key) ||
                c.getAddress().getState().equalsIgnoreCase(key)) {
                System.out.println(c);
            }
        }
    }

    // Display all contacts sorted alphabetically
    void displayAll() {
        contacts.sort(Comparator.comparing(Contact::getFullName));
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
