package oopsdemo2;

public class Vehicle {
	
	void drive()
	{
		System.out.println("driving vehicle");
	}

}
 class Car extends Vehicle
 {

	@Override
	void drive() {
		System.out.println("driving car");
		
	}
	 
 }
 
 class Truck extends Vehicle
 {

	@Override
	void drive() {
		System.out.println("driving truck");
	}
	void load()
	{
		System.out.println("loading truck");
	}
	 
 }
