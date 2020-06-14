package Automation1;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\Java\\Project1\\Drivers\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
 	    Thread.sleep(1000);
	   
 	    List<WebElement> list = driver.findElements(By.xpath("//ul[@id ='listbox']//li"));
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


