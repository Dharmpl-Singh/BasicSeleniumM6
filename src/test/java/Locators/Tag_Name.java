package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//print all the link webElements in the console
public class Tag_Name {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		for(WebElement b:allLinks)
		{
			System.out.println(b.getText());
		}
		driver.close();
	}

}
