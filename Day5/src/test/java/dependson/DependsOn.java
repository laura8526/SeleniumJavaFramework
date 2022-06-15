package dependson;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {

	@Test(priority=2)
	public void methodA() {
		Assert.assertTrue(true);
		System.out.println("MethodA pass");
	}
	@Test(dependsOnMethods= {"methodA"},priority=1)
	public void methodB() {
		System.out.println("MethodB Pass");
	}
	@Test(dependsOnMethods= {"methodA","methodB"},priority=0)
	public void methodC() {
		System.out.println("MethodC Pass");
	}
}
