package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test
public class finale {
	public void one() throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		//BY.id
	    driver.get("https://www.ehealthinsurance.com/");
	    driver.findElement(By.className("select-container")).click();
	    driver.findElement(By.xpath("//*[@id=\"desktop-banner-options\"]/a[4]")).click();
	    driver.findElement(By.id("find-btn")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[@id=\"hero\"]/div/div/div/div[2]/input")).click();
	   WebElement pin= driver.findElement(By.xpath("//*[@id=\"hero\"]/div/div/div/div[2]/input"));
	    pin.sendKeys("48480");
	    
	    driver.manage().window().maximize();
	    //3rd sheet
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"hero\"]/div/div/div/div[2]/button")).click();	 
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//p[@role='button' ][2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"census\"]/div/div/div/div[2]/button")).click();
	    
	  //4th sheet
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@role='button'][2]")).click();
	    driver.findElement(By.xpath("//p[@role='button'][2]")).click();
	    
	    driver.findElement(By.id("census--application--primary--dob--month")).sendKeys("12");
	    driver.findElement(By.xpath("//*[@id=\"census--application--primary--dob--day\"]")).sendKeys("12");
	    driver.findElement(By.xpath("//*[@id=\"census--application--primary--dob--year\"]")).sendKeys("1993");
	    Thread.sleep(10000);
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000); 
	   WebElement seeplan = driver.findElement(By.xpath("//button[@class='button-primary whitespace-no-wrap w-2-3']"));
	// WebElement seeplan = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button-primary whitespace-no-wrap w-2-3']")));
      seeplan.click();
	
      Thread.sleep(10000); 
      
      js.executeScript("window.scrollBy(0,500)");
    
       Thread.sleep(1000); 
      for(int i=0;i<1;i++)
      {
    
    	  WebElement company =driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/section[2]/div/div/div/div[2]/div/div[2]/div/div[3]/div/div[2]/div/div/div/div/button[4]"));   
    	  company.click();
      
      }
      
      Thread.sleep(1000); 
      js.executeScript("window.scrollBy(0,950)");
      File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      // Code to copy the screenshot in the desired location
      FileUtils.copyFile(scrFile, new File("C:\\CaptureScreenshot\\google1.jpg"));
      Thread.sleep(1000);
      //mouse hover
    Actions actions = new Actions(driver);
      
    WebElement menuOption =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("3016--button--select-plan")));
      actions.moveToElement(menuOption).click(menuOption).build().perform();
      js.executeScript("window.scrollBy(0,700)");

     Thread.sleep(2000);
      WebElement beginapp=driver.findElement(By.id("`fake--cart--begin--application-button`"));
    beginapp.click();
      
    Thread.sleep(5000);
    js.executeScript("window.scrollBy(0,700)");
    driver.findElement(By.name("xfm.av.//app:core-data/app:members/app:member[@number=1]/app:name/app:first-name")).sendKeys("Naveen");
    driver.findElement(By.name("xfm.av.//app:core-data/app:members/app:member[@number=1]/app:name/app:last-name")).sendKeys("Ragul");  
 
    Select dropheight = new Select(driver.findElement(By.name("xfm.rv.1.[1]/app:feet")));
    dropheight.selectByValue("7");

    Select dropinch = new Select(driver.findElement(By.name("xfm.rv.1.[1]/app:inches")));
    dropinch.selectByValue("2");
    driver.findElement(By.name("xfm.rv.2.[1]/self::node()")).sendKeys("70"); 
    driver.findElement(By.name("xfm.event.NextPage.")).click();
    
    Thread.sleep(1000);
    driver.findElement(By.name("xfm.av.//app:core-data/app:home-address/app:street")).sendKeys("13/604 pacr road");
    driver.findElement(By.name("xfm.av.//app:core-data/app:home-address/app:city")).sendKeys("chennai");
    driver.findElement(By.name("xfm.rv.1.[1]/app:area-code")).sendKeys("201");
    driver.findElement(By.name("xfm.rv.1.[1]/app:number")).sendKeys("1234567");
    driver.findElement(By.name("xfm.av.//app:core-data/app:email")).sendKeys("naveen.ragul@gmail.com");
    js.executeScript("window.scrollBy(0,700)");
    driver.findElement(By.name("xfm.event.NextPage.")).click();
    
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[contains(text(),'Save Application')]")).click();
//    Alert alert = driver.switchTo().alert();
//   alert.accept();
    driver.close();
      }
	
	public void readexcel()
	{
		 try {
			 File src=new File("D:\\test.xlsx");
		
				FileInputStream fis=new FileInputStream(src);
			
			 XSSFWorkbook wb=new XSSFWorkbook(fis);
		 		XSSFSheet sh1= wb.getSheetAt(0);
			


		         System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());

		         System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
		           } 
				 catch (Exception e) {
		        	  System.out.println(e.getMessage());
		           }
	}
	}

