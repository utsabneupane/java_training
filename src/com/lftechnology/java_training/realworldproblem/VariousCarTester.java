package com.lftechnology.java_training.realworldproblem;

import java.util.InputMismatchException;
import java.util.Scanner;
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
		ElectricCar teslaCar = new ElectricCar();
		PetrolCar bmwPetrolCar = new PetrolCar();
		do {
			LOGGER.info("\n****Simulation of Cars: ****** \n1.Simulation of Electric Car \n2. Simulation of Petrol Car \n3.to exit");
			do {
				inputChoice = input.next();

			} while (!isInt(inputChoice));
			choiceInput = Integer.parseInt(inputChoice);
			switch (choiceInput) {
			case 1:
				LOGGER.info("\n*******Simulation of Petrol Car begins:*******\n");
				electricCarFunctionImpl(teslaCar);
				break;
			case 2:
				LOGGER.info("\n****Simulation of Electric Car begins:******\n");
				petrolCarFunctionImpl(bmwPetrolCar);
				break;
			case 3:
				break;
			default:
				LOGGER.warning("wrong choice");
				break;
			}
		} while (choiceInput != 3);
		choiceInput = 0;
	}

	/**
	 * This function performs various available functions of {@link ElectricCar}
	 * 
	 * @param teslaCar
	 *            an object of {@link ElectricCar}
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	private static void electricCarFunctionImpl(ElectricCar teslaCar) {
		String inputChoice = "";
		do {
			LOGGER.info("\n1. Moving car to Charging adapter \n2.Charge Car \n3.Run test Electric Car\n4.Back to Main Menu");
			do {
				inputChoice = input.next();

			} while (!isInt(inputChoice));
			choiceInput = Integer.parseInt(inputChoice);
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
				LOGGER.warning("wrong choice");
				break;
			}
		} while (choiceInput != 4);
		choiceInput = 0;
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
			LOGGER.warning("\n1. Fill Fuel \n2.Run test Electric Car \n3. Back to Main Menu");
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
				LOGGER.warning("wrong choice");
				break;
			}
		} while (choiceInput != 3);
		choiceInput = 0;
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
			LOGGER.severe(" input should be integer value:");
			inputIntStatus = false;
		}
		return inputIntStatus;
	}

}
