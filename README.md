# ExecOSCommand

##使用说明
###简单命令
```java

		ArrayList<String> cmds = new ArrayList<String>();
		cmds.add("df");
		cmds.add("-m");
		StringBuilder sb = ExecOSCommand.getCommandResult(cmds);
		System.out.println(sb);
		
```
###管道命令
```java

		ArrayList<String> cmds = new ArrayList<String>();
		cmds.add("/bin/sh");
		cmds.add("-c");
		cmds.add("ps -ef|grep java");
		StringBuilder sb = ExecOSCommand.getCommandResult(cmds);
		System.out.println(sb);
		
```