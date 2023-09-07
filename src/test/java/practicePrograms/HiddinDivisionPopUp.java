package practicePrograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HiddinDivisionPopUp {

	public static void main(String[] args) throws Throwable { 
		HashMap<String, Integer> contentString=new HashMap<>();
		HashMap<String, Object> profile=new HashMap<>();
		HashMap<String, Object> prefs=new HashMap<>();
		
		contentString.put("notifications", 0);
		profile.put("managed_default_content-setting", contentString);
		prefs.put("profile", profile);
		
		//Handling notification pop up in Edge browser
		EdgeOptions options=new EdgeOptions();
		options.setCapability("preferences", prefs);
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		WebElement ele = driver.findElement(By.xpath("(//div[text()='Aug']/../../..//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 dkWAbH'])[1]"));
		System.out.println(ele.getText());
		ele.click();
		
		
		

	}

}
