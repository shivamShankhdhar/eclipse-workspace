package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstscript {
	 public static void main(String[] args) {
		 System.setProperty("webDriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Selenium4\\chromedriver_win32.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.cdac.in/");
		 driver.close();
		  }
}