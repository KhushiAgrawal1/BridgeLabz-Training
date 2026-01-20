package Address_Book_System;

public class AddressBookApp {
    public static void main(String[] args) {

        AddressBook book = new AddressBook();

        Address a1 = new Address("Bhopal", "MP", "462001");
        Address a2 = new Address("Indore", "MP", "452001");

        Contact c1 = new Contact("Khushi", "Agrawal",
                "9876543210", "khushi@gmail.com", a1);

        Contact c2 = new Contact("Amit", "Sharma",
                "9123456789", "amit@gmail.com", a2);

        book.addContact(c1);
        book.addContact(c2);

        System.out.println("\nAll Contacts:");
        book.displayAll();

        System.out.println("\nSearch by City:");
        book.searchByCityOrState("Bhopal");

        System.out.println("\nEdit Contact:");
        book.editContact("Khushi Agrawal", "9999999999", "khushi@newmail.com");

        System.out.println("\nDelete Contact:");
        book.deleteContact("Amit Sharma");

        System.out.println("\nFinal Contact List:");
        book.displayAll();
    }
}

