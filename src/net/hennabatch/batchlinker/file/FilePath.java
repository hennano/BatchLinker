package net.hennabatch.batchlinker.file;

import java.nio.file.Path;

public class FilePath{

	private Path absolutePath;

	public FilePath(Path pathIn) {
		this.absolutePath = pathIn.normalize().toAbsolutePath();
	}

	public Path getAbsolutePath() {
		return absolutePath;
	}

}
