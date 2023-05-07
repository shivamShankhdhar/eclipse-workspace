package selenium_lab_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class TestGenderRadio {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://www.techlistic.com/p/selenium-practice-form.html";
		driver.get(baseURL);
		driver.findElement(By.id("sex-0")).click();
		
		System.out.println("Radio button 1 clicked");
		driver.findElement(By.id("sex-1")).click();
		System.out.println("Radio button 2 clicked");
		
		WebElement option2 = driver.findElement(By.id("sex-1"));		
		if(option2.isSelected()) {
			System.out.println("Expected output");
		}else {
			System.out.println("Not Expected output");
		}
		System.out.println("Programmed by Shivam Shankhdhar");
		driver.close();
	}
}


