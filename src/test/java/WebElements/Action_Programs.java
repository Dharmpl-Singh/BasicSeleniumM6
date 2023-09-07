package WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Action_Programs {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//address of email text field
		WebElement ele=driver.findElement(By.id("email"));
		ele.sendKeys("abcdefgh");
		Thread.sleep(3000);
		ele.clear();
		driver.close();
		

	}

}
