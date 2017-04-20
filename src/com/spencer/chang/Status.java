package com.spencer.chang;
/*
 * shell command 执行状态
 */
public enum Status{
	NOT_YET_EXCECUTED, //未执行
	COMPLETED_NORMAL, //执行成功
	COMPLETED_ERROR; //执行出错
}