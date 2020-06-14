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



public class Practical1 {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\Java\\Project1\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        int sum=0;
        
        driver.findElement(By.xpath("//input[@value='radio2']")).click();
        driver.findElement(By.xpath("//*[@id='autocomplete']")).click();
        driver.findElement(By.xpath("//*[@id='autocomplete']")).sendKeys("India");
        Thread.sleep(1000);
        
        /*driver.findElement(By.xpath("//*[@id='autocomplete']")).sendKeys(Keys.DOWN);
        driver.findElement(By.xpath("//*[@id='autocomplete']")).sendKeys(Keys.DOWN);
        driver.findElement(By.xpath("//*[@id='autocomplete']")).sendKeys(Keys.DOWN);
        driver.findElement(By.xpath("//*[@id='autocomplete']")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id='autocomplete']")).getText());*/
        
        List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li[2]"));
 	    System.out.println("Number of suggestions displayed in search box :: " +list.size());

 	    for(int i=0; i<list.size();i++) {
 	      System.out.println(list.get(i));

 	            if(list.get(i).getText().trim().contains("India") || list.get(i).getText().trim().equalsIgnoreCase("India")) {
 	           list.get(i).click();
 	           break;
	}
 	   }
 	    
 	    //STATIC DROP_DOWN 
 	    Select S=new Select(driver.findElement(By.xpath("//*[@name='dropdown-class-example']")));
 	   
 	 
 	   
 	    driver.findElement(By.xpath("//*[@name='dropdown-class-example']")).click(); 	    
 	    driver.findElement(By.xpath("//*[@name='dropdown-class-example']//option[3]")).click();	
 	    WebElement element=driver.findElement(By.xpath("//*[@name='dropdown-class-example']"));
 	    element.sendKeys(Keys.ESCAPE);
 	  
 	             //Checkboxes
 	    
 	    driver.findElement(By.id("checkBoxOption2")).click();
 	   System.out.println(driver.findElement(By.id("checkBoxOption2")).isSelected());
 	   System.out.println("Checkboxes");
 	   System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
 	   
 	          
 	   //WindowSwitch
 	   driver.findElement(By.xpath("//button[@id='openwindow']")).click();
 	   System.out.println(driver.getTitle());
 	   Set<String>ids=driver.getWindowHandles();
 	   Iterator<String> it=ids.iterator();
 	   String parentid=it.next();
 	   String childid=it.next();
 	   driver.switchTo().window(childid);
 	   System.out.println(driver.getTitle());
 	   
 	   //Switch Tab
 	  
 	  driver.findElement(By.xpath("//a[@id='opentab']")).click();
 	  driver.findElement(By.xpath("//a[@id='opentab']")).sendKeys(Keys.CONTROL,Keys.ENTER);
 	  
 	  
	//Alert
 	  String abc="Monali";
 	  driver.findElement(By.xpath("//*[@name='enter-name']")).sendKeys(abc);
 	  driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
 	  System.out.println(driver.switchTo().alert().getText());
 	  driver.switchTo().alert().accept();
 	  driver.findElement(By.xpath("//*[@id='confirmbtn']")).click();
 	 System.out.println(driver.switchTo().alert().getText());
 	  driver.switchTo().alert().dismiss();
 
 	  
 	  //Grid Example
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
     	
     	//Show-Hide Code
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
     	
     	//Mouse-Hover!     	   	
     	Actions a=new Actions(driver);
     	a.moveToElement(driver.findElement(By.xpath("//button[@id='mousehover']"))).build().perform();
     	
 	    
 	   
 	    
 	    Thread.sleep(2000);
 	  System.out.println("Hello1");
 	  driver.close();
 	  
 	    

 	    
 	   
        
        
		    
}
}

	
