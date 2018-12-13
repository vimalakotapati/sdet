package com.training.sdet.JavaProject;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.connection.GetConnection;
import com.training.entity.Employee;
import com.training.sdet.JavaProject.IAccountDAO;


public class AccountDAO implements IAccountDAO {

	
	public boolean updateAccount(int accId, int newPercent) {
		// TODO Auto-generated method stub
		String sql = "update Account set percentage = ? where accid = ?";
		GetConnection gc = new GetConnection();

		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);
			
			gc.ps.setInt(1, newPercent);
			gc.ps.setInt(2, accId);
			

			return gc.ps.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}


	public List<account> getAllaccount() {
		// TODO Auto-generated method stub
		
		String sql ="select * from account";
				
				GetConnection gc = new GetConnection();
		List<account> accList = new ArrayList<account>();
		
		try {
			gc.ps = GetConnection.getMySqlConnection()
					.prepareStatement(sql);
			
			gc.rs = gc.ps.executeQuery();
			
			while(gc.rs.next()) {
				account account = new account();
				account.setAccountId(gc.rs.getInt(1));
				account.setAccountNo(gc.rs.getInt(2));
				account.setAccountBalance(gc.rs.getDouble(3));
				account.setAccountAvgBalance(gc.rs.getDouble(4));
				account.setPercent(gc.rs.getDouble(5));
				accList.add(account);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accList;
	}
	
	public account getAccount(int accId) {
		// TODO Auto-generated method stub
		
		String sql  = "select * from account where accid=?";
		
		GetConnection gc = new GetConnection();
		try {
			gc.ps = GetConnection.getMySqlConnection()
					.prepareStatement(sql);
			
			gc.ps.setInt(1, accId);
			gc.rs = gc.ps.executeQuery();
			
			if(gc.rs.next()) {
				account account = new account();
				account.setAccountId(gc.rs.getInt(1));
				account.setAccountNo(gc.rs.getInt(2));
				account.setAccountBalance(gc.rs.getDouble(3));
				account.setAccountAvgBalance(gc.rs.getDouble(4));
				account.setPercent(gc.rs.getDouble(5));
				return account;
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				gc.ps.close();
				gc.rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	}
