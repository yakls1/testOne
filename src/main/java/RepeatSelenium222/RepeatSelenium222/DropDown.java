package RepeatSelenium222.RepeatSelenium222;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utils.AfterBefore;
import utils.Common;

public class DropDown extends AfterBefore {

	@Test
	public void test1() {
		driver.get("http://www.leafground.com/home.html");
		Common.sleep(1);
		Common.header(driver);
		driver.findElement(By.cssSelector("[alt='ListBox']")).click();
		Common.sleep(2);
		String header = driver.getTitle();
		assertEquals(header, "TestLeaf - Interact with Drop downs");

	}

	@Test
	public void test2() { // Select training program using Index
		Select dropdown1 = new Select(driver.findElement(By.id("dropdown1")));
		int index = 2;
		dropdown1.selectByIndex(2);
		String checkIndex = driver.findElement(By.xpath("//*[@id='dropdown1']/option[" + (index + 1) + "]")).getText();
		assertEquals(checkIndex, "Appium");
		Common.sleep(1);

	}

	@Test
	public void test3() {// Select training program using Text
		Select dropdown2 = new Select(driver.findElement(By.name("dropdown2")));
		dropdown2.selectByVisibleText("UFT/QTP");

	}

	@Test
	public void test4() { // Select training program using Value
		Select dropdown2 = new Select(driver.findElement(By.id("dropdown3")));
		dropdown2.selectByValue("1");

	}

	@Test
	public void test5() {// Get the number of dropdown options
		List<WebElement> list = driver.findElements(By.xpath("//select[@id='dropdown3']/option"));
		int sizeOfList = list.size();
		System.out.println(sizeOfList);

	}

	@Test
	public void test6() {
		WebElement element = driver.findElement(By.xpath("(//div/select)[5]"));
		element.sendKeys(Keys.ARROW_DOWN);
		
	}
	
	@Test
	public void test7() {
		driver.findElement(By.xpath("(//select[@multiple]//option)[2]")).click();
		Common.sleep(3);
		
	}

}
