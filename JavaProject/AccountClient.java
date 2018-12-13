package com.training.sdet.JavaProject;

import java.util.Scanner;

public class AccountClient {
	public static void main(String[] args) {
		
		
		IAccountDAO dao = new AccountDAO();
			
		dao.getAllaccount().forEach(System.out::println);
		
		for(int count=101;count<=105; count++) {
		
		System.out.println(dao.getAccount(count));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the percent");
		
		int percent = Integer.parseInt(sc.next());
		
		dao.updateAccount(count,percent);
		
		System.out.println(dao.getAccount(count));
		
		}
		
		
				
			
			}

}
