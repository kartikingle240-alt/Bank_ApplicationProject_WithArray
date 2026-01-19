package com.bankApplication.exponent.model;

public class Account {

	private long accountNo;
	private String accountName;
	private String aadharNo;
	private String panNo;
	private String email;
	private long contact;
	private double accountBalance;

	public long getAccountNo() {
		return accountNo;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double d) {
		this.accountBalance = d;
	}

	@Override
	public String toString() {
		return "  Account Details :\n AccountNo=" + accountNo + "\n AccountName=" + accountName + "\n AadharNo=" + aadharNo
				+ "\n PanNo=" + panNo + "\n Email=" + email + "\n Contact=" + contact + "\n AccountBalance="
				+ accountBalance + "\n";
	}

	

}