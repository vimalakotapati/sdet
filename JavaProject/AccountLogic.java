package com.training.sdet.JavaProject;

public class AccountLogic {
	
	public int getAllAccounts() {
		IAccountDAO dao = new AccountDAO();
		dao.getAllaccount();
		return 1;
	}

}
