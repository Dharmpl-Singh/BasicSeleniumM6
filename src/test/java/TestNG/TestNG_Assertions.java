package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Assertions {
	
	@Test
	public void asserstions()
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		String title=driver.getTitle();
		//using Hard Assert
		//Assert.assertEquals(title, "adfgshr");
		//SoftAssert
		SoftAssert s=new SoftAssert();
		s.assertEquals(title, "asfdakfdk");
		System.out.println(driver.getCurrentUrl());
	}

}
