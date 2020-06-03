package net.hennabatch.batchlinker.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {

	public static String extractionExtension(Path path) {
		String fileName = path.getFileName().toString();
		if(!fileName.contains(".")) return "";
		return fileName.substring(fileName.lastIndexOf('.') + 1, fileName.length());
	}

	public static String removeExtension(Path path) {
		String fileName = path.getFileName().toString();
		if(!fileName.contains(".")) return fileName;
		return fileName.substring(0, fileName.lastIndexOf('.'));
	}

	public static Path getRealBatchPath(Path path) throws IOException{
		if(path.getFileName().toString().contains(".")) {
			if(extractionExtension(path).equals("cmd") || extractionExtension(path).equals("bat")) {
				return path.toRealPath();
			}
			throw new IOException(path.toString() + "は.cmd/.batファイルではありません");
		}
		if(Files.exists(Paths.get(path.toString() + ".cmd"))) return Paths.get(path.toString() + ".cmd").toRealPath();
		if(Files.exists(Paths.get(path.toString() + ".bat"))) return Paths.get(path.toString() + ".bat").toRealPath();
		throw new FileNotFoundException(path.toString() + ".cmd/.batは存在しません");
	}
}
