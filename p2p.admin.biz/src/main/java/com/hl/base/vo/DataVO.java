package com.hl.base.vo;

import java.io.Serializable;

public class DataVO<T> implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private boolean success;
	private String message;
	private T result;
	
	public boolean isSuccess() {
		return success;
		
	}
	public DataVO<T> setSuccess(boolean success) {
		this.success = success;
		return this;
	}
	public String getMessage() {
		return message;
	}
	public DataVO<T> setMessage(String message) {
		this.message = message;
		return this;
	}
	public T getResult() {
		return this.result;
	}
	public DataVO<T> setResult(T result) {
		this.result = result;
		return this;
	}
}