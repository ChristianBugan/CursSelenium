package curs17;

import org.testng.annotations.Test;

public class TestPriority {

	@Test(priority = 1)
	public void one() {
		System.out.println("First");
	}
	
	@Test(priority = 2)
	public void two() {
		System.out.println("Second");
	}
	
	@Test//(priority = 3)
	public void three() {
		System.out.println("Third");
	}
	
	@Test//(priority = 4)
	public void four() {
		System.out.println("Fourth");

	}
	@Test//(priority = 5)
	public void five() {
		System.out.println("Fifth");

	}
	
}

//la rulare daca nu avem priority test ng-ul ruleaza alfabetic 
