package Assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
Assignment: openbrowser enter url 
https://www.selenium.dev/selenium/docs/api/java/index?overview-summary.html 
switch control to frame 1 click on org.openqa.selenium then 
shift control to frame 2 click on webdriver click on help in web page 
 */

public class Assignment_2 {

	public static void main(String[] args) throws Throwable{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index?overview-summary.html");
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("(//a[text()='Help'])[1]")).click();
		
	}

}
