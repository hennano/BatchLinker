package net.hennabatch.batchlinker.file;

import java.util.Arrays;
import java.util.List;

public class Argument {

	private List<String> args;

	private Argument(String... argsIn) {
		this.args = Arrays.asList(argsIn);
	}

	public Argument create(String... argsIn) {
		return new Argument(argsIn);
	}

	private enum Option{

		OUTPUT("o"),
		CHARSET("c");


		private String argSwitch;

		private Option(String argSwitchIn) {
			this.argSwitch = argSwitchIn;
		}
	}

}
