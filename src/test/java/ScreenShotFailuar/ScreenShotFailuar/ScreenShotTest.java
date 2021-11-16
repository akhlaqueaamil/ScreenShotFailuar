package ScreenShotFailuar.ScreenShotFailuar;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListerner.class)
public class ScreenShotTest extends Base{
	
	@BeforeMethod
	public void setUp() {
		 initilization();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void takeScreenShotTest1() {
		Assert.assertEquals(false, true);
		
	}
	@Test
	public void takeScreenShotTest2() {
		Assert.assertEquals(false, true);
		
	}
	@Test
	public void takeScreenShotTest3() {
		Assert.assertEquals(false, true);
		
	}


}
