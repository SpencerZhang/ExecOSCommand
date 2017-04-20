package com.spencer.chang;

public class ExecOSCommand {
	public StringBuffer getCommandResult(ProcessWarpper command, ProcessManger pm) {
		StringBuffer result = new StringBuffer();
		OS OSTypes = command.getOSType();
		if (OSTypes instanceof OS) {
			// 组装Process
			ParameterProcess pp = new ParameterProcess();
			Process pro = pp.parameterProcess(OSTypes, command, pm);

			try {
				pro.waitFor();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			// 查询Process状态
			Status status = pm.getStatus(pro);
			// 处理Process返回结果
			ResultProcess rp = new ResultProcess();
			result = rp.ResultProcessText(status, pro);
		} else {
			result.append("不能识别的系统！").append("\n");
		}
		return result;
	}
}
