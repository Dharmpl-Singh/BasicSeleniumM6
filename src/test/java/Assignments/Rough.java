package Assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//fetch the address of dynamic change element of mobile from amazon - for practice only
public class Rough {

	public static void main(String[] args) {
	      WebDriverManager.chromedriver().setup();
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.amazon.in/");
	      driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung mobile");
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
	      driver.findElement(By.xpath("//span[text()=' Galaxy M04 Dark Blue, 4GB RAM, 64GB Storage | Upto 8GB RAM with RAM Plus | MediaTek Helio P35 Octa-core Processor | 5000 mAh Battery | 13MP Dual Camera']")).click();

	}

}
