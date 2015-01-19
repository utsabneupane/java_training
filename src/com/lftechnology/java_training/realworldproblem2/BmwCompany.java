package com.lftechnology.java_training.realworldproblem2;

public class BmwCompany {

	public static void main(String[] args) {
		// Petrol Car Simulation
		Car petrolCar = new PetrolCar();
		petrolCar.functionSimulaton();
		// Electric Car Simulation
		Car electricCar = new ElectricCar();
		electricCar.functionSimulaton();
	}
}
