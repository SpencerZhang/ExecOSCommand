package com.spencer.chang;

public class ParameterProcess {
	public Process parameterProcess(OS OSTypes, ProcessWarpper command, ProcessManger pm) {
		Process pro = null;
		if (OSTypes == OS.UNIX || OSTypes == OS.LINUX || OSTypes == OS.MAC) {
			String[] commands = { "/bin/sh", "-c", command.getCommand() };
			pro = pm.getProcess(commands);
		} else if (OSTypes == OS.WINDOWS) {
			String[] commands = { "cmd /C", command.getCommand() };
			pro = pm.getProcess(commands);
		} else {
			String commands = command.getCommand();
			pro = pm.getProcess(commands);
		}
		return pro;
	}
}
