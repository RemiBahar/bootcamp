package com.remi.bootcamp.encapsulation;

import com.remi.bootcamp.encapsulation.Car.CarType;
import com.remi.bootcamp.encapsulation.Plane.PlaneType;
import com.remi.bootcamp.encapsulation.Vehicle.VehicleType;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Car civic = new Car(1, "honda", "civic", "petrol", CarType.HATCHBACK);
		civic.setFuelCost(100);
		civic.setInsuranceCost(200);
		
		Car corolla = new Car(2, "toyota", "corolla", "hybrid", CarType.HATCHBACK);
		corolla.setFuelCost(50);
		corolla.setInsuranceCost(150);
		
		Plane boeing = new Plane(3, "Boeing", "747", "petrol", PlaneType.PASSENGER);
		boeing.setFuelCost(1000);
		boeing.setServiceCost(5000);
		boeing.setStaffCost(10000);
		
		Bike carrera = new Bike(4, "Carrera", "Valour");
		
		Garage garage = new Garage();
		garage.addVehicle(civic);
		garage.addVehicle(corolla);
		garage.addVehicle(boeing);
		garage.addVehicle(carrera);
		// Add id
		System.out.println("total cost: " + garage.totalCost());
		
		System.out.println("vehicles by type: " + garage.getVehiclesByType(VehicleType.CAR));

	}

}
