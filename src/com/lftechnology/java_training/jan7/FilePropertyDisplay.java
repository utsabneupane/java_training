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
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a file name with its extension ");
		String fileName = TrainingConstants.PATH + input.next();
		File myFile = FileUtility.createFile(fileName);
		// check whether a file is directory or not
		String checkFileType = "";
		if (myFile.isDirectory()) {
			checkFileType = "this file is a directory";
		} else {
			checkFileType = "this file is not a directory";
		}
		// check whether a file exists or not
		String checkFileExistence = "";
		if (myFile.exists()) {
			checkFileExistence = "file exists";
		} else {
			checkFileExistence = "file doesnt exist";
		}
		String absolutePath = myFile.getAbsolutePath();
		// display file properties
		LOGGER.log(Level.INFO, "Following are the property of file:\n1.{0} \n2.{1} \n3. its absoulte path is: {2} ", new Object[] {
				checkFileExistence, checkFileType, absolutePath });
	}
}
