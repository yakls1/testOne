package RepeatSelenium222.RepeatSelenium222;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.AfterBefore;
import utils.Common;

public class HyperLink extends AfterBefore {

	@Test
	public void test1() {
		driver.get("http://www.leafground.com/home.html");
		Common.sleep(1);
		Common.header(driver);

		driver.findElement(By.cssSelector("[alt='Link']")).click();
		Common.sleep(1);

	}

	@Test
	public void test2() { // Go to Home Page and back
		driver.findElement(By.xpath("//a[text() ='Go to Home Page']")).click();
		Common.sleep(1);
		Common.header(driver);
		driver.navigate().back();

	}

	@Test
	public void test3() {// Find where am supposed to go without clicking me?
		String getLink = driver.findElement(By.xpath("//a[contains(text(), 'Find')]")).getAttribute("href");
		System.out.println(getLink);
	}

	@Test
	public void test4() { // Verify am I broken?

		driver.findElement(By.xpath("//a[contains(text(), 'Verify')]")).click();
		Common.sleep(1);
		String title = driver.getTitle();
		boolean cheakPage = true;
		if (title.equals("HTTP Status 404 – Not Found")) {
			cheakPage = false;
		} else {
			cheakPage = true;
		}

		assertEquals(cheakPage, true);

	}

	@Test

	public void test5() { // How many links are available in this page?
		Common.sleep(1);
		driver.navigate().back();

		List<WebElement> links = driver.findElements(By.tagName("a"));
		int sizeOfLinks = links.size();
		System.out.println(sizeOfLinks);
	}

}
