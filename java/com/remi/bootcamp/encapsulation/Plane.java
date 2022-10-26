package com.remi.bootcamp.encapsulation;

import java.util.Map;

public class Plane extends Vehicle{
	private final PlaneType type;
		
	public enum PlaneType { // Allows enum to be declared
	  CARGO,
	  PASSENGER,
	  MILITARY
	}
	
	private double fuelCost;
	private double serviceCost;
	private double staffCost;
	
	Plane(int id, String brand, String model, String fuelType, PlaneType type){
		super(id, VehicleType.PLANE, brand, model, fuelType, 4);
		this.type = type;
	}
	
	public PlaneType getType() {
		return this.type;
	}
	
	public void setFuelCost(double fuelCost) {
		this.fuelCost = fuelCost;
	}
	
	public double getFuelCost() {
		return this.fuelCost;
	}
	
	public void setServiceCost(double serviceCost) {
		this.serviceCost = serviceCost;
	}
	
	public double getServiceCost() {
		return this.serviceCost;
	}
	
	public void setStaffCost(double staffCost) {
		this.staffCost = staffCost;
	}
	
	public double getStaffCost() {
		return this.staffCost;
	}
	
	@Override
	public double calculateCost() {
		return this.fuelCost
			+  this.serviceCost
			+  this.staffCost;
	}
	
	@Override 
	public String toString() {
		return "brand: " + this.getWheels() 
			+ " model: " + this.getModel()
			+ " fuelType: " + this.getFuelType()
			+ " wheels: " + this.getWheels() 
			+  " type: " + this.getType();
	}

	@Override
	public void setCost() {
		// TODO Auto-generated method stub
		
	}
}
