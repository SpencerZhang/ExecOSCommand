package com.spencer.chang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ExecOSCommand {
	private static StringBuilder result;

	public static StringBuilder getCommandResult(ArrayList<String> cmds) {
		result = new StringBuilder();
		Process pro;
		ProcessBuilder pb = new ProcessBuilder(cmds);
		try {
			pro = pb.start();
			pro.waitFor();
			InputStream in = pro.getInputStream();
			BufferedReader read = new BufferedReader(new InputStreamReader(in));
			String line = null;
			while ((line = read.readLine()) != null) {
				result.append(line).append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static void main(String[] args) {
		ArrayList<String> cmds = new ArrayList<String>();
//		cmds.add("df");
//		cmds.add("-m");
		
		cmds.add("/bin/sh");
		cmds.add("-c");
		cmds.add("ps -ef|grep java");
		StringBuilder sb = ExecOSCommand.getCommandResult(cmds);
		System.out.println(sb);
	}

}
