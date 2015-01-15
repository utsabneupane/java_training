package com.lftechnology.java_training.realworldproblem;

import java.util.logging.Level;
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
public class PetrolCar implements Car {
	private static Logger LOGGER = Logger.getLogger(PetrolCar.class.getName());

	public PetrolCar() {
		LOGGER.log(Level.INFO, "\n*******Simulation of Petrol Car begins:*******\n");
	}

	/**
	 * This method will simulate fuel filling process of {@link PetrolCar}
	 * 
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	public void fillFuel() {
		LOGGER.log(Level.INFO, "\n*******Filling petrol in  Petrol car*******\n");
	}

	/**
	 * This method will simulate running test of {@link PetrolCar}
	 * 
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	public void runTestPetrolCar() {
		LOGGER.log(Level.INFO, "\n*******Running test of Petrol car *******\n");
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
