package Basic_Programs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RoughPrograms {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//driver.get("https://www.facebook.com/");
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		driver.navigate().to("https://www.amazon.in/");
		//driver.navigate().back();
		//Thread.sleep(3000);
		//driver.navigate().forward();
		//driver.navigate().refresh();
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		WebElement ele=driver.findElement(By.id("ap_customer_name"));
		ele.sendKeys("ABCDEFGHI");
		ele.clear();
		ele=driver.findElement(By.name("email"));
		ele.sendKeys("1234567891");
		ele.clear();
		driver.close();
	}

}
