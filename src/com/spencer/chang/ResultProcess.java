package com.spencer.chang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ResultProcess {
	public StringBuffer ResultProcessText(Status status, Process pro) {
		StringBuffer result = new StringBuffer();
		String line = null;

		if (status == Status.COMPLETED_NORMAL) {
			InputStream in = pro.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			try {
				while ((line = br.readLine()) != null) {
					result.append(line).append("\n");
				}

				in.close();
				isr.close();
				br.close();
				pro.destroy();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (status == Status.COMPLETED_ERROR) {
			InputStream errIn = pro.getErrorStream();
			InputStreamReader errIsr = new InputStreamReader(errIn);
			BufferedReader errBr = new BufferedReader(errIsr);
			try {
				while ((line = errBr.readLine()) != null) {
					result.append(line).append("\n");
				}

				errIn.close();
				errIsr.close();
				errBr.close();
				pro.destroy();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (status == Status.NOT_YET_EXCECUTED) {
			result.append("执行异常！").append("\n");
		}
		return result;
	}
}
