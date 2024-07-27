package demo;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {

	@Test
	public void test1() {
		System.out.println("I am in Test 1");
	}
	
	@Test(retryAnalyzer=listeners.RetryAnalyzer.class)
	public void test2() {
		System.out.println("I am in Test 2");
		int i=1/0;
		System.out.println(i);
	}
	
	@Test
	public void test3() {
		System.out.println("I am in Test 3");
		Assert.assertTrue(1>0);
	}
}
