package testcases;

import org.testng.annotations.Test;

public class TestClass {
	
	@Test
	public void testcase1() {
		
		String s1 = "Selenium";
		
		String s2 = "Selenium";
		
		if(s1.equals(s2)) {
			
			System.out.println("s1 and s2 are equal");
		}
		
		else {
			
			System.out.println("Not equal");
		}
		
}

    @Test
	public void testcase2() {
		
		
		int num = 5;
		
		if(num>3) {
			
			System.out.println("Greater than 3");
		}
		
		else {
			
			System.out.println("lesser than 3");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		TestClass test =  new TestClass();
		
		test.testcase1();
		
		test.testcase2();
		
	}
	
}



