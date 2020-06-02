package net.hennabatch.batchlinker.option;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

	public static EnumOption bySwitch(String str) {
		List<EnumOption> type = Stream.of(EnumOption.values()).filter(x->x.getOptionSwitch().equals(str)).collect(Collectors.toList());
		return !type.isEmpty() ? type.get(0) : null;
	}

}
