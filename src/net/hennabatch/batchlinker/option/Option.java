package net.hennabatch.batchlinker.option;

import java.util.ArrayList;
import java.util.List;

public class Option {

	private EnumOption option;
	private List<String> args;

	private Option(EnumOption optionIn, List<String> argsIn) {
		this.option = optionIn;
		this.args = argsIn;
	}

	public static List<Option> readOptions(String[] args){
		List<Option> options = new ArrayList<Options>();

		for(String str: args) {

		}
	}


}
