package Automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;


public class AutomationClass3	 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "D:\\Selinium\\Java\\Project1\\Drivers\\IEDriverServer.exe");
		
        
		WebDriver driver=new InternetExplorerDriver(); 
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
	    System.out.println(driver.getTitle());
		
		
         driver.navigate().to("http://yahoo.com");
         driver.navigate().back();
		
	}

}