package com.sunbeaminfo.sh.bookshop.models;

public class Login {
	private String email;
	private String password;
	public Login() {
		this("", "");
	}
	public Login(String email, String password) {
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return String.format("Login [email=%s, password=%s]", email, password);
	}
}
