package com.remi.bootcamp.encapsulation;

public class Car extends Vehicle{
	private final CarType type;
	
	public enum CarType { // Allows enum to be declared
	  HATCHBACK,
	  SALOON,
	  SUV,
	  ESTATE
	}
	
	private double fuelCost;
	private double insuranceCost;
	
	Car(int id, String brand, String model, String fuelType, CarType type){
		super(id, VehicleType.CAR, brand, model, fuelType, 4);
		this.type = type;
	}
	
	
	public CarType getType() {
		return this.type;
	}

	public void setFuelCost(double fuelCost) {
		this.fuelCost = fuelCost;
	}
	
	public double getFuelCost() {
		return this.fuelCost;
	}
	
	public void setInsuranceCost(double insuranceCost) {
		this.insuranceCost = insuranceCost;
	}
	
	public double getInsuranceCost() {
		return this.insuranceCost;
	}
	
	public double calculateCost() {
		return this.getFuelCost()
			+  this.getInsuranceCost();
	}
	
	@Override 
	public String toString() {
		return "brand: " + this.getWheels() 
			+ " model: " + this.getModel()
			+ " fuelType: " + this.getFuelType()
			+ " wheels: " + this.getWheels() 
			+  " type: " + this.getType();
	}

}