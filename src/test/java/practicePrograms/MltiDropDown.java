package practicePrograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class MltiDropDown {

	public static void main(String[] args) throws Throwable{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		WebElement options = driver.findElement(By.id("cars"));
		Select s=new Select(options);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("299");
		Thread.sleep(3000);
		//s.selectByVisibleText("INR 300 - INR 399 ( 1 ) ");
		Thread.sleep(3000);
		//s.deselectByIndex(2);
		//s.deselectAll();
		
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions.size());
		for(WebElement e1:allOptions)
		{
			System.out.println(e1.getText());
		}
		List<WebElement> allSelected=s.getAllSelectedOptions();
		for(WebElement e2:allSelected)
		{
			System.out.println("Selected Options:"+e2.getText());
		}
	}

}
