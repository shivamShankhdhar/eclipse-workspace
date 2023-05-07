package selenium_lab_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckBoxTesting {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://www.techlistic.com/p/selenium-practice-form.html";
		driver.get(baseURL);
		driver.findElement(By.id("profession-0")).click();
		System.out.println("Radio profession 1 clicked");
		driver.findElement(By.id("profession-1")).click();
		System.out.println("Radio profession 2 clicked");
		WebElement option1 = driver.findElement(By.id("profession-0"));
		WebElement option2 = driver.findElement(By.id("profession-1"));
		System.out.println("----------OUTPUT-----------");
		if(option1.isSelected()) {
			System.out.println("Profession 1 selected");
		}
		if(option2.isSelected()) {
			System.out.println("Profession 2 selected");
		}
		System.out.println("Programmed by Shivam Shankhdhar");
		driver.close();
	}
}

