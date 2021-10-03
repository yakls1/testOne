package RepeatSelenium222.RepeatSelenium222;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.AfterBefore;
import utils.Common;

public class Image extends AfterBefore {

	@Test
	public void test1() { // go to button and check you inside
		driver.get("http://www.leafground.com/home.html");
		Common.sleep(1);
		Common.header(driver);
		driver.findElement(By.cssSelector("[alt='Images']")).click();
		Common.sleep(2);
		String header = driver.getTitle();
		assertEquals(header, "TestLeaf - Interact with Images");

	}

	@Test
	public void test2() { // Click on this image to go home page and back
		driver.findElement(By.xpath("(//div/img)[1]")).click();
		driver.navigate().back();
		Common.sleep(2);

	}

	@Test
	public void test3() {
		String broke = driver.findElement(By.xpath("(//img[contains(@src,'images')])[3]")).getAttribute("src");
		driver.get(broke);
		System.out.println(broke);

		String checkbroke = driver.getTitle();
		boolean finalCheckbroke;
		if (checkbroke.equals("HTTP Status 404 – Not Found")) {
			finalCheckbroke = false;
			System.out.println("Link 2 in Image doesn't work");
		} else {
			finalCheckbroke = true;
		}
		driver.navigate().back();
		Assert.assertEquals(finalCheckbroke, true);
	}

	@Test
	public void test4() {
		WebElement mouse = driver.findElement(By.xpath("(//div/img)[3]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mouse).click().perform();
		Common.sleep(2);

	}

}
