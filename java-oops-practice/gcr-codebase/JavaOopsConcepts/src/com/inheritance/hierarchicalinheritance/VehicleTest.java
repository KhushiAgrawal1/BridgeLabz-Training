package com.inheritance.hierarchicalinheritance.BankAccountTypes;

//Superclass
class Vehicle {
 int maxSpeed;
 String fuelType;

 void displayInfo() {
     System.out.println("Max Speed: " + maxSpeed);
     System.out.println("Fuel Type: " + fuelType);
 }
}

//Car subclass
class Car extends Vehicle {
 int seatCapacity;

 @Override
 void displayInfo() {
     super.displayInfo();
     System.out.println("Seat Capacity: " + seatCapacity);
 }
}

//Truck subclass
class Truck extends Vehicle {
 int loadCapacity;

 @Override
 void displayInfo() {
     super.displayInfo();
     System.out.println("Load Capacity: " + loadCapacity + " tons");
 }
}

//Motorcycle subclass
class Motorcycle extends Vehicle {
 boolean hasGear;

 @Override
 void displayInfo() {
     super.displayInfo();
     System.out.println("Has Gear: " + hasGear);
 }
}

//Main class
public class VehicleTest {
 public static void main(String[] args) {
     Vehicle[] vehicles = new Vehicle[3];

     Car car = new Car();
     car.maxSpeed = 180;
     car.fuelType = "Petrol";
     car.seatCapacity = 5;

     Truck truck = new Truck();
     truck.maxSpeed = 120;
     truck.fuelType = "Diesel";
     truck.loadCapacity = 10;

     Motorcycle bike = new Motorcycle();
     bike.maxSpeed = 150;
     bike.fuelType = "Petrol";
     bike.hasGear = true;

     vehicles[0] = car;
     vehicles[1] = truck;
     vehicles[2] = bike;

     for (Vehicle v : vehicles) {
         v.displayInfo();
         System.out.println();
     }
 }
}
