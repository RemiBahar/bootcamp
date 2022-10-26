package com.remi.bootcamp.encapsulation;

import com.remi.bootcamp.encapsulation.Car.CarType;

public class Bike extends Vehicle{
	Bike(int id, String brand, String model){
		super(id, VehicleType.BIKE, brand, model, "no fuel", 2);
	}
	
	@Override
	public double calculateCost() {
		return 0d;
	}
	
	@Override 
	public String toString() {
		return "brand: " + this.getWheels() 
			+ " model: " + this.getModel()
			+ " fuelType: " + this.getFuelType()
			+ " wheels: " + this.getWheels();
	}
}
