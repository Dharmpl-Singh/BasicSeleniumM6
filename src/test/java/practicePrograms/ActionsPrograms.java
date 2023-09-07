package practicePrograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionsPrograms {

	public static void main(String[] args) throws Throwable{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele=driver.findElement(By.id("course"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		Thread.sleep(3000);
		WebElement ele1=driver.findElement(By.id("add"));
		a.doubleClick(ele1).perform();
		driver.navigate().to("https://www.amazon.in/");
		WebElement ele2=driver.findElement(By.id("twotabsearchtextbox"));
		a.contextClick(ele2).perform();
		
	}

}
