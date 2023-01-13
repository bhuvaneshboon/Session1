package testcases;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

/*Attributes 

* 1. Priority
* 2.InvocationCount - the count should be more than 1 and dont use negative numbers 
                     // like -2, +5 , 
* 3.dependsOnMethods
* 4.alwaysRun
* 5.timeOuts
* 6.expectedException
* 7.invocationTimeOut
  intervi qus timeOuts vs invocationsTimeOut
* 8.description - to see the description copy index.html from test output fold.
* 9.enabled - use of,  to ignore particular function
* 10.expectedExceptionsMessageRegEx
* 
* 
*/
public class AttributesExamples {
	
// for git 
	
	public void gitPrac1() {
		
		System.out.println("git mobile login has been added");
	}
	
	/*
	 * @Test private void m1() {
	 * 
	 * System.out.println("m1");
	 * 
	 * }
	 * 
	 * @Test private void m2() {
	 * 
	 * System.out.println("m2");
	 * 
	 * }
	 */
	
	@Test(enabled = true,expectedExceptions = ArithmeticException.class, expectedExceptionsMessageRegExp = ".* zero")
	private void m3() {                 //exmr sample msgs - "/ by zero", ".* zero", "/ by.*"
                                        //if we dono the msg we put - ".*"
		
		System.out.println(100 / 0);

	}
	
	/*
	 * @Test private void m4() {
	 * 
	 * System.out.println("m4");
	 * 
	 * }
	 */
	
	
	/*
	 * @Test(description =
	 * "This is to login facebook with different set of excel data") //milli seconds
	 * public void m2() throws Exception {
	 * 
	 * Thread.sleep(2000);
	 * 
	 * System.out.println("m2......");
	 * 
	 * }
	 */
	
	
	/*
	 * @Test(invocationCount = 5, invocationTimeOut = 3000) //milli seconds public
	 * void m2() throws Exception {
	 * 
	 * Thread.sleep(2000);
	 * 
	 * System.out.println("m2......");
	 * 
	 * }
	 */
	
	
	/*
	 * @Test(expectedExceptions = Exception.class) public void m1() {
	 * 
	 * System.out.println(1/0);
	 * 
	 * String str = null ;
	 * 
	 * System.out.println(str.length());
	 * 
	 * System.out.println("Welcome.....");
	 * 
	 * }
	 */
	
	
	/*
	 * @Test(timeOut = 2000) public void testcase() throws Exception {
	 * 
	 * Thread.sleep(1000);
	 * 
	 * System.out.println("testcase");
	 * 
	 * }
	 */
	
	
	/*
	 * @Test(priority = 1) public void launchUrl() {
	 * 
	 * System.out.println("launchUrl"); }
	 * 
	 * @Test(priority = 2) public void loginAmazon() {
	 * 
	 * System.out.println("loginAmazon");
	 * 
	 * Assert.fail(); }
	 * 
	 * @Test(priority = 3, dependsOnMethods = "loginAmazon", alwaysRun = true )
	 * public void searchProduct() {
	 * 
	 * System.out.println("searchProduct"); Assert.fail(); }
	 * 
	 * @Test(priority = 4, dependsOnMethods = "searchProduct") public void addCart()
	 * {
	 * 
	 * System.out.println("addCar"); }
	 * 
	 * @Test(priority = 5, dependsOnMethods = "addCart") public void doPayment() {
	 * 
	 * System.out.println("doPayment"); }
	 * 
	 * @Test(priority = 6) public void closeApp() {
	 * 
	 * System.out.println("closeApp"); }
	 */
	
	
	
	/*
	 * @Test (invocationCount = 100) public void testcase() {
	 * 
	 * System.out.println("Test case"); }
	 */
	
	
	
	
/*	
	@Test(priority = 1) public void mehod1() {
		
      System.out.println("Method 1");
	}
	
	@Test(priority = 2) public void method2() {
		
	  System.out.println("Method 2");
	}
	
	@Test(priority = 3) public void method3() {
		
	  System.out.println("Method 3");
	}
	
	@Test(priority = 3) public void method5() {
		
		  System.out.println("Method 5");
		}

    @Test public void method4() {
    	
     System.out.println("Method 4");	
	}
	*/
}  
