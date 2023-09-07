package practicePrograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPopUp {

	public static void main(String[] args) throws Throwable{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]")).click();
		
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
		driver.close();
		

	}

}
