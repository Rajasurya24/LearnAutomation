package testNG;

import org.testng.annotations.Test;

public class dependencieManagement {

	@Test(enabled=true)
	public void highschool(){
	    System.out.println("High school");
	}
	@Test(dependsOnMethods="highschool")
	public void higherSecondary(){
	
	    System.out.println("Higher sec school");
	}
	@Test(dependsOnMethods="higherSecondary")
	public void engineering(){
	    System.out.println("college");
	
	
}
}
