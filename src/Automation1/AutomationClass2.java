package Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationClass2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selinium\\Java\\Project1\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://gmail.com");
		System.out.println(driver.getTitle());
		//driver.findElement(By.id("identifierId")).sendKeys("monali.paigude@gmail.com");
 		//driver.findElement(By.id("identifierNext")).click();
		
		//driver.navigate().to("http://yahoo.com");
		//System.out.println(driver.getTitle());
        //driver.navigate().back();
		//driver.close();
		
	

	}

}
