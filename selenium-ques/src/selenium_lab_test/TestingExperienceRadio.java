package selenium_lab_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class TestingExperienceRadio {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://www.techlistic.com/p/selenium-practice-form.html";
		driver.get(baseURL);
		driver.findElement(By.id("exp-0")).click();
		System.out.println("Radio experience 1 clicked");
		
		driver.findElement(By.id("exp-1")).click();
		System.out.println("Radio experience 2 clicked");
		
		driver.findElement(By.id("exp-2")).click();
		System.out.println("Radio experience 3 clicked");
		
		driver.findElement(By.id("exp-3")).click();
		System.out.println("Radio experience 4 clicked");
		
		driver.findElement(By.id("exp-4")).click();
		System.out.println("Radio experience 5 clicked");
		
		driver.findElement(By.id("exp-5")).click();
		System.out.println("Radio experience 6 clicked");
		
		driver.findElement(By.id("exp-6")).click();
		System.out.println("Radio experience 7 clicked");
		
		
		WebElement option1 = driver.findElement(By.id("exp-0"));
		WebElement option2 = driver.findElement(By.id("exp-1"));
		WebElement option3 = driver.findElement(By.id("exp-2"));
		WebElement option4 = driver.findElement(By.id("exp-3"));
		WebElement option5 = driver.findElement(By.id("exp-4"));
		WebElement option6 = driver.findElement(By.id("exp-5"));
		WebElement option7 = driver.findElement(By.id("exp-6"));
		
		System.out.println("--------OUTPUT--------");
		if(option1.isSelected()) {
			System.out.println("Experience 1 selected");
		}else if(option2.isSelected()) {
			System.out.println("Experience 2 selected");
		}
		else if(option3.isSelected()) {
			System.out.println("Experience 3 selected");
		}else if(option4.isSelected()) {
			System.out.println("Experience 4 selected");
		}else if(option5.isSelected()) {
			System.out.println("Experience 5 selected");
		}else if(option6.isSelected()) {
			System.out.println("Experience 6 selected");
		}else if(option7.isSelected()) {
			System.out.println("Experience 7 selected");
		}
		System.out.println("Programmed by Shivam Shankhdhar");
		driver.close();
	}

}

