package practicePrograms;

import org.testng.annotations.Test;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	@Test
	public void amazon()
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.close();
	}

}
