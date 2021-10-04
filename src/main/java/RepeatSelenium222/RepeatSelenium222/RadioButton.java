package RepeatSelenium222.RepeatSelenium222;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.AfterBefore;
import utils.Common;

public class RadioButton extends AfterBefore {

	@Test
	public void test1() {
		driver.get("http://www.leafground.com/home.html");
		Common.sleep(1);
		Common.header(driver);
		driver.findElement(By.cssSelector("[alt='Radio Button']")).click();
		Common.sleep(2);
		String header = driver.getTitle();
		assertEquals(header, "TestLeaf - Interact with Radio buttons");

	}

	@Test
	public void test2() { // Are you enjoying the classes?
		WebElement element = driver.findElement(By.xpath("//label[@for='yes']"));
		element.click();
		String yes = element.getText();
		assertEquals(yes, "Yes");
		Common.sleep(3);

	}

	@Test
	public void test3() { // Find default selected radio button

		List<WebElement> list = driver.findElements(By.xpath("//label//input[@name='news']"));

		int index = 0;
		for (WebElement a : list) {
			if (list.get(index++).isSelected()) {
				System.out.println(index);
			}
		}

		switch (index) {
		case 1:
			System.out.println("Unchecked");

			break;
		case 2:
			System.out.println("Checked");

		default:
			break;
		}

	}

	@Test
	public void test4() {// Select your age group (Only if choice wasn't selected)
		List<WebElement> list = driver.findElements(By.xpath("//input[@name = 'age']"));

		int index = 0;
		for (WebElement a : list) {

			if (list.get(index++).isSelected()) {

				System.out.println(index);
				break;
			}
		}

		switch (index) {
		case (1):
			System.out.println(" 1 - 20 years");
			break;
		case (2):
			System.out.println("21 - 40 years");
			break;
		case (3):
			System.out.println("Above 40 years");
			break;

		default:
			break;
		}

	}

}
