package net.hennabatch.batchlinker.option;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.hennabatch.batchlinker.util.Reference;

public class Option {

	private EnumOption option;
	private List<String> args;

	private Option(EnumOption optionIn, List<String> argsIn) {
		this.option = optionIn;
		this.args = argsIn;
	}

	public EnumOption getOption() {
		return option;
	}

	public List<String> getArgs(){
		return args;
	}

	public static List<Option> readOptions(String[] args) throws IllegalArgumentException{
		List<Option> options = new ArrayList<Option>();
		int index = 0;

		while(index < args.length) {
			if(args[index].indexOf(Reference.OPTION_PREFIX) == 0) {
				EnumOption eOption = EnumOption.bySwitch(args[index].substring(0, 1));
				if(eOption == null) throw new IllegalArgumentException("show help");
				index++;
				if(index + eOption.getUseArgs() > args.length) throw new IllegalArgumentException("show help");
				List<String> optionArgs = new ArrayList<String>(Arrays.asList(Arrays.copyOfRange(args, index, index + eOption.getUseArgs())));
				options.add(new Option(eOption, optionArgs));
				index += eOption.getUseArgs() - 1;
			}
			index++;
		}
		return options;
	}


}
