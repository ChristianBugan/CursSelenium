package curs17;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestDependency {
	
	@Test(groups = "payments")
	public void method1() {
		assertTrue(false);
		System.out.println("Method 1");
	}
	
	@Test(dependsOnMethods = "method1", dependsOnGroups = "payments")
	public void method2() {
		System.out.println("Method 2");
	}
	
	@Test(dependsOnMethods = "method2")
	public void method3() {
		System.out.println("Method 3");
	}

}
