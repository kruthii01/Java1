package pkg1;
class Vehicle {
 private String brand;

 public Vehicle(String brand) {
     this.brand = brand;
 }

 public String getBrand() {
     return brand;
 }

 public void honk() {
     System.out.println("Honking...");
 }
}

interface Electric {
 void charge();
}


interface Autonomous {
 void autoDrive();
}
class ElectricCar extends Vehicle implements Electric, Autonomous {
 public ElectricCar(String brand) {
     super(brand);
 }

 @Override
 public void charge() {
     System.out.println("Charging...");
 }

 @Override
 public void autoDrive() {
     System.out.println("Driving autonomously...");
 }

 public void displayDetails() {
     System.out.println("Brand: " + getBrand());
 }
}

public class K40 {
 public static void main(String[] args) {
     ElectricCar car = new ElectricCar("Tesla");
     car.honk();
     car.charge();
     car.autoDrive();
     car.displayDetails();
 }
}


