package com.example.api_cho_android.model;

import java.io.Serializable;

public class JwtRequest implements Serializable {
private static final long serialVersionUID = 5926468583005150707L;
	
	private String ten;
	private String pass;
	
	//need default constructor for JSON Parsing
	public JwtRequest()
	{
		
	}

	
	public JwtRequest(String ten, String pass) {
		super();
		this.ten = ten;
		this.pass = pass;
	}


	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	
}
