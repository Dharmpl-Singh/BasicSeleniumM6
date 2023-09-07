package dataDriverPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFile {

	public static void main(String[] args) throws Throwable {
		//create an object for properties class
		Properties p=new Properties();
		//create an object for physical file
		FileInputStream file=new FileInputStream(".\\src\\test\\resources\\Data.properties");
		p.load(file);
		String appURL=p.getProperty("url");
		String user=p.getProperty("username");
		String password=p.getProperty("password");
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(appURL);
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(password);
	
	
	}

}
