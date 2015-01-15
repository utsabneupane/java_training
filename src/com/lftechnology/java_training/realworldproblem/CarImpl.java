package com.lftechnology.java_training.realworldproblem;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CarImpl {
	private static Logger LOGGER = Logger.getLogger(ElectricCar.class.getName());
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int inputChoice = 0;

		// int secondInputChoice = 0;
		boolean isInt = false;
		do {
			LOGGER.log(Level.INFO,
					"\n****Simulation of Cars: ****** \n1.Simulation of Electric Car \n2. Simulation of Petrol Car \n3.to exit");
			do {
				inputChoice = input.nextInt();
				isInt = true;
			} while (!isInt);

			switch (inputChoice) {
			case 1:
				ElectricCar teslaCar = new ElectricCar();
				electricCarFunctionImpl(teslaCar);
				break;
			case 2:
				PetrolCar bmwPetrolCar = new PetrolCar();
				petrolCarFunctionImpl(bmwPetrolCar);
				break;
			default:
				break;
			}
		} while (inputChoice != 3);
	}

	/**
	 * @param teslaCar
	 */
	private static void electricCarFunctionImpl(ElectricCar teslaCar) {
		int firstInputChoice = 0;
		boolean isInt = false;
		do {
			LOGGER.log(Level.INFO, "\n1. Moving car to Charging adapter \n2.Charge Car \n3.Run test Electric Car\n4.Back to Main Menu");
			do {
				firstInputChoice = input.nextInt();
				isInt = true;
			} while (!isInt);

			switch (firstInputChoice) {
			case 1:
				teslaCar.moveCarToChargingAdapter();
				break;
			case 2:
				teslaCar.chargeCar();
				break;
			case 3:
				teslaCar.runTestElectricCar();
				break;
			default:
				break;
			}
		} while (firstInputChoice != 4);
	}

	/**
	 * @param teslaCar
	 */
	private static void petrolCarFunctionImpl(PetrolCar bmwPetrolCar) {
		int firstInputChoice = 0;
		boolean isInt = false;
		do {
			LOGGER.log(Level.INFO, "\n1. Fill Fuel \n2.Run test Electric Car \n3. Back to Main Menu");
			do {
				firstInputChoice = input.nextInt();
				isInt = true;
			} while (!isInt);

			switch (firstInputChoice) {
			case 1:
				bmwPetrolCar.fillFuel();
				break;
			case 2:
				bmwPetrolCar.runTestPetrolCar();
				break;
			default:
				break;
			}
		} while (firstInputChoice != 3);
	}
}
