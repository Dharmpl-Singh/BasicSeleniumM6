package Basic_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_Pograms {

	public static void main(String[] args) throws Throwable{
		// driver related statement
		WebDriverManager.chromedriver().setup();
		//opening the chromeBrowser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//enter the URL and loads until application will get loaded
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//navigating from one url to another url
		driver.navigate().to("https://www.amazon.in/");
		//navigating to back page
		driver.navigate().back();
		Thread.sleep(3000);
		//navigating to front page
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
	}

}
