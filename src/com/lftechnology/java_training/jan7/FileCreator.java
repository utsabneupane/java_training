package com.lftechnology.java_training.jan7;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

/**
 * Write a program to create a text file in the path firstprogramfile.txt and check whether that file is exists. Using the command exists(),
 * isDirectory(), isFile(), getName() and getAbsolutePath().
 * 
 * @author UtsabNeupane<utsabneupane@lftechnology.com>
 * 
 */
public class FileCreator {
	private static TrainingConstantsUtility constantValues = new TrainingConstantsUtility();

	public static void main(String[] args) {
		String path = "firstprogramfile.txt";
		File newFile = new File(path);
		createFile(newFile);
		constantValues.LOGGER.log(Level.INFO, "Following are the property of file:\n1.{0} \n2.{1} \n3.{2} \n4. its absoulte path is: {3} ",
				new Object[] { checkFileExistence(newFile), isFileADirectory(newFile), isAFile(newFile), absolutePath(newFile) });

	}

	/**
	 * creates new file and checks if it already exists or not
	 * 
	 * @param newFile
	 */
	private static void createFile(File newFile) {
		// check if the file already exist or not
		try {
			if (newFile.exists()) {
				throw new Exception("file already exists");
			} else {
				newFile.createNewFile();
				constantValues.LOGGER.info("New file created");
			}

		} catch (IOException e) {
			constantValues.LOGGER.log(Level.INFO, "error eccoured {0}", e);
		} catch (Exception e) {
			constantValues.LOGGER.log(Level.INFO, "{0}", e);
		}
	}

	/**
	 * get absolute path of a file
	 * 
	 * @param newFile
	 *            an object of {@link File}
	 * @return absolutepath of a file
	 */
	private static String absolutePath(File newFile) {
		// get absolute path
		return newFile.getAbsolutePath();
	}

	/**
	 * check whether file is file or not
	 * 
	 * @param newFile
	 *            an object of {@link File}
	 * @return <p>
	 *         this file is a file
	 *         <p>
	 *         if the file is file else
	 *         <p>
	 *         this file is a file
	 *         <p>
	 */
	private static String isAFile(File newFile) {
		boolean isFileAFile = newFile.isFile();
		if (isFileAFile) {
			return ("this is a file");
		} else {
			return ("this is not a file");
		}
	}

	/**
	 * check whether file is directory or not
	 * 
	 * @param newFile
	 *            an object of {@link File}
	 * @return <p>
	 *         this file is a directory
	 *         <p>
	 *         if file is directory elsse
	 *         <p>
	 *         this file is a directory
	 *         <p>
	 * 
	 */
	private static String isFileADirectory(File newFile) {
		boolean isFileDirectory = newFile.isDirectory();
		if (isFileDirectory) {
			return ("this file is a directory");
		} else {
			return ("this file is not a directory");
		}
	}

	/**
	 * checks if file exist or not
	 * 
	 * @param newFile
	 *            an object of {@link File}
	 * @return <p>
	 *         file exists
	 *         <p>
	 *         if file exist else
	 *         <p>
	 *         file doesnt exists
	 *         <p>
	 */
	private static String checkFileExistence(File newFile) {
		boolean fileExist = newFile.exists();
		if (fileExist) {
			return ("file exists");
		} else {
			return ("file doesnt exist");
		}
	}
}
