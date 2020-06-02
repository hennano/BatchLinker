package net.hennabatch.batchlinker.util;

import java.nio.file.Path;

public class FileUtils {

	public static String extractionExtension(Path path) {
		String fileName = path.getFileName().toString();
		if(!fileName.contains(".")) return "";
		return fileName.substring(fileName.lastIndexOf('.') + 1, fileName.length());
	}

	public static String removeExtension(Path path) {
		String fileName = path.getFileName().toString();
		if(!fileName.contains(".")) return "";
		return fileName.substring(0, fileName.lastIndexOf('.'));
	}

}
