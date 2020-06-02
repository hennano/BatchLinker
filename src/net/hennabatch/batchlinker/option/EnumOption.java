package net.hennabatch.batchlinker.option;

public enum EnumOption {

	OUTPUT("o", 1),
	CHARSET("c", 1);

	private String optionSwitch;
	private int useArgs;

	private EnumOption(String optionSwitchIn, int useArgsIn) {
		this.optionSwitch = optionSwitchIn;
		this.useArgs = useArgsIn;
	}

	public String getOptionSwitch() {
		return optionSwitch;
	}

	public int getUseArgs() {
		return useArgs;
	}

}
