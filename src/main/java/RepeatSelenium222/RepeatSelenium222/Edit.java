package RepeatSelenium222.RepeatSelenium222;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.AfterBefore;
import utils.Common;

public class Edit extends AfterBefore {

	@Test
	public void test1() { // go to Edit button and check you inside

		driver.get("http://www.leafground.com/home.html");
		Common.sleep(1);
		Common.header(driver);

		driver.findElement(By.xpath("//h5[text()='Edit']")).click();
		Common.sleep(2);

		String header = driver.getTitle();

		assertEquals(header, "TestLeaf - Interact with Edit Fields");

	}

	@Test
	public void test2() { // first Enter your email address

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("yakls@mail.ru");
		Common.sleep(2);
		String checkEmail = email.getAttribute("value");
		System.out.println(checkEmail);
		assertEquals(checkEmail, "yakls@mail.ru");

		Common.sleep(2);

	}

	@Test
	public void test3() { // Append a text and press keyboard tab
		WebElement append = driver.findElement(By.cssSelector("[value ='Append ']"));
		append.sendKeys("Hi", Keys.TAB);

	}

	@Test
	public void test4() { // Get default text entered
		String getText = driver.findElement(By.cssSelector("[value='TestLeaf']")).getAttribute("value");
		assertEquals(getText, "TestLeaf");

	}

	@Test
	public void test5() { // Clear the text

		WebElement clear = driver.findElement(By.cssSelector("[value='Clear me!!']"));
		clear.clear();
		String checkClearString = clear.getAttribute("value");
		Common.sleep(2);
		assertEquals(checkClearString, "");

	}

	@Test
	public void test6() { // Confirm that edit field is disabled
		WebElement field = driver.findElement(By.cssSelector("[disabled='true']"));
		boolean checkField = field.isEnabled();
		assertEquals(checkField, false);
	}

}
