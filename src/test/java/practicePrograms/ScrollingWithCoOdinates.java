package practicePrograms;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollingWithCoOdinates {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement ele=driver.findElement(By.xpath("//a[text()='Careers']"));
		/*Point loc=ele.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", ele);
		Thread.sleep(2000);*/
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", ele);
		Thread.sleep(2000);
		driver.quit();
	
	}

}
