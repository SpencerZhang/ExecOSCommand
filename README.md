# ExecOSCommand

## 说明 / Instructions

### 普通命令 / Ordinary command

```java

		ArrayList<String> cmds = new ArrayList<String>();
		cmds.add("df");
		cmds.add("-m");
		StringBuilder sb = ExecOSCommand.getCommandResult(cmds);
		System.out.println(sb);
		
```

### 管道命令 / Pipe command

```java

		ArrayList<String> cmds = new ArrayList<String>();
		cmds.add("/bin/sh");
		cmds.add("-c");
		cmds.add("ps -ef|grep java");
		StringBuilder sb = ExecOSCommand.getCommandResult(cmds);
		System.out.println(sb);
		
```


## 开源协议 / License

[MIT](http://opensource.org/licenses/MIT)

Copyright (c) 2017 Spencer Chang

