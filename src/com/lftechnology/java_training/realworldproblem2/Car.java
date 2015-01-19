package com.lftechnology.java_training.realworldproblem2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class contains the basic feature and functions of {@link Car} and is an abstract class
 * 
 * @author Utsab Neupane<utsabneupane@lftechnology.com>
 * 
 */
public abstract class Car {
	private static Logger LOGGER = Logger.getLogger(PetrolCar.class.getName());

	/**
	 * This method provide navigation feature for a {@link Car}
	 * 
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	protected void navigate() {
		LOGGER.info("navigation system process goes here");
	}

	/**
	 * This method gives Steering feature for a {@link Car}
	 * 
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	protected void steering() {
		LOGGER.info("steering mechanism goes here");

	}

	/**
	 * It runs the testing of {@link Car}
	 * 
	 * @param carType
	 *            an object of {@link String} that represents what type of car it is
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	protected void runTest(String carType) {
		LOGGER.log(Level.INFO, "\n#######running test drive of {0}#######\n", carType);
	}

	/**
	 * This function will simulation all function of Car
	 * 
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	protected abstract void functionSimulaton();

}
