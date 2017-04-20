package com.spencer.chang;

import java.io.IOException;

public class ProcessManger {

	public Process getProcess(String... commands) {
		Process pro = null;
		ProcessBuilder pb = new ProcessBuilder(commands);
		try {
			pro = pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pro;
	}

	public Status getStatus(Process pro) {
		if (pro == null) {
			return Status.NOT_YET_EXCECUTED;
		} else {
			if (pro.exitValue() == 0) {
				return Status.COMPLETED_NORMAL;
			} else {
				return Status.COMPLETED_ERROR;
			}
		}
	}
}
