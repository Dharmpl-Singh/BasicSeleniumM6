package Scroll_Bar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollingWithoutCoOrdinates {

	public static void main(String[] args) throws Throwable{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement career = driver.findElement(By.xpath("//a[text()='Careers']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",career);
		Thread.sleep(3000);
		//career.click();
		js.executeScript("arguments[0].click()", career);
		

	}

}
