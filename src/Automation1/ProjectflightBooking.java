package Automation1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org.apache.commons.io.FileUtils;



public class ProjectflightBooking {

	
	       //*****************LOGIN******************************//
	@Parameters({ "URL","username","password" })
    @Test
	public void flight1(String urlname,String name,String psswd) throws InterruptedException, IOException
	{
		//System.out.println(urlname);
    	//System.out.println(name);
    	//System.out.println(psswd);
	 	
    	System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\Java\\Project1\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
      
        driver.get(urlname);   
        driver.findElement(By.xpath("//input[@name='userName']")).click();
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(name);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(psswd);
        driver.findElement(By.xpath("//input[@name='login']")).click();
        Thread.sleep(2000);
        
                 
                         // PASSANGER DROP_DOWN//
        Actions a=new Actions(driver);       
        a.moveToElement(driver.findElement(By.xpath("//*[@name='passCount']"))).build().perform();   
        driver.findElement(By.xpath("//*[@name='passCount']")).click();
        Select S=new Select(driver.findElement(By.xpath("//*[@name='passCount']")));  	   
 	    driver.findElement(By.xpath("//*[@name='passCount']")).click(); 	    
 	    driver.findElement(By.xpath("//*[@name='passCount']//option[2]")).click();	
 	    
 	         // Departing From DROP_DOWN//
 	    /*driver.findElement(By.xpath("//*[@name='fromPort']")).click();
 	   driver.findElement(By.xpath("//select[@name='fromPort']//option[contains(text(),'Paris')]")).click();
 	  driver.findElement(By.xpath("//select[@name='fromPort']//option[contains(text(),'Paris')]")).sendKeys(Keys.TAB);
 	  Thread.sleep(5000);*/
 	   Select abc=new Select(driver.findElement(By.xpath("//*[@name='fromPort']")));
 	   abc.selectByValue("Paris");
 	  driver.findElement(By.xpath("//select[@name='fromPort']")).sendKeys(Keys.TAB);
 	  
 	   
 	  
 	        //Month Drop-Down July-4//
 	  
 	  WebElement element=driver.findElement(By.xpath("//select[@name='fromMonth']"));
 	  //JavascriptExecutor executor= (JavascriptExecutor)driver;
 	  //executor.executeScript("argument[0].click()", element);
 	  element.click();
 	   Select pqr=new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
	   pqr.selectByVisibleText("July");
	   Thread.sleep(2000);
	   Select p=new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
	   p.selectByValue("4");
	   
	   //Arriving IN//
	   Select q=new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
	   q.selectByValue("New York");
	   driver.findElement(By.xpath("//select[@name='toPort']")).sendKeys(Keys.TAB);
	   
	         //Returing  August-8//
	       WebElement ele=driver.findElement(By.xpath("//select[@name='toMonth']"));	 	  
	 	   ele.click();
	 	   Select rng=new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
		   rng.selectByVisibleText("August");
		   Thread.sleep(2000);
		   Select m=new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
		   m.selectByValue("8");
		   driver.findElement(By.xpath("//select[@name='toMonth']")).sendKeys(Keys.TAB);
		   
		   //Service Class//
		   
		   driver.findElement(By.xpath("//input[@value='Business']")).click();
		   driver.findElement(By.xpath("//input[@value='Business']")).sendKeys(Keys.TAB);
		   
		   //Airline//
		   
		   driver.findElement(By.xpath("//select[@name='airline']")).click();
		   Select jk=new Select(driver.findElement(By.xpath("//select[@name='airline']")));
		   jk.selectByVisibleText("Unified Airlines");
		   //driver.findElement(By.xpath("//select[@name='airline']")).sendKeys(Keys.TAB);
		   
		   
		 //Continue Button//
		  driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		  
		  //*******************Next page*************************************************//
		  
		  JavascriptExecutor jse= (JavascriptExecutor)driver;
	        jse.executeScript("window.scrollTo(0,1000)");
	        Actions b=new Actions(driver);       
	        b.moveToElement(driver.findElement(By.xpath("//table//table//table//table//table[1]//tbody[1]//tr[7]//td[1]//input[1]"))).build().perform();  
	        
	        driver.findElement(By.xpath("//table//table//table//table//table[1]//tbody[1]//tr[7]//td[1]//input[1]")).click();
	        
	        driver.findElement(By.xpath("//table[2]//tbody[1]//tr[9]//td[1]//input[1]")).click();
	        
	        //Continue Button//
	        
	        driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
	        Thread.sleep(3000);
	        
		   //***************************Next Page******************************//
	        
			  JavascriptExecutor jv= (JavascriptExecutor)driver;
		        jv.executeScript("window.scrollTo(0,1000)");
		        
		        Actions c=new Actions(driver);       
		        c.moveToElement(driver.findElement(By.xpath("//input[@name='passFirst0']"))).build().perform();  
		        
		        //******Passanger1***********//
		        driver.findElement(By.xpath("//input[@name='passFirst0']")).click();
		        driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("Monali");
		        driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Paigude");
		        driver.findElement(By.xpath("//select[@name='pass.0.meal']")).click();
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("//option[contains(text(),'Low Cholesterol')]")).click();
		        //driver.findElement(By.xpath("//option[contains(text(),'Low Cholesterol')]")).sendKeys(Keys.TAB);
		        Thread.sleep(4000);
		        
