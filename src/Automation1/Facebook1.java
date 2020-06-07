package Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;



public class Facebook1 {

	public static void main(String[] args) {
		
		WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\Java\\Project1\\Drivers\\chromedriver.exe");
         driver = new ChromeDriver();
         
         driver.manage().window().maximize();

        driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("AFFDFGG");
		driver.findElement(By.name("pass")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		//System.out.println("Before Switching");
		System.out.println(driver.getTitle());

		Set<String> ids=driver.getWindowHandles();

		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		//String childid=it.next();
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).click();
	System.out.println(driver.findElement(By.xpath("//*[@data-ownerid='email']//*[@role='alert']")).getText());
		
	}

}
