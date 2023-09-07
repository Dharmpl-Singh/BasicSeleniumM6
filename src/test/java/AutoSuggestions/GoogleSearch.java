package AutoSuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		//address of search textarea
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("phone");
		Thread.sleep(3000);
		//address of the list
		List<WebElement> allLists=driver.findElements(By.xpath("//li[@data-view-type='1']"));
		
		for(WebElement all:allLists)
		{
			System.out.println(all.getText());
		}
		
		driver.close();
		
		}

}
