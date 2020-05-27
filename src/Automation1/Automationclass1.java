package Automation1;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class Automationclass1 {

	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\Java\\Project1\\Drivers\\chromedriver.exe");
         driver = new ChromeDriver();
         
         driver.manage().window().maximize();
         driver.get("https://facebook.com/");
 		
 		
     
        driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("AFFDFGG");
		driver.findElement(By.name("pass")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		System.out.println(driver.findElement(By.id("email")).getText());
		
		 //driver.get("http://gmail.com");
		//driver.findElement(By.id("identifierId")).sendKeys("monali.paigude@gmail.com");
 		//driver.findElement(By.id("identifierNext")).click();


  
		
					
        }		
		
		
	
	
}

	
         
 		
         
         
         
       