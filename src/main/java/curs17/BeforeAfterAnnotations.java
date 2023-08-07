package curs17;

import org.testng.annotations.*;

public class BeforeAfterAnnotations {
	
	@BeforeSuite
	// ruleaza inaintea tuturor
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	// ruleaza dupa teste / dupa tot
	public void afterSuite() {
		System.out.println("AfterSuite");
	}
	
	@BeforeClass
	// ruleaza inaintea unei clase
	// daca ai 100 de clase ruleaza de 100 de ori pt fiecare clasa
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	//ruleaza dupa fiecare clasa 
	public void afterClass() {
		System.out.println("AfterClass");
	}
	
	@BeforeMethod
	//ruleaza inainte de fiecare metoda @Test
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	//ruleaza dupa fiecare metoda @Test
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@Test
	public void test1() {
		System.out.println("Test1");
	}
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	

}
