package com.spencer.chang;

import java.io.Serializable;

public class ProcessWarpper implements Serializable {
	
	private static final long serialVersionUID = -8974007513545773642L;
	
	public String command;
	public OS OSType;
	
	public ProcessWarpper(String command, OS OSType) {
		super();
		this.command = command;
		this.OSType = OSType;
	}
	
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public OS getOSType() {
		return OSType;
	}
	public void setOSType(OS oSType) {
		OSType = oSType;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((OSType == null) ? 0 : OSType.hashCode());
		result = prime * result + ((command == null) ? 0 : command.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProcessWarpper other = (ProcessWarpper) obj;
		if (OSType != other.OSType)
			return false;
		if (command == null) {
			if (other.command != null)
				return false;
		} else if (!command.equals(other.command))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "ProcessWarpper [command=" + command + ", OSType=" + OSType + "]";
	}

}
