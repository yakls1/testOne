package MyTestProject.DemoTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SimpleTest {
	
	@Test
	public void sample() {
		int a = 1;
		int b = 2;
		assertTrue(a+b ==3);
		
	}
	@Test
	public void sampleFaill() {
		int a = 5;
		int b = 5;
		assertTrue(a+b==10);
	}

}
