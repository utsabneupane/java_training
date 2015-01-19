package com.lftechnology.java_training.realworldproblem2;

import java.util.logging.Logger;

/**
 * THis class inherit {@link Car} class feature and provide following simulation process for Electric Cars only: Simulation process:
 * <ul>
 * <li>a. Move car to charging adapter</li>
 * <li>b. Charge the car</li>
 * <li>c. Run test the Tesla car.</li>
 * </ul>
 * 
 * @author Utsab Neupane<utsabneupane@lftechnology.com>
 * 
 */
public class ElectricCar extends Car {
	private static Logger LOGGER = Logger.getLogger(ElectricCar.class.getName());

	public ElectricCar() {
		LOGGER.info("\n*******Simulating Electric car*******\n");
	}

	/**
	 * This method will simulate {@link ElectricCar} moving to Charging Adapter process
	 * 
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	private void moveCarToChargingAdapter() {
		LOGGER.info("\n#######Moving car to charging adapter#######\n");
	}

	/**
	 * This method will simulate charging {@link ElectricCar} process
	 * 
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	private void chargeCar() {
		LOGGER.info("\n#######Charging car#######\n");
	}

	/**
	 * This method will simulate running test of {@link ElectricCar} process
	 * 
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	private void runTest() {
		super.runTest("Electric Car");
	}

	@Override
	protected void functionSimulaton() {
		moveCarToChargingAdapter();
		chargeCar();
		runTest();

	}

}