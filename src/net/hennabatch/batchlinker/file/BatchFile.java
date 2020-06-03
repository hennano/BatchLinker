package net.hennabatch.batchlinker.file;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

import net.hennabatch.batchlinker.option.Argument;
import net.hennabatch.batchlinker.option.EnumOption;

public class BatchFile {

	private List<String> lines;

	private BatchFile(List<String> linesIn) {
		this.lines = linesIn;
	}

	public static BatchFile create(BatchPath path, Argument arg) {
		try {
			return new BatchFile(Files.readAllLines(path.getRealPath(), Charset.forName(arg.getOptionArgs(EnumOption.CHARSET) != null ? arg.getOptionArgs(EnumOption.CHARSET).get(0) : System.getProperty("file.encoding"))));
		} catch (IOException e) {
			return null;
		}
	}

	public List<String> getLines() {
		return lines;
	}
	
	public List<BatchPath> getCallPaths(){
		
	}

}
