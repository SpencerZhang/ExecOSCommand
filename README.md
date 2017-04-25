# ExecOSCommand

## 说明 / Instructions

### 命令 / command

```java

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
		
```

## 捐助
<!--https://raw.githubusercontent.com/SpencerZhang/ExecOSCommand-->
<p align="center">
<img src="./resource/IMG_0783.JPG" alt="WeChat" title="WeChat" width="200"/>
</p>
<p align="center">
<img src="./resource/IMG_0784.JPG" alt="AliPay" title="AliPay" width="200"/>
</p>


## 开源协议 / License

[MIT](http://opensource.org/licenses/MIT)

Copyright (c) 2017 Spencer.Chang. All rights reserved.

