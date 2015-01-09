package com.lftechnology.java_training.jan7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileUtility {

	private static Scanner input = new Scanner(System.in);
	private static final Logger LOGGER = Logger.getLogger(FileUtility.class.getName());

	/**
	 * creates new file and checks if it already exists or not
	 * 
	 * @param newFile
	 *            an object of {@link File}
	 */
	public File createFile(String fileName) {
		File newFile = null;
		// check if the file already exist or not
		try {
			newFile = new File(fileName);
			if (newFile.exists()) {
				LOGGER.log(Level.WARNING, "file already exists");
			} else {
				newFile.createNewFile();
				LOGGER.log(Level.INFO, "New file created");
			}
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "error eccoured {0}", e);
		}
		return newFile;
	}

	/**
	 * it creates a directory and checks whether it exists or not
	 */
	public File createDir(String dirName) {
		File newDir = new File(dirName);
		// check if the file already exist or not
		try {
			if (newDir.exists()) {
				LOGGER.log(Level.WARNING, "directory already exists");

			} else {
				newDir.mkdir();
				LOGGER.log(Level.INFO, "New directory created");
			}
			return newDir;
		} catch (SecurityException e) {
			LOGGER.log(Level.SEVERE, "error eccoured while creating directory {0}", e);
			return null;
		}
	}

	/**
	 * ask user to enter new name to rename the old filename
	 * 
	 * @param oldFile
	 *            an object of {@link File}
	 * @return {@link File} with renamed filename
	 */
	public File renameFile(File oldFile, String newName) {
		String extension = "";
		// get extension of file
		int charLocation = oldFile.getPath().lastIndexOf('.');
		if (charLocation > 0) {
			extension = oldFile.getPath().substring(charLocation + 1);
		}
		File newFile = new File(newName + "." + extension);
		try {
			newFile.createNewFile();
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "{0}", e);
		}
		boolean renamed = oldFile.renameTo(newFile);
		if (renamed) {
			LOGGER.log(Level.INFO, "{0}  renamed to {1}", new Object[] { oldFile, newFile });
		} else {
			LOGGER.log(Level.INFO, "{0} cant be renamed to {1}", new Object[] { oldFile, newFile });
		}
		return newFile;
	}

	/**
	 * ask user if he want to delete file or not and delete file on user confirmation
	 * 
	 * @param newFile
	 *            an object of {@link File}
	 */
	public void deleteFile(File newFile) {
		boolean deleteStatus = true;
		// ask user to delete file or not
		LOGGER.info("do you want to delete file??[y/n]");
		String inputChoice = input.next();
		if (inputChoice.equalsIgnoreCase(TrainingConstantsUtility.Y) || inputChoice.equalsIgnoreCase(TrainingConstantsUtility.YES)) {
			deleteStatus = newFile.delete();
			if (deleteStatus) {
				LOGGER.info("File deleted");
			} else {
				LOGGER.info("File cannot deleted");
			}
			// check status of file
			LOGGER.log(Level.INFO, "Absolute Path: {0}", newFile.getAbsoluteFile());
			LOGGER.log(Level.INFO, "File exists: {0}", newFile.exists());
		}
	}

}
