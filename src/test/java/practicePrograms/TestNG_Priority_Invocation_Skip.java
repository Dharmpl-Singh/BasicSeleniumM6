package practicePrograms;

import org.testng.annotations.Test;

public class TestNG_Priority_Invocation_Skip {
	@Test(priority=0)
	public void demo1()
	{
		System.out.println("demo1()");
	}
	@Test(priority=-1, enabled=false)
	public void demo2()
	{
		System.out.println("demo2()");
	}
	@Test(priority=-2, invocationCount=-2)
	public void demo3()
	{
		System.out.println("demo3()");
	}

}
