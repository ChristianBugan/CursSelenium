package curs17;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Test
public class TestAnnotation {
	
	@Ignore  
	public void test1() {
		System.out.println("test1");
	}
	@Test 
	public void test2() {
		System.out.println("test2");
	}
	//@Test 
	public void test3() {
		System.out.println("test3");
	}
	//@Test
	private void test4() {
		System.out.println("test4");
	}
}
