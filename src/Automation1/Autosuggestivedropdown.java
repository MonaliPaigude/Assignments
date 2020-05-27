package Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\Java\\Project1\\Drivers\\chromedriver.exe");
         driver = new ChromeDriver();
         
         driver.manage().window().maximize();
         driver.get("https://www.makemytrip.com/");
         
         
         driver.findElement(By.xpath("//*[@id='fromCity']")).click();
         //To iterate the same Xpath on multiple lines//
         
         WebElement source=driver.findElement(By.xpath("////[@class='react-autosuggest__input react-autosuggest__input--open']"));
         source.click();
         source.clear();
         source.sendKeys("MUM");
         Thread.sleep(2000);
         source.sendKeys(Keys.ENTER);
         
        /* WebElement destination=driver.findElement(By.id("toCity"));
         destination.clear();
         destination.sendKeys("DEL");
         Thread.sleep(2000);
         source.sendKeys(Keys.ARROW_DOWN);
         source.sendKeys(Keys.ENTER);*/
         
         
         

	}

}
