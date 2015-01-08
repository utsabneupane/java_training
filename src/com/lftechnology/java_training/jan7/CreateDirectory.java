package com.lftechnology.java_training.jan7;

import java.io.File;
import java.util.logging.Level;

/**
 * Write a program to create a directory and check whether the directory is created.
 * 
 * @author UtsabNeupane<utsabneupane@lftechnology.com>
 * 
 */
public class CreateDirectory {
	private static TrainingConstantsUtility constantValues = new TrainingConstantsUtility();

	public static void main(String[] args) {
		// create directory
		createDir();

	}

	/**
	 * it creates a directory and checks whether it exists or not
	 */
	private static void createDir() {
		String path = "thridrpogramdirectory";
		File newDir = new File(path);
		// check if the file already exist or not
		try {
			if (newDir.exists()) {
				throw new Exception("directory already exists");

			} else {
				newDir.mkdir();
				constantValues.LOGGER.info("New directory created");
			}

		} catch (SecurityException e) {
			constantValues.LOGGER.log(Level.INFO, "error eccoured while creating directory", e);
		} catch (Exception e) {
			constantValues.LOGGER.log(Level.INFO, "", e);
		}
	}

}
