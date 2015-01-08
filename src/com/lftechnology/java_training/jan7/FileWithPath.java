package com.lftechnology.java_training.jan7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

public class FileWithPath {

	private static final Logger LOGGER = Logger.getLogger(FileCreator.class.getName());

	public static void main(String[] args) {
		String fileName = "/home/codehome/repo/files/firstprogramfile.txt";
		Path path = Paths.get(fileName);
		// File newFile = new File(path);
		// check if the file already exist or not
		try {
			if (Files.exists(path)) {
				throw new Exception("file already exists");
			} else {
				Files.createFile(path);
				LOGGER.info("New file created");
			}

		} catch (IOException e) {
			LOGGER.info("error eccoured" + e);
		} catch (Exception e) {
			LOGGER.info("" + e);
		}

	}

}
