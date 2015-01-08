package com.lftechnology.java_training.jan7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Write a program to rename the given file, after renaming the file delete the renamed file. (Accept the file name using command line
 * arguments.)
 * 
 * @author UtsabNeupane<utsabneupane@lftechnology.com>
 * 
 */
public class RenameAndDeleteOrgFile {
	private static Scanner input = new Scanner(System.in);
	private static TrainingConstantsUtility constantValues = new TrainingConstantsUtility();

	public static void main(String[] args) {
		String path = "secondprogramfile.txt";
		File newFile = new File(path);
		createFile(newFile);
		newFile = renameFile(newFile);
		deleteFile(newFile);
	}

	/**
	 * creates new file and checks if it already exists or not
	 * 
	 * @param newFile
	 */
	private static void createFile(File newFile) {
		// check if the file already exist or not
		try {
			if (!newFile.exists()) {
				newFile.createNewFile();
				constantValues.LOGGER.info("New file created");
			} else {
				constantValues.LOGGER.info("file already exists");
			}

		} catch (IOException e) {
			constantValues.LOGGER.info("error eccoured" + e);
		}
	}

	/**
	 * ask user to enter new name to rename the old filename
	 * 
	 * @param oldFile
	 *            an object of {@link File}
	 * @return fil with renamed filename
	 */
	private static File renameFile(File oldFile) {
		String newName = "";
		String extension = "";
		// get extension of file
		int charLocation = oldFile.getPath().lastIndexOf('.');
		if (charLocation > 0) {
			extension = oldFile.getPath().substring(charLocation + 1);
		}
		// ask user to enter new name
		constantValues.LOGGER.info("Enter a file name to rename: ");
		newName = input.next();
		File newFile = new File(newName + "." + extension);
		try {
			newFile.createNewFile();
		} catch (IOException e) {
			constantValues.LOGGER.info("" + e);
		}
		boolean renamed = oldFile.renameTo(newFile);
		if (renamed) {
			constantValues.LOGGER.info(oldFile + " renamed to " + newFile);
		} else {
			constantValues.LOGGER.info(oldFile.getName() + " renamed to " + newFile.getName());
		}
		return newFile;
	}

	/**
	 * ask user if he want to delete file or not and delete file on user confirmation
	 * 
	 * @param newFile
	 *            an object of {@link File}
	 */
	private static void deleteFile(File newFile) {
		String inputChoice;
		boolean deleteStatus = true;
		// ask user to delete file or not
		constantValues.LOGGER.info("do you want to delete file??[y/n]");
		inputChoice = input.next();
		if (inputChoice.equalsIgnoreCase(constantValues.Y) || inputChoice.equalsIgnoreCase(constantValues.YES)) {
			deleteStatus = newFile.delete();
			if (deleteStatus) {
				constantValues.LOGGER.info("File deleted");
			} else {
				constantValues.LOGGER.info("File cannot deleted");
			}
			// check status of file
			printFileDetails(newFile);
		}
	}

	/**
	 * print the absolute path and file existence of file
	 * 
	 * @param fileName
	 *            an object of {@link File}
	 */
	public static void printFileDetails(File fileName) {
		constantValues.LOGGER.info("Absolute Path: " + fileName.getAbsoluteFile());
		constantValues.LOGGER.info("File exists:  " + fileName.exists());
	}

}
