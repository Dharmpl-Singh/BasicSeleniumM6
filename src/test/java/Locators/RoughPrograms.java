package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;
import org.openqa.selenium.WebElement;

public class RoughPrograms {

	public static void main(String[] args) throws Throwable{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//System.out.println(driver.getTitle().contains("Facebook-log in or sign up"));
		driver.findElement(By.id("email")).sendKeys("dharmpal.singh");
		driver.findElement(By.name("pass")).sendKeys("dharmpal");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.name("pass")).clear();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.partialLinkText("password")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("dharmapl");
		driver.findElement(By.cssSelector("input[type='text']")).clear();
		Thread.sleep(3000);
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		for(WebElement obj:allLinks)
		{
			System.out.println(obj.getText());
		}
		driver.close();

	}

}
