package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		//Thread.sleep(3000);
		//address of date web element
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		Thread.sleep(3000);
		//address of date
		WebElement date = driver.findElement(By.xpath("//div[text()='Aug']/../../..//span[text()='28']"));
		System.out.println(date.getText());
		date.click();
		
		
		

	}

}
