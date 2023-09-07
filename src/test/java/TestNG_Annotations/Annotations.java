package TestNG_Annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations {
	WebDriver driver;
	@BeforeMethod
	public void opening()
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void fb()
	{
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void amazon()
	{
		driver.get("https://www.amazon.in/");
	}
	
	@AfterMethod
	public void closing()
	{
		driver.close();
	}

}
