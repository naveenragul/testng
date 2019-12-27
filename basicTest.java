package demo;

import org.junit.BeforeClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basicTest {
  @AfterTest
  public void one() {
	  	System.out.println("hi da");
		}
  @BeforeMethod
  public void two() {
	  	System.out.println("i will execute before all methods ");
		}
  
  @BeforeClass
  public void dupe() {
	  	System.out.println("before class");
		}
  
  @Test(groups={"smoke"})
  public void dupe1() {
	  	System.out.println("group test");
		}
  @BeforeTest
  public void last() {
	  	System.out.println("i should be first by efore test ");
		}
}
