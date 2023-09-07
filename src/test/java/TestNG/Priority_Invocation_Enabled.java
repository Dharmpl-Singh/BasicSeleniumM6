package TestNG;

import org.testng.annotations.Test;

public class Priority_Invocation_Enabled {
	//1. main method
	@Test(enabled=false)
	public void demo1()
	{
		System.out.println("Hi demo1");
	}
	
	//2. main method
	@Test(priority=-6, invocationCount=2)
	public void demo2()
	{
		System.out.println("Hi demo2");
	}
	//3. main method
	@Test(priority=-5,invocationCount=3)
	public void demo3()
	{
		System.out.println("Hi demo3");
	}
	

}
