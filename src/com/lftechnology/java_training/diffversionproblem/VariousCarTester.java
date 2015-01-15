package com.lftechnology.java_training.diffversionproblem;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class performs various feature and functionalities of {@link ElectricCar} and {@link PetrolCar}
 * 
 * @author Utsab Neupane<utsabneupane@lftechnology.com>
 * 
 */
public class VariousCarTester {
	private static Logger LOGGER = Logger.getLogger(ElectricCar.class.getName());
	private static Scanner input = new Scanner(System.in);
	private static int choiceInput = 0;

	public static void main(String[] args) {
		String inputChoice = "";
		do {
			LOGGER.log(Level.INFO,
					"\n****Simulation of Cars: ****** \n1.Simulation of Electric Car \n2. Simulation of Petrol Car \n3.to exit");
			do {
				inputChoice = input.next();

			} while (!isInt(inputChoice));
			choiceInput = Integer.parseInt(inputChoice);
			switch (choiceInput) {
			case 1:
				ElectricCar teslaCar = new ElectricCar();
				electricCarFunctionImpl(teslaCar);
				break;
			case 2:
				PetrolCar bmwPetrolCar = new PetrolCar();
				petrolCarFunctionImpl(bmwPetrolCar);
				break;
			case 3:
				break;
			default:
				LOGGER.log(Level.WARNING, "wrong choice");
				break;
			}
		} while (choiceInput != 3);
	}

	/**
	 * This function performs various available functions of {@link ElectricCar}
	 * 
	 * @param teslaCar
	 *            an object of {@link ElectricCar}
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	private static void electricCarFunctionImpl(ElectricCar teslaCar) {
		String firstInputChoice = "";
		do {
			LOGGER.log(Level.INFO, "\n1. Moving car to Charging adapter \n2.Charge Car \n3.Run test Electric Car\n4.Back to Main Menu");
			do {
				firstInputChoice = input.next();

			} while (!isInt(firstInputChoice));
			choiceInput = Integer.parseInt(firstInputChoice);
			switch (choiceInput) {
			case 1:
				teslaCar.moveCarToChargingAdapter();
				break;
			case 2:
				teslaCar.chargeCar();
				break;
			case 3:
				teslaCar.runTestElectricCar();
				break;
			case 4:
				break;
			default:
				LOGGER.log(Level.WARNING, "wrong choice");
				break;
			}
		} while (choiceInput != 4);
	}

	/**
	 * This function performs various available functions of {@link PetrolCar}
	 * 
	 * @param bmwPetrolCar
	 *            an object of {@link PetrolCar}
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	private static void petrolCarFunctionImpl(PetrolCar bmwPetrolCar) {
		String inputChoice = "";
		do {
			LOGGER.log(Level.INFO, "\n1. Fill Fuel \n2.Run test Electric Car \n3. Back to Main Menu");
			do {
				inputChoice = input.next();

			} while (!isInt(inputChoice));
			choiceInput = Integer.parseInt(inputChoice);
			switch (choiceInput) {
			case 1:
				bmwPetrolCar.fillFuel();
				break;
			case 2:
				bmwPetrolCar.runTestPetrolCar();
				break;
			case 3:
				break;
			default:
				LOGGER.log(Level.WARNING, "wrong choice");
				break;
			}
		} while (choiceInput != 3);
	}

	/**
	 * checks whether the value is {@link Integer} or not
	 * 
	 * @param inputValue
	 *            is an {@link Object} of {@link String} that is an input from user
	 * @return if the input value is {@link Integer} or not
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	private static boolean isInt(String inputValue) {
		boolean inputIntStatus = false;
		try {
			Integer.parseInt(inputValue);
			inputIntStatus = true;
		} catch (InputMismatchException | NumberFormatException e) {
			LOGGER.log(Level.SEVERE, " input should be integer value:");
			inputIntStatus = false;
		}
		return inputIntStatus;
	}

}
