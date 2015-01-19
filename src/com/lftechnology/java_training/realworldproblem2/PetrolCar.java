package com.lftechnology.java_training.realworldproblem2;

import java.util.logging.Logger;

/**
 * THis class inherit {@link Car} class feature and provide following simulation process for Petrol Cars only:
 * <ul>
 * <li>a. Fill the fuel</li>
 * <li>b. Run test the petrol cars.</li>
 * </ul>
 * 
 * @author Utsab Neupane<utsabneupane@lftechnology.com>
 * 
 */
public class PetrolCar extends Car {
	private static Logger LOGGER = Logger.getLogger(PetrolCar.class.getName());

	public PetrolCar() {
		LOGGER.info("\n*******Simulating Petrol car*******\n");
	}

	/**
	 * This method will simulate fuel filling process of {@link PetrolCar}
	 * 
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	private void fillFuel() {
		LOGGER.info("\n#######Filling petrol in  Petrol car#######\n");
	}

	private void runTest() {
		super.runTest("Petrol Car");
	}

	@Override
	protected void functionSimulaton() {
		fillFuel();
		runTest();

	}

}