		        //driver.findElement(By.xpath("//option[contains(text(),'Low Cholesterol')]")).sendKeys(Keys.TAB);
		        
		        		        		//Passenger-2//        
		        /*Actions z=new Actions(driver);       
		        z.moveToElement(driver.findElement(By.xpath("//input[@name='passFirst1']"))).build().perform(); */  
		        WebElement element1=driver.findElement(By.xpath("//input[@name='passFirst1']"));		   	  
		   	     element1.click();
		   	     
		        driver.findElement(By.xpath("//input[@name='passFirst1']")).click();
		        driver.findElement(By.xpath("//input[@name='passFirst1']")).sendKeys("Mona");
		        driver.findElement(By.xpath("//input[@name='passFirst1']")).sendKeys(Keys.TAB);
		        
		        driver.findElement(By.xpath("//input[@name='passLast1']")).click();
		        driver.findElement(By.xpath("//input[@name='passLast1']")).sendKeys("Kshirsagar");
		       
		        driver.findElement(By.xpath("//select[@name='pass.1.meal']")).click();
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("//select[@name='pass.1.meal']//option[contains(text(),'Low Cholesterol')]")).click();
		        Thread.sleep(2000);
		        		      
		   
		        driver.findElement(By.xpath("//select[@name='creditCard']")).click();
		        Select imp=new Select(driver.findElement(By.xpath("//select[@name='creditCard']")));
		        imp.selectByValue("DS");
		        driver.findElement(By.xpath("//select[@name='creditCard']")).sendKeys(Keys.TAB);
		        
		        driver.findElement(By.xpath("//input[@name='creditnumber']")).click();
		        driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("76543");
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys(Keys.TAB);
		        
		        driver.findElement(By.xpath("//select[@name='cc_exp_dt_mn']")).click();
		        Select ti=new Select(driver.findElement(By.xpath("//select[@name='cc_exp_dt_mn']")));		       
				   //ti.selectByIndex(12);
				   ti.selectByVisibleText("12");
				   driver.findElement(By.xpath("//select[@name='cc_exp_dt_mn']")).sendKeys(Keys.TAB);
				   
				   driver.findElement(By.xpath("//select[@name='cc_exp_dt_yr']")).click();
				   driver.findElement(By.xpath("//option[contains(text(),'2010')]")).click();
				   //driver.findElement(By.xpath("//option[contains(text(),'2010')]")).sendKeys(Keys.TAB);
				   
				   driver.findElement(By.xpath("//input[@name='cc_frst_name']")).click();
				   driver.findElement(By.xpath("//input[@name='cc_frst_name']")).sendKeys("Monali");
				   driver.findElement(By.xpath("//input[@name='cc_mid_name']")).sendKeys("ABC");
				   driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys("Paigude");
				   driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys(Keys.TAB);
				   driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys(Keys.TAB);
				   Thread.sleep(2000);
				   
				   //Address//
				   System.out.println("ADDRESS");
				   driver.findElement(By.xpath("//input[@name='billAddress1']")).click();
				   driver.findElement(By.xpath("//input[@name='billAddress1']")).clear();
				   driver.findElement(By.xpath("//input[@name='billAddress1']")).sendKeys("121 Lane-2");
				   System.out.println("ADDRESS1");
				   
				   driver.findElement(By.xpath("//input[@name='billCity']")).click();
				   driver.findElement(By.xpath("//input[@name='billCity']")).clear();
				   driver.findElement(By.xpath("//input[@name='billCity']")).sendKeys("Sunnyvale");
				   
				   driver.findElement(By.xpath("//input[@name='delState']")).click();
				   driver.findElement(By.xpath("//input[@name='billCity']")).clear();
				   driver.findElement(By.xpath("//input[@name='delState']")).sendKeys("CA");
				   
				   driver.findElement(By.xpath("//input[@name='billZip']")).click();
				   driver.findElement(By.xpath("//input[@name='billZip']")).clear();
				   driver.findElement(By.xpath("//input[@name='billZip']")).sendKeys("94089");
				   
				   driver.findElement(By.xpath("//select[@name='billCountry']")).click();
				   //driver.findElement(By.xpath("//select[@name='billCountry']")).clear();
				   driver.findElement(By.xpath("//select[@name='billCountry']")).sendKeys(Keys.ARROW_UP);
				   driver.findElement(By.xpath("//select[@name='billCountry']")).click();
				   Thread.sleep(2000);
				   driver.findElement(By.xpath("//select[@name='billCountry']")).sendKeys(Keys.TAB);
				   
				   /*Select z=new Select(driver.findElement(By.xpath("//select[@name='billCountry']//option[contains(text(),'AMERICAN SAMOA')]")));
				   z.selectByValue("7");*/
				  
				/* driver.findElement(By.xpath("//tr[14]//td[2]//input[1]")).click();
				 driver.findElement(By.xpath("//tr[14]//td[2]//input[1]")).click();
				 driver.findElement(By.xpath("//tr[14]//td[2]//input[1]")).sendKeys(Keys.TAB);*/
				 
				//Address-1//
				   System.out.println("ADDRESS");
				   driver.findElement(By.xpath("//input[@name='delAddress1']")).click();
				   driver.findElement(By.xpath("//input[@name='delAddress1']")).clear();
				   driver.findElement(By.xpath("//input[@name='delAddress1']")).sendKeys("121 Lane-2");
				   System.out.println("ADDRESS1");
				   
				   driver.findElement(By.xpath("//input[@name='billCity']")).click();
				   driver.findElement(By.xpath("//input[@name='billCity']")).clear();
				   driver.findElement(By.xpath("//input[@name='billCity']")).sendKeys("Sunnyvale");
				   
				   driver.findElement(By.xpath("//input[@name='delState']")).click();
				   driver.findElement(By.xpath("//input[@name='delState']")).clear();
				   driver.findElement(By.xpath("//input[@name='delState']")).sendKeys("CA");
				   
				   driver.findElement(By.xpath("//input[@name='delZip']")).click();
				   driver.findElement(By.xpath("//input[@name='delZip']")).clear();
				   driver.findElement(By.xpath("//input[@name='delZip']")).sendKeys("94089");
				   
				   driver.findElement(By.xpath("//select[@name='delCountry']")).click();
				   //driver.findElement(By.xpath("//select[@name='billCountry']")).clear();
				   driver.findElement(By.xpath("//select[@name='delCountry']")).sendKeys(Keys.ARROW_UP);
				   driver.findElement(By.xpath("//select[@name='delCountry']")).click();
				  
				 	  System.out.println(driver.switchTo().alert().getText());
				 	  driver.switchTo().alert().accept();
				   Thread.sleep(2000);
				   
				   driver.findElement(By.xpath("//select[@name='billCountry']")).sendKeys(Keys.TAB);
				   
				   driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
				   
				   JavascriptExecutor js= (JavascriptExecutor)driver;
			        js.executeScript("window.scrollTo(0,1000)");
			        
			        /*File screen1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(screen1,new File("D:\\Monali\\screenshot5.png"));
					System.out.println("Hello");*/
			        
			        driver.findElement(By.xpath("//td//td//td//td[2]//a[1]//img[1]")).click();	
			        
			        File screen1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(screen1,new File("D:\\Monali\\screenshot5.png"));
					System.out.println("Hello1");
			    	
					
	}
}
