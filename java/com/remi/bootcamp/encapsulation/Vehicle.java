package com.remi.bootcamp.encapsulation;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

import com.remi.bootcamp.encapsulation.Car.CarType;

public abstract class Vehicle {
	// Fields
	private final int wheels;
	private final String brand;
	private final String model;
	private final String fuelType;
	public HashMap<String, Double> cost = new HashMap();
	private final int id;
	private final VehicleType vehicleType;
	
	public enum VehicleType { // Allows enum to be declared
	  CAR,
	  PLANE,
	  BIKE
	}
	
	
	// Constructor
	Vehicle(int id, VehicleType vehicleType, String brand, String model, String fuelType, int wheels){
		this.brand = brand;
		this.model = model;
		this.fuelType = fuelType;
		this.wheels = wheels;
		this.id = id;
		this.vehicleType = vehicleType;
	}
	
	// Getters 
	public int getId() {
		return this.id;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getFuelType() {
		return this.fuelType;
	}
	
	public VehicleType getVehicleType() {
		return this.vehicleType;
	}
	
	public int getWheels() {
		return this.wheels;
	}
	
	public HashMap<String, Double> getCost() {
		return this.cost;
	}
	
	public abstract double calculateCost();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	/*
	@Override
	public int hashCode() {
	    int hash = 7;
	    hash = 31 * hash + (int) id;
	    hash = 31 * hash + (brand == null ? 0 : name.hashCode());
	    hash = 31 * hash + (email == null ? 0 : email.hashCode());
	    return hash;
	}*/

}
