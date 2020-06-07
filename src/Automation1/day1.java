package Automation1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class day1 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver;
		
        System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\Java\\Project1\\Drivers\\chromedriver.exe");
         driver = new ChromeDriver();
         
         driver.manage().window().maximize();
         driver.get("https://www.makemytrip.com/");
         WebElement dateWidget = driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox dates inactiveWidget')]"));
         dateWidget.click();
         System.out.println("hello");
         
          while(!driver.findElement(By.xpath("//*[@class='DayPicker-Caption']")).getText().contains("October"))
         {
                driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
         	
         }
       

         List<WebElement> dates=driver.findElements(By.xpath("//body[@class='desktop']/div[@id='root']/div[@class='bgGradient']/div[@class='minContainer']/div/div[@class='widgetSection appendBottom40']/div[@class='fsw widgetOpen']/div[contains(@class,'fsw_inner')]/div[@class='fsw_inputBox dates inactiveWidget activeWidget']/div[@class='datePickerContainer']/div[@class='flightCalOverlay']/div[@class='dayPickerFlightWrap']/div[@class='RangeExample oneWay']/div[@class='DayPicker']/div[@class='DayPicker-wrapper']/div[@class='DayPicker-Months']/div[1]"));

         for (WebElement cell: dates){
         System.out.println("hello1");
         Thread.sleep(2000);

         //Select 13th Date
         if (cell.getText().contains("13")){
         System.out.println("hello2");
         Thread.sleep(2000);

        
         cell.findElement(By.xpath("//div[@class='DayPicker-wrapper']//div[1]//div[3]//div[3]//div[3]//div[1]//p[1]")).click();
         System.out.println("Departure date selected");
         Thread.sleep(2000);
         //break;
         }
         driver.close();
	}

}
}