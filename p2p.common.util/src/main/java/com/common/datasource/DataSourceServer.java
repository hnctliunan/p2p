package com.common.datasource;

public enum DataSourceServer {
	
	Master("master"),
	Slave("slave"),
	Reset("reset");
	
	private String value;
	private DataSourceServer(String value){
		this.value = value;
	}
	public String getValue(){
		return this.value;
	}
}