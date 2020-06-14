package Automation1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Class1TestNG {
	
	@AfterTest
	public void login()
	{
		WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\Java\\Project1\\Drivers\\chromedriver.exe");
         driver = new ChromeDriver();
         
         driver.manage().window().maximize();
         driver.get("https://facebook.com/");
         System.out.println("Facebook window");
	}
	
	@BeforeTest 
	public void Search() throws InterruptedException
	{
		WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\Java\\Project1\\Drivers\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
 	    Thread.sleep(1000);
	   
 	    List<WebElement> list = driver.findElements(By.xpath("//ul[@role ='listbox']//li"));
 	    System.out.println("Number of suggestions displayed in search box :: " +list.size());

 	    for(int i=0; i<list.size();i++) {
 	            System.out.println(list.get(i));

 	            if(list.get(i).getText().trim().contains("Selenium") || list.get(i).getText().trim().equalsIgnoreCase("Selenium")) {
 	            list.get(i).click();
 	            break;
	}
 	    }
 	    
	}

	}

