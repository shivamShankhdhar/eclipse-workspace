package selenium_lab_test;

import java.lang.StackWalker.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://www.techlistic.com/p/selenium-practice-form.html";
		driver.get(baseURL);
		driver.findElement(By.id("profession-0")).click();
		System.out.println("Radio profession 1 clicked");
		
		Select continents = new Select(driver.findElement(By.name("continents")));
		continents.selectByIndex(0);
		System.out.println("Option 1 selected");
		continents.selectByIndex(1);
		System.out.println("Option 2 selected");
		continents.selectByIndex(2);
		System.out.println("Option 3 selected");
		continents.selectByIndex(3);
		System.out.println("Option 4 selected");
		continents.selectByIndex(4);
		System.out.println("Option 5 selected");
		continents.selectByIndex(5);
		System.out.println("Option 6 selected");
		continents.selectByIndex(6);
		System.out.println("Option 7 selected");
		
		System.out.println("Programmed by Shivam Shankhdhar");
		driver.close();
	}
	

}
