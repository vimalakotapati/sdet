package com.training.sdet.JavaProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {
	
	@Test(timeout = 100)
	public void getAllAcctTest(){
		AccountLogic al = new AccountLogic();
		
		assertEquals(1,al.getAllAccounts());
		
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

}
