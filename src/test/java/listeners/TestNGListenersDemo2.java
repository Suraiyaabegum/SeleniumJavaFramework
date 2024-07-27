package listeners;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGListenersDemo2 {
	
	@Test
	public void test4() {
		System.out.println("I am Inside Test 4");
	}
	@Test
	public void test5() {
		System.out.println("I am Inside Test 5");
		
	}
	@Test
	public void test6() {
		System.out.println("I am Inside Test 6");
		throw new SkipException("This test is Skipped");
	}
}