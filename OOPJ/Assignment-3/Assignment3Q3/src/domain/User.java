package domain;

import java.util.Scanner;

public class User {
	private String name;
	private String phoneNo;
	private String emailId;

	static Scanner sc = new Scanner(System.in);

	public User() {
		this("", "", "");
	}

	public User(String name, String phoneNo, String emailId) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String toString() {
		return "[name=" + name + ", phoneNo=" + phoneNo + ", emailId=" + emailId + "]";
	}

}
