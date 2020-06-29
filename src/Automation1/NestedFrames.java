package Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\Java\\Project1\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
        
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
        
        //driver.switchTo().frame("frame-top");
        //driver.switchTo().frame("frame-bottom");
        //System.out.println(driver.findElement(By.xpath("//frame[@name='frame-bottom']//#document//html//head//body")).getText());
        
        System.out.println(driver.findElements(By.tagName("frameset")).size());
        
	}

}
