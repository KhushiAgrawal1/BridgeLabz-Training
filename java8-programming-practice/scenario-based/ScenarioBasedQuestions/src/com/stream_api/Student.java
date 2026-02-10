package com.stream_api;
class Student {
    int id;
    String name;
    int age;
    String gender;
    String city;
    String department;
    int rank;
    List<String> contacts;

    public Student(int id, String name, int age, String gender,
                   String city, String department, int rank, List<String> contacts) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.department = department;
        this.rank = rank;
        this.contacts = contacts;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getCity() { return city; }
    public String getDepartment() { return department; }
    public int getRank() { return rank; }
    public int getId() { return id; }
    public List<String> getContacts() { return contacts; }

    public String toString() {
        return name + " (Rank: " + rank + ")";
    }
}