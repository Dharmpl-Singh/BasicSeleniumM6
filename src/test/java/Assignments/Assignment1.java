package Assignments;
//Take Gmail login page and write script to fetch the address of Username and send data,
//fetch the address of password and send data,fetch address of login button and click,fetch address of 
//Link Text and click by using X path locator

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assignment1 {

	public static void main(String[] args) throws Throwable{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AXo7B7WA9kvfyPYt1NkERqO_FZPANkpc09Dj5XyTdsn2ihPVkR1J1GgzZZSQnRPBjsIejkJ6lu2KoA&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1241571489%3A1692286939991829");
			driver.findElement(By.xpath("//span[text()='Create account']")).click();
			driver.findElement(By.xpath("//span[text()='For my personal use']")).click();
			driver.navigate().back();
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc");
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcd");
			driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]")).click();
			driver.close();
			

	}

}
