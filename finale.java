package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
	    //driver.findElement(By.xpath("//*[@id=\"census--application--primary--dob--month\"]")).sendKeys("12");
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
      js.executeScript("window.scrollBy(0,2000)");
    
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

