package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		//address of course element
		WebElement ele=driver.findElement(By.xpath("//a[text()='COURSE']"));
		//creating an object for Actions class
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		//address of Selenium training
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		WebElement plus=driver.findElement(By.id("add"));
		a.doubleClick(plus).perform();
		driver.close();

	}

}
