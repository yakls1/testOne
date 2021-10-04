package RepeatSelenium222.RepeatSelenium222;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.AfterBefore;
import utils.Common;

public class Button extends AfterBefore {

	@Test
	public void test1() { // go to button and check you inside
		driver.get("http://www.leafground.com/home.html");
		Common.sleep(1);
		Common.header(driver);
		driver.findElement(By.xpath("//h5[text()='Button']")).click();
		Common.sleep(2);
		String header = driver.getTitle();
		assertEquals(header, "TestLeaf - Interact with Buttons");

	}

	@Test
	public void test2() { // Click button to travel home page and go back

		driver.findElement(By.id("home")).click();

		Common.header(driver);
		Common.sleep(2);
		driver.navigate().back();
		String header = driver.getTitle();
		assertEquals(header, "TestLeaf - Interact with Buttons");

	}

	@Test
	public void test3() { // Find position of button (x,y)

		Point posicion = driver.findElement(By.id("position")).getLocation();

		int x = posicion.getX();
		int y = posicion.getY();
		System.out.println("Posicion = "+x + "x" + y);

	}

	@Test
	public void test4() { // Find button color
		String color = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(color);

	}

	@Test
	public void test5() { // Find the height and width
		Dimension size = driver.findElement(By.id("size")).getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println("size= " + height + "x" + width);
	}

}
