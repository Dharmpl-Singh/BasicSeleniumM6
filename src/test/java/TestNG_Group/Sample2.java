package TestNG_Group;

import org.testng.annotations.Test;

public class Sample2 {
	@Test(groups="smoke")
	public void sample2()
	{
		System.out.println("Hi Sample2");
	}
	
	@Test
	public void sample3()
	{
		System.out.println("Hi Sample3");
	}


}
