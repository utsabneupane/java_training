package com.lftechnology.java_training.realworldproblem;

/**
 * This class contains the basic feature of Car and is an abstract class
 * 
 * @author Utsab Neupane<utsabneupane@lftechnology.com>
 * 
 */
public abstract class Car {
	private static final int NO_OF_WHEELS = 4;

	/**
	 * This method provides total number of wheel in a {@link Car}
	 * 
	 * @return total {@link Integer} value as <code>NO_OF_WHEELS</code>
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	protected int noOfWheel() {
		return NO_OF_WHEELS;
	}

	/**
	 * This method provide navigation feature for a {@link Car}
	 * 
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	protected abstract void navigate();

	/**
	 * This method gives Steering feature for a {@link Car}
	 * 
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	protected abstract void steering();
}
