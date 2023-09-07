package framePrograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class snapdealRegistration {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		WebElement mouse=driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions s=new Actions(driver);
		s.moveToElement(mouse).perform();
		driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
		driver.switchTo().frame("loginIframe");//here we can use only id,name,xpath locator
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("abcdefgh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='close-pop']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("bewakoof T shifts");

	}

}
