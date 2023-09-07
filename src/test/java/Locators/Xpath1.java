package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath1 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//address of email textfield using xpath attribute
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("HI");
		//address of password textfield using xpath conatins attribute
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Hello");
		Thread.sleep(3000);
		//address of create page by xpath text
		driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
		driver.close();

	}

}
