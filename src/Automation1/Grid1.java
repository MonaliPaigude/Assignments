package Automation1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Grid1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\Java\\Project1\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        int sum=0;
        WebElement table= driver.findElement(By.cssSelector("table[id='product']"));
     	int rowcount=table.findElements(By.cssSelector("table[id='product']")).size();
     	int column= table.findElements(By.cssSelector("table[id='product'] td:nth-child(3)")).size();
     	
     	for(int i=0;i<column;i++)
     	{
     	 //System.out.println(table.findElements(By.cssSelector("table[id='product'] td:nth-child(3)")).get(i).getText());
     	 String value=table.findElements(By.cssSelector("table[id='product'] td:nth-child(3)")).get(i).getText();
     	 int valueinteger=Integer.parseInt(value);
     	 sum=sum+valueinteger;
     	 
     	}
     	System.out.println(sum);
     	System.out.println(driver.findElement(By.xpath("//table[@id='product']//tbody//tr[3]//td[2]")).getText());
     	
     	System.out.println(driver.findElement(By.xpath("//*[@id='displayed-text']")).getAttribute("style"));
     	driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
     	System.out.println(driver.findElement(By.xpath("//*[@id='displayed-text']")).getAttribute("style"));
     	if(driver.findElement(By.xpath("//*[@id='displayed-text']")).getAttribute("style").contains("display: none"))
     			{
     		System.out.println("its enabled");
     		Assert.assertTrue(true);
     			}
     	else {
     		Assert.assertTrue(false);
     		
     	}
     	
     	//Mouse-Hover
     	
     	Actions a=new Actions(driver);
     	a.moveToElement(driver.findElement(By.xpath("//button[@id='mousehover']"))).build().perform();
     	
	}

}
