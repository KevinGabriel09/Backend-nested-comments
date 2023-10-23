package com.discusion.foroPrueba.models;

public class DtoResponse {

	private boolean exito;
	private String msg;
	
	public DtoResponse(boolean exito, String msg) {
		super();
		this.exito = exito;
		this.msg = msg;
	}
	public boolean isExito() {
		return exito;
	}
	public void setExito(boolean exito) {
		this.exito = exito;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
