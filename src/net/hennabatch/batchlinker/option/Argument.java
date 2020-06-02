package net.hennabatch.batchlinker.option;

import java.util.List;

public class Argument {

	private List<Option> options;

	private Argument(String[] argsIn) {

	}

	public Argument create(String[] argsIn) {
		return new Argument(argsIn);
	}
}
