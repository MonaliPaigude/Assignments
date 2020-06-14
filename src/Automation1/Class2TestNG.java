package Automation1;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Class2TestNG {
	
	
	
	
	  @BeforeSuite public void screenshot() throws IOException {
	  System.setProperty("webdriver.chrome.driver",
	  "D:\\Selinium\\Java\\Project1\\Drivers\\chromedriver.exe"); WebDriver
	  driver=new ChromeDriver(); driver.manage().window().maximize();
	  
	  driver.get("http://google.com");
	  
	  File screen1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(screen1,new File("D:\\Monali\\screenshot2.png"));
	  System.out.println("Screenshot"); }
	  
	   @AfterSuite public void dayselection() { WebDriver driver;
	 
	   System.setProperty("webdriver.chrome.driver",
	 "D:\\Selinium\\Java\\Project1\\Drivers\\chromedriver.exe"); driver = new
	  ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("https://www.makemytrip.com/");
	 
	  WebElement dateWidget = driver.findElement(By.
	  xpath("//div[contains(@class,'fsw_inputBox dates inactiveWidget')]"));
	  dateWidget.click(); System.out.println("hello"); List<WebElement>
	  dates=driver.findElements(By.
	 xpath("//body[@class='desktop']/div[@id='root']/div[@class='bgGradient']/div[@class='minContainer']/div/div[@class='widgetSection appendBottom40']/div[@class='fsw widgetOpen']/div[contains(@class,'fsw_inner')]/div[@class='fsw_inputBox dates inactiveWidget activeWidget']/div[@class='datePickerContainer']/div[@class='flightCalOverlay']/div[@class='dayPickerFlightWrap']/div[@class='RangeExample oneWay']/div[@class='DayPicker']/div[@class='DayPicker-wrapper']/div[@class='DayPicker-Months']/div[1]"
	  ));
	 
	 for (WebElement cell: dates){ System.out.println("hello1");
	  
	 if (cell.getText().contains("13")){ System.out.println("hello2");
	  
	 cell.findElement(By.
	  xpath("//div[@class='DayPicker-Day DayPicker-Day--selected']//p[contains(text(),'13')]"
	  )).click(); break;
	  
	  } }
	  
	  }
	 
	@Test 
    @Parameters({ "Browser" })
	    
    public void browser(String s) throws InterruptedException, MalformedURLException
    {
	
   	 System.out.println(s);
    }
    
	//DesiredCapabilities capabilities = new DesiredCapabilities();
         
       
	
         
         
         
	
	}
	
	



