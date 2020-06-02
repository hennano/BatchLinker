package net.hennabatch.batchlinker.option;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Argument {

	private Path mainFileAbsolutePath;
	private List<Option> options;

	private Argument(Path mainFileAbsolutePathIn, List<Option> optionsIn) {
		this.mainFileAbsolutePath = mainFileAbsolutePathIn;
		this.options = optionsIn;
	}

	public static Argument create(String[] args) throws IllegalArgumentException, IOException{
		return new Argument(Paths.get(args[0]).normalize().toAbsolutePath(), Option.readOptions(Arrays.copyOfRange(args, 1, args.length)));
	}

	public Path getMainFileAbsolutePath() {
		return mainFileAbsolutePath;
	}

	public List<Option> getOptions() {
		return options;
	}
}
