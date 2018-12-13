package com.training.sdet.JavaProject;

import java.util.List;

import com.training.sdet.JavaProject.account;

public interface IAccountDAO {
	
	public boolean updateAccount(int accId,
			int percent);
	public List<account> getAllaccount();
	public account getAccount(int accId);

}
