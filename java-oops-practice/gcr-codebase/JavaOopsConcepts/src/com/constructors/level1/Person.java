package com.constructors.level1;

public class Person {
	String name;
	int age;
	
	public Person(){
		name = "unknown";
		age = 0;
	}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public Person(Person b){
		this.name = b.name;
		this.age = b.age;
	}
	
	void getDetails() {
		System.out.println("Name: " + name + " Age: " + age);
	}
	
	public static void main(String[] args) {
		Person b1 = new Person();
		b1.getDetails();
	    Person b = new Person(b1);
		b.getDetails();
		}
}
