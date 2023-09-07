package practicePrograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigleDropDown {

	public static void main(String[] args) throws Throwable{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement options = driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(options);
		s.selectByIndex(5);
		Thread.sleep(3000);
		s.selectByValue("search-alias=electronics");
		Thread.sleep(3000);
		s.selectByVisibleText("Movies & TV Shows");
		Thread.sleep(3000);
		System.out.println(s.isMultiple());
		List<WebElement> allOptions=s.getOptions();
		System.out.println(allOptions.size());
		for(WebElement all:allOptions)
		{
			System.out.println(all.getText());
		}
		
		
	}

}
