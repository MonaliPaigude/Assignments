package Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class daymonth {

	public static void main(String[] args) {
		
          WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\Java\\Project1\\Drivers\\chromedriver.exe");
         driver = new ChromeDriver();
         
         driver.manage().window().maximize();
         driver.get("https://secure.rezserver.com/flights/home/?refid=5696");
         driver.findElement(By.xpath("//*[@name='rs_chk_in']")).click();
         
         while(!driver.findElement(By.xpath("//*[@class='rs_cal_month']")).getText().contains("September"))
         {
                driver.findElement(By.xpath("//i[@class='rs_cal_arrow rs_icon rs_i_arrow_line_r']")).click();
         	
         }
         
         
         
         
        

}
}
