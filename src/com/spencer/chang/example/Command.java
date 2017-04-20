package com.spencer.chang.example;

import com.spencer.chang.ExecOSCommand;
import com.spencer.chang.OS;
import com.spencer.chang.ProcessManger;
import com.spencer.chang.ProcessWarpper;

public class Command {
	public static void main(String[] args) {
		ProcessManger pm = new ProcessManger();
		// "ifconfig en0 |awk -F '[ :]+' 'NR==4 {print $2}'";
		// "ps -ef | grep java";
		ProcessWarpper pw = new ProcessWarpper("ifconfig en0 |awk -F '[ :]+' 'NR==4 {print $2}'", OS.MAC);
		StringBuffer result = new ExecOSCommand().getCommandResult(pw, pm);
		System.out.println(result);
	}
}
