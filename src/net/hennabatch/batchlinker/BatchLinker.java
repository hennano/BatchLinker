package net.hennabatch.batchlinker;

import java.util.ArrayList;
import java.util.List;

import net.hennabatch.batchlinker.file.BatchPath;
import net.hennabatch.batchlinker.option.Argument;

public class BatchLinker {

	public static void main(String[] args) {
		try {
			Argument arg = Argument.create(args);

			List<BatchPath> pathQueue = new ArrayList<BatchPath>();
			List<BatchPath> batchPaths = new ArrayList<BatchPath>();

			for(BatchPath batchPath: pathQueue) {


				batchPaths.add(batchPath);
			}










		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
