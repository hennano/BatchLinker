package net.hennabatch.batchlinker.option;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import net.hennabatch.batchlinker.util.FileUtils;

public class Argument {

	private Path mainFileRealPath;
	private List<Option> options;

	private Argument(Path mainFileAbsolutePathIn, List<Option> optionsIn) {
		this.mainFileRealPath = mainFileAbsolutePathIn;
		this.options = optionsIn;
	}

	public static Argument create(String[] args) throws IllegalArgumentException, IOException{
		return new Argument(FileUtils.getRealBatchPath(Paths.get(args[0])), Option.readOptions(Arrays.copyOfRange(args, 1, args.length)));
	}

	public Path getMainFileRealPath() {
		return mainFileRealPath;
	}

	public List<Option> getOptions() {
		return options;
	}

	public List<String> getOptionArgs(EnumOption option){
		List<Option> opt = options.stream().filter(x -> x.getOption().equals(option)).collect(Collectors.toList());
		return opt.size() == 1 ? opt.get(0).getArgs() : null;
	}
}
