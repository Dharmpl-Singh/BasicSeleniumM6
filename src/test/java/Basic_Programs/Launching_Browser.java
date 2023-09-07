package Basic_Programs;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Launching_Browser {

	public static void main(String[] args) throws Throwable {
		// driver related statement
		WebDriverManager.chromedriver().setup();
		//opening the chromeBrowser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//enter the URL in browser and open URL
		driver.get("https://www.facebook.com/");
		//get the title to be printed of the webPage
		System.out.println(driver.getTitle());
		//printing the current URL
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		//closing the browser
		driver.close();
		
		
		
	}

}
