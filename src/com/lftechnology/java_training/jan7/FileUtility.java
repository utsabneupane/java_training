package com.lftechnology.java_training.jan7;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * it contains function that creates,delete,rename files and create directory
 * 
 * @author UtsabNeupane<utsabneupane@lftechnology.com>
 * 
 */
public class FileUtility {
	private static final Logger LOGGER = Logger.getLogger(FileUtility.class.getName());

	/**
	 * creates new file and checks if it already exists or not
	 * 
	 * @param fileName
	 *            is a name of file that user wants to create and cannot be null
	 * @return newFile an object of {@link File}
	 * @author UtsabNeupane<utsabneupane@lftechnology.com>
	 */
	public static File createFile(String fileName) {
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
	 * 
	 * @param dirName
	 *            directory name to create a directory on that name and cannot be null
	 * 
	 * @return newDirectory an object of {@link File} if new directory created, else it will return null
	 * @author UtsabNeupane<utsabneupane@lftechnology.com>
	 */
	public static File createDir(String dirName) {
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
	 *            an object of {@link File} that is to be renamed and cannot be null
	 * @param newName
	 *            to rename an old file which cannot be null and shouldnot have extension
	 * 
	 * @return {@link File} with renamed filename
	 * @author UtsabNeupane<utsabneupane@lftechnology.com>
	 */
	public static File renameFile(File oldFile, String newName) {
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
	 * Ask user if he want to delete file or not and delete file on user confirmation
	 * 
	 * @param newFile
	 *            an object of {@link File} and cannot be null
	 * @param inputChoice
	 *            of whether user wants to delete file or not eg: Y or YES to delete
	 * @author UtsabNeupane<utsabneupane@lftechnology.com>
	 */
	public static void deleteFile(File newFile, String inputChoice) {
		boolean deleteStatus = false;
		if (inputChoice.equalsIgnoreCase(TrainingConstants.Y) || inputChoice.equalsIgnoreCase(TrainingConstants.YES)) {
			deleteStatus = newFile.delete();
		}
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
