package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_Name_LinkText_PartialLinkText {

	public static void main(String[] args) throws Throwable {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			//fetching the address of email text field
			driver.findElement(By.id("email")).sendKeys("Dharmpal");
			//address of password
			driver.findElement(By.name("pass")).sendKeys("dharmpalpassword");
			Thread.sleep(3000);
			//address of link using linkText()
			driver.findElement(By.linkText("Forgotten password?")).click();
			Thread.sleep(3000);
			//address of link by using partialLinkText
			//driver.findElement(By.partialLinkText("Forgotten")).click();
			driver.close();

	}

}
