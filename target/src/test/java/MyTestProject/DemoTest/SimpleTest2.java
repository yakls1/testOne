package MyTestProject.DemoTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SimpleTest2 {
	
	@Test
	public void sample() {
		int a = 5;
		int b = 5;
		assertTrue(a+b==10);
	}

}
