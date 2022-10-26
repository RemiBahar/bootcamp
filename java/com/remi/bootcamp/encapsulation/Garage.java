package com.remi.bootcamp.encapsulation;

import java.util.ArrayList;
import java.util.HashMap;

import com.remi.bootcamp.encapsulation.Vehicle.VehicleType;

public class Garage {
	private HashMap<Integer, Vehicle> vehicles;
	private HashMap<VehicleType, ArrayList<Integer>> vechiclesByType;
	
	Garage(){
		this.vehicles = new HashMap();
		this.vechiclesByType = new HashMap();
	}
	
	public void addVehicle(Vehicle vehicle) {
		this.vehicles.put(vehicle.getId(), vehicle);
		
		ArrayList<Integer> vehicleTypeList = this.vechiclesByType.get(vehicle.getVehicleType());
		
		if(vehicleTypeList == null) {
			this.vechiclesByType.put(vehicle.getVehicleType(), new ArrayList());
		} 
		
		this.vechiclesByType.get(vehicle.getVehicleType()).add(vehicle.getId());
	}
	
	public void removeVehicle(Vehicle vehicle) {
		this.vehicles.remove(vehicle.getId());
		this.vechiclesByType.get(vehicle.getVehicleType()).remove(vehicle.getId());
	}
	
	public Vehicle getVehicle(int i) {
		return this.vehicles.get(i);
	}
	
	public ArrayList<Vehicle> getVehiclesByType(VehicleType vehicleType) {
		ArrayList<Integer> vehicleIdList = this.vechiclesByType.get(vehicleType);
		ArrayList<Vehicle> vehiclesByType = new ArrayList();
		
		for(int i : vehicleIdList) {
			vehiclesByType.add(getVehicle(i));
		}
		
		return vehiclesByType;
	}
	
	public void removeVehiclesByType(VehicleType vehicleType) {
		ArrayList<Integer> vehicleIdList = this.vechiclesByType.get(vehicleType);
		
		for(int i : vehicleIdList) {
			vehicles.remove(getVehicle(i));
		}
		
		this.vechiclesByType.get(vehicleType).clear();
	}
	
	public void emptyGarage() {
		vehicles.clear();
	}
	
	public double totalCost() {
		double totalCost = 0;
		
		for(Vehicle vehicle : vehicles.values()) {
			totalCost += vehicle.calculateCost();
		}
		
		return totalCost;
		
	}
}
