package practicePrograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AlterPopUp {

	public static void main(String[] args){
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://skillrary.com/");
		driver.findElement(By.xpath("//a[contains(text(),'GEARS')]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'SkillRary Demo APP')])[2]")).click();
		Set<String> child = driver.getWindowHandles();
		for(String s:child)
		{
			driver.switchTo().window(s);
		}
		WebElement ele=driver.findElement(By.id("course"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]")).submit();
		driver.switchTo().alert().accept();
		
	}

}
