package listeners;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo2 {
@Test
	public void test4() {
		System.out.println("I am inside test4");
	}
 @Test
	public void test24() {
		System.out.println("I am inside test24");
		//Assert.assertTrue(false);
	}
	@Test
	public void test34() {
		System.out.println("I am inside test34");
		throw new SkipException("This test is skipped");
	}

}
