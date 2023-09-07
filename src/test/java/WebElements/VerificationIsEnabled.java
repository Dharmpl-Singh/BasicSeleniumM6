package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerificationIsEnabled {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//address of email text field
		driver.findElement(By.id("email")).sendKeys("abcdefghi");
		driver.findElement(By.id("pass")).sendKeys("fgerdkji");
		WebElement button=driver.findElement(By.xpath("//button[@name='login']"));

		if(button.isEnabled())
		{
			System.out.println("It is enabled");
			//button.click();
			button.submit();//use only when type=submit
		}
		else
		{
			System.out.println("It is not enabled");
		}
	}

}
