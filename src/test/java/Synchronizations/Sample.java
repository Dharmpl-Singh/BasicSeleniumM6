package Synchronizations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.id("email"));
		//using explicit wait
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("Hi");
		WebElement click=driver.findElement(By.linkText("Forgotten password?"));
		wait.until(ExpectedConditions.elementToBeClickable(click));
		click.click();
	}

}
