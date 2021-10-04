package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Common {
	
	public static void sleep(int seconds){
		try {
			Thread.sleep(1000 * seconds);
		}catch (InterruptedException e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	
	public static void header(WebDriver driver) {
		String header = driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);
		Assert.assertEquals(header, "Locators and Selenium Interactions");
		
	}
	
	

}
