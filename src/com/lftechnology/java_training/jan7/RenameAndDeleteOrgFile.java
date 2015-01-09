package com.lftechnology.java_training.jan7;

import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Write a program to rename the given file, after renaming the file delete the renamed file. (Accept the file name using command line
 * arguments.)
 * 
 * @author UtsabNeupane<utsabneupane@lftechnology.com>
 * 
 */
public class RenameAndDeleteOrgFile {

	private static final Logger LOGGER = Logger.getLogger(RenameAndDeleteOrgFile.class.getName());
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String fileName = getFileNameFromUser("New fileName");
		File myFile = FileUtility.createFile(fileName);
		if (myFile != null) {
			String newFileName = getFileNameFromUser("new FileName to rename");
			myFile = FileUtility.renameFile(myFile, newFileName);
			System.out.println("do you want to delete file??[y/n]");
			String inputChoice = input.next();
			FileUtility.deleteFile(myFile, inputChoice);
		}
	}

	/**
	 * This function ask user to enter name of file
	 * 
	 * @param fileNamefor
	 *            {@link String} that represent for what purpose the filename is asked to user for eg: for new name or to rename
	 * @return file Name taken from user
	 * @author UtsabNeupane<utsabneupane@lftechnology.com>
	 */
	private static String getFileNameFromUser(String fileNameFor) {
		LOGGER.log(Level.INFO, "Enter a file name {0}", fileNameFor);
		return TrainingConstants.PATH + input.next();
	}
}
