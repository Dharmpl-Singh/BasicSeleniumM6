package dropDownPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleDropDown {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s=new Select(dropDown);
		s.selectByIndex(4);
		Thread.sleep(3000);
		s.selectByValue("search-alias=baby");
		Thread.sleep(3000);
		s.selectByVisibleText("Books");
		System.out.println(s.isMultiple());
		List<WebElement> options = s.getOptions();
		for(WebElement o:options)
		{
			System.out.println(o.getText());
		}
		
		
	}

}
