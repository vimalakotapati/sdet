package com.training.sdet.JavaProject;

public class account{
	private int accountId;
	private int accountNo;
	private double accountBalance;
	private double accountAvgBalance;
	private double percent;
	
	public account() {}
	
	public account(int accountId, int accountNo, double accountBalance, double accountAvgBalance, double percent) {
		super();
		this.accountId = accountId;
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountAvgBalance = accountAvgBalance;
		this.percent = percent;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public double getAccountAvgBalance() {
		return accountAvgBalance;
	}

	public void setAccountAvgBalance(double accountAvgBalance) {
		this.accountAvgBalance = accountAvgBalance;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}
	@Override
	public String toString() {
		return "account [accountId=" + accountId + ", accountNo=" + accountNo + ", accountBalance=" + accountBalance
				+ ", accountAvgBalance=" + accountAvgBalance + ", percent=" + percent + "]";
	}

}
