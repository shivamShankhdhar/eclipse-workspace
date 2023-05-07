package selenium_lab_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class Sel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://www.techlistic.com/p/selenium-practice-form.html";
		driver.get(baseURL);
		driver.findElement(By.name("firstname")).sendKeys("shivam");
		String expected = "shivam";
		WebElement firstname = driver.findElement(By.name("firstname"));		
		if(firstname.getAttribute("value").equals(expected)) {
			System.out.println("Expected output");
		}else {
			System.out.println("Not Expected output");
		}
		System.out.println("Programmed by Shivam Shankhdhar");
		driver.close();
	}
}


