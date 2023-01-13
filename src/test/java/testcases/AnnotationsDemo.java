package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Configurations methods
//For Configurations methods we cannot use priority......only works for testcase
//int qust -  if we have multiple conf method will the cod work -  yes it will work 

public class AnnotationsDemo {
	
	@BeforeSuite
	public void beforeSuite1() {
		
		System.out.println("Before Suite1");
	}
	@AfterSuite 
    public void AfterSuite1() {
		
		System.out.println("After Suite1");
	}

	@BeforeSuite
	public void beforeSuite2() {
		
		System.out.println("Before Suite2");
	}
	@AfterSuite 
    public void AfterSuite2() {
		
		System.out.println("After Suite2");
	}

	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("Before Test");
	}
	
	
	
	@AfterTest
	public void afterTest() {
		
		System.out.println("After Test");
	}

    @BeforeClass
	public void startDate() {
		
		System.out.println("Start Date.....");
		
	}

    @AfterClass
	public void endDate() {
		
		System.out.println("End Date.....");
		
	}
    @BeforeMethod
	public void launchUrl1() {
		
		System.out.println("Url  2......");
	}
	
    @AfterMethod
	public void closeApp1() {
		
		System.out.println("Close app  2.....");
		
	}
	
    @BeforeMethod
	public void launchUr2() {
		
		System.out.println("Url   1......");
	}
	
    @AfterMethod
	public void closeApp2() {
		
		System.out.println("Close app  1.....");
		
	}
    
	@Test public void loginFacebook1() {   // here public is an access modifier
		
		System.out.println("credentials 1");
		
		}

    @Test public void loginFacebook2() {   
		
		System.out.println("credentials 2");
		
		}

   @Test public void loginFacebook3() {   //only @Test is consider as a testcase. others are not will take into an account.
		
		System.out.println("credentials 3");
		
		}

	
}
