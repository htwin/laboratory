package com.laboManager.entity;
/**
 * 统一返回信息
 * @author 22850
 *
 */
public class Result {
	private boolean success;
	private String message;
	public Result(boolean sucess,String message) {
		this.success = sucess;
		this.message = message;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
