package Address_Book_System;

class Contact {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Address address;

    Contact(String firstName, String lastName, String phone, String email, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return getFullName() + " | Phone: " + phone +
               " | Email: " + email +
               " | Address: " + address;
    }
}

