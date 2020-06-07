package Automation1;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen1 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\Java\\Project1\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://google.com");
		
		File screen1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen1,new File("D:\\Monali\\screenshot2.png"));
		System.out.println("Hello");
		
		
		/*TakesScreenshot scrShot =((TakesScreenshot)driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destDir = new File("D:\\Monali\\screenshot.png"); // path only
		FileUtils.copyFile(srcFile, destDir);*/
		
	}

}
