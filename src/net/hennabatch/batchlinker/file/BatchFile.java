package net.hennabatch.batchlinker.file;

import java.util.List;

import net.hennabatch.batchlinker.option.Argument;

public class BatchFile {

	private List<String> lines;

	private BatchFile(List<String> linesIn) {
		this.lines = linesIn;
	}

	public static BatchFile create(BatchPath path, Argument argo) {

	}

}
