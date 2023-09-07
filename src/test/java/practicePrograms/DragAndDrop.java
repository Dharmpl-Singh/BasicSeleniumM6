package practicePrograms;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class DragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		WebElement ele1=driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement ele2=driver.findElement(By.xpath("//h1[text()='Block 4']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(ele1, ele2).perform();
		

	}

}
