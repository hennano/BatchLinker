package net.hennabatch.batchlinker.file;

import java.io.IOException;
import java.nio.file.Path;

import net.hennabatch.batchlinker.util.FileUtils;

public class BatchPath {

	private Path realPath;

	private BatchPath(Path pathIn) {
		this.realPath = pathIn;
	}

	public Path getRealPath() {
		return realPath;
	}

	public static BatchPath create(Path path) {
		Path batchPath;
		try {
			batchPath = FileUtils.getRealBatchPath(path);
		}catch(IOException e) {
			return null;
		}
		return new BatchPath(batchPath);
	}

}
