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
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter name of directory: ");
		String dirName = TrainingConstants.PATH + input.next();
		File newDir = FileUtility.createDir(dirName);
		LOGGER.log(Level.INFO, "{0}", newDir.getAbsolutePath());
	}

}
