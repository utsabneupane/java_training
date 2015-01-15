package com.lftechnology.java_training.realworldproblem;

import java.util.logging.Level;
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
public class ElectricCar implements Car {
	private static Logger LOGGER = Logger.getLogger(ElectricCar.class.getName());

	public ElectricCar() {
		LOGGER.log(Level.INFO, "\n****Simulation of Electric Car begins:******\n");
	}

	/**
	 * This method will simulate {@link ElectricCar} moving to Charging Adapter process
	 * 
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	public void moveCarToChargingAdapter() {
		LOGGER.log(Level.INFO, "\n*****Moving car to charging adapter*******\n");
	}

	/**
	 * This method will simulate charging {@link ElectricCar} process
	 * 
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	public void chargeCar() {
		LOGGER.log(Level.INFO, "\n*******Charging car*******\n");
	}

	/**
	 * This method will simulate running test of {@link ElectricCar} process
	 * 
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	public void runTestElectricCar() {
		LOGGER.log(Level.INFO, "\n*******running Test of Electric car*******\n");
	}

	@Override
	public void navigate() {
		// TODO Auto-generated method stub
	}

	@Override
	public void steering() {
		// TODO Auto-generated method stub
	}

	@Override
	public void noOfWheel() {
		// TODO Auto-generated method stub
	}

}
