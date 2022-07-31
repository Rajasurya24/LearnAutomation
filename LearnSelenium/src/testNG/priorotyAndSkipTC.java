package testNG;

import org.testng.annotations.Test;

public class priorotyAndSkipTC {
	@Test(priority=1)
	public void firstTC() {
		System.out.println("1 test case");
	}
	@Test(priority=1)
	public void secondTC() {
		System.out.println("2 test case");
	}
	@Test(priority=2,enabled=false)
	public void thirdTC() {
		System.out.println("3 test case");
	}
	@Test(priority=3)
	public void fourthTC() {
		System.out.println("4 test case");
	}

}
