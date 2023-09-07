package practicePrograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchAutoSuggestion {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("phone");
		Thread.sleep(3000);		
		/*List<WebElement> allLists=driver.findElements(By.xpath("//li[@data-view-type='1']"));
		for(WebElement all:allLists)
		{
			System.out.println(all.getText());
		}*/
		WebElement data=driver.findElement(By.xpath("(//li[@data-view-type='1'])[4]"));
		System.out.println(data.getText());
		
		driver.close();

	}

}
