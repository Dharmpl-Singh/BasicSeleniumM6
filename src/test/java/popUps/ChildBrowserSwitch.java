package popUps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserSwitch {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://skillrary.com/");
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(text(),'GEARS')]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'SkillRary Essay')])[2]")).click();
		//shifting control to the child browser
		Set<String> child=driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
		driver.findElement(By.xpath("//input[@placeholder='Enter name to continue']")).sendKeys("Dharmpal");
		Thread.sleep(2000);
		//shifting control to parent window
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();
		

	}

}
