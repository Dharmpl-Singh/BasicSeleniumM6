package practicePrograms;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws Throwable {
		HashMap<String,Integer> content=new HashMap<>();
		HashMap<String,Object> profile=new HashMap<>();
		HashMap<String,Object> pro=new HashMap<>();
		content.put("notifications", 0);
		profile.put("profile_data", content);
		pro.put("profile", profile);
		
		EdgeOptions options=new EdgeOptions();
		options.setCapability("preferences", pro);
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ajio.com/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='ic-close-quickview']")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/Ajio.png");
		FileUtils.copyFile(src, dest);
		//driver.close();
	}

}
