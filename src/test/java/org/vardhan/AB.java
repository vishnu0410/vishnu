package org.vardhan;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AB {
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeoreClass");
	}
	@AfterClass
	private void afterClass() {
		// TODO Auto-generated method stub
		System.out.println("after Class");
	}
	@BeforeMethod
	private void beforeMethod() {
		// TODO Auto-generated method stub
		System.out.println("beforemethod");
	}
	@AfterMethod
	private void afterMethod() {
		// TODO Auto-generated method stub
		System.out.println("aftermethod");
	}
	@Test
	private void tc0() {
		// TODO Auto-generated method stub
		System.out.println("tc01");
	}
	@Test
	private void tc01() {
		// TODO Auto-generated method stub
		System.out.println("tc02");
	}
}
