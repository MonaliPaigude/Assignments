package Automation1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dayselection {

	public static void main(String[] args) {
		WebDriver driver;
		
        System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\Java\\Project1\\Drivers\\chromedriver.exe");
         driver = new ChromeDriver();
         
         driver.manage().window().maximize();
         driver.get("https://www.makemytrip.com/");
         
        // driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
         //driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox dates inactiveWidget')]")).click();
         
       /* while(!driver.findElement(By.xpath("//*[@data-cy='")).getText().contains("October"))
        {
        	
        }*/
         
         
        /* List<WebElement> dates=driver.findElements(By.xpath("//*[@class='DayPicker-Day']"));
         int count=driver.findElements(By.xpath("//*[@class='DayPicker-Day']")).size();
         
         for (int i=0;i<count;i++) {
        	 String text=driver.findElements(By.xpath("//*[@class='DayPicker-Day']")).get(i).getText();
        	 if(text.equalsIgnoreCase("12"))
        	 {
        		 driver.findElements(By.xpath("//*[@class='DayPicker-Day']")).get(i).getText();
        		 break;
        		 
        	 }*/
       //WebElement dateWidget = driver.findElement(your locator);
         WebElement dateWidget = driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox dates inactiveWidget')]"));
         dateWidget.click();
         System.out.println("hello");
         //List<WebElement> dates =dateWidget.findElements(By.tagName("p"));

         List<WebElement> dates=driver.findElements(By.xpath("//body[@class='desktop']/div[@id='root']/div[@class='bgGradient']/div[@class='minContainer']/div/div[@class='widgetSection appendBottom40']/div[@class='fsw widgetOpen']/div[contains(@class,'fsw_inner')]/div[@class='fsw_inputBox dates inactiveWidget activeWidget']/div[@class='datePickerContainer']/div[@class='flightCalOverlay']/div[@class='dayPickerFlightWrap']/div[@class='RangeExample oneWay']/div[@class='DayPicker']/div[@class='DayPicker-wrapper']/div[@class='DayPicker-Months']/div[1]"));

         for (WebElement cell: dates){
             System.out.println("hello1");
         //Select 13th Date
         if (cell.getText().contains("13")){
             System.out.println("hello2");
             //cell.click();
         cell.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--selected']//p[contains(text(),'13')]")).click();
         break;
         }
         
         
         
         }}}
	


