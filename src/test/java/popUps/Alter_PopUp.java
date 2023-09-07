package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alter_PopUp {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		//shifting control to the pop-up
		Alert a1 = driver.switchTo().alert();
		System.out.println(a1.getText());
		Thread.sleep(3000);
		a1.accept();
		//a1.dismiss();
		driver.quit();
		
	}

}
