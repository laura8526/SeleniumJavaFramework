package ignoreTests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//If you want to ignore all the test cases of the particular 
//class use -> @Ignore at the class level
public class TestNGIgnoreDemo {

	
	@Test
	//@Ignore
	public void test1() {
		System.out.println("I am inside Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside Test2");
	}
}
