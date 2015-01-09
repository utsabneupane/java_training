package com.lftechnology.java_training.jan7;

import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Write a program to create a directory and check whether the directory is created.
 * 
 * @author UtsabNeupane<utsabneupane@lftechnology.com>
 * 
 */
public class CreateDirectory {
	private static final Logger LOGGER = Logger.getLogger(CreateDirectory.class.getName());
	private static FileUtility fileUtility = new FileUtility();
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String dirName = getDirName();
		File newDir = fileUtility.createDir(dirName);
		LOGGER.log(Level.INFO, "{0}", newDir.getAbsolutePath());

	}

	/**
	 * get name of directory from user
	 * 
	 * @return name of directory
	 */
	public static String getDirName() {
		LOGGER.log(Level.INFO, "Enter name of directory: ");
		return TrainingConstantsUtility.path + input.next();
	}

}
