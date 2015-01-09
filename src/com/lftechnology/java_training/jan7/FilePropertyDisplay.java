package com.lftechnology.java_training.jan7;

import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Write a program to create a text file in the path firstprogramfile.txt and check whether that file is exists. Using the command exists(),
 * isDirectory(), isFile(), getName() and getAbsolutePath().
 * 
 * @author UtsabNeupane<utsabneupane@lftechnology.com>
 * 
 */
public class FilePropertyDisplay {
	private static final Logger LOGGER = Logger.getLogger(FilePropertyDisplay.class.getName());
	private static FileUtility fileUtility = new FileUtility();
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String fileName = getFileNameFromUser();
		File myFile = fileUtility.createFile(fileName);
		displayPropertyOfFile(myFile);

	}

	/**
	 * display the output like following: Following are the property of file:
	 * <ol>
	 * <li>file exists</li>
	 * <li>this file is not a directory</li>
	 * <li>its absoulte path is: /home/utsabn34/codehome/repo/files/abc.txt</li>
	 * </ol>
	 * 
	 * @param newFile
	 *            an object of {@link File}
	 */
	private static void displayPropertyOfFile(File newFile) {
		String checkFileExistence = checkFileExistence(newFile);
		String isFileADirectory = isFileADirectory(newFile);
		String absolutePath = newFile.getAbsolutePath();
		LOGGER.log(Level.INFO, "Following are the property of file:\n1.{0} \n2.{1} \n3. its absoulte path is: {2} ", new Object[] {
				checkFileExistence, isFileADirectory, absolutePath });
	}

	/**
	 * check whether file is directory or not
	 * 
	 * @param newFile
	 *            an object of {@link File}
	 * @return <p>
	 *         this file is a directory
	 *         </p>
	 *         if file is directory elsse
	 *         <p>
	 *         this file is a directory
	 *         </p>
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
	 *         </p>
	 *         if file exist else
	 *         <p>
	 *         file doesnt exists
	 *         </p>
	 */
	private static String checkFileExistence(File newFile) {
		boolean fileExist = newFile.exists();
		if (fileExist) {
			return ("file exists");
		} else {
			return ("file doesnt exist");
		}
	}

	/**
	 * @parameter a string that represent for what purpose the filename is asked to user for eg: for new name or to rename
	 * @return file Name from user
	 */
	private static String getFileNameFromUser() {
		// ask user to enter new name
		LOGGER.log(Level.INFO, "Enter a file name ");
		return TrainingConstantsUtility.path + input.next();

	}
}
