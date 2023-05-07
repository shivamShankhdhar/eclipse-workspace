package selenium_lab_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class SubmitButtonTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://www.techlistic.com/p/selenium-practice-form.html";
		driver.get(baseURL);
		driver.findElement(By.id("submit")).click();
		System.out.println("Submit button clicked");
		System.out.println("Programmed by Shivam Shankhdhar");
		driver.close();
	}
}