package Assignments;
//open https://skillrary.com/-->click on gear-->click on skillary demo app
//mouse over course--> select selenium training and add course in cart and click on alter pop
//write the script by use POM

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import POM.DemoPage;
import POM.SkillaryPage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Assignment3 {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://skillrary.com/");
	SkillaryPage sp= new SkillaryPage(driver);
	DemoPage dp=new DemoPage(driver);
	sp.gearMod();
	sp.demoAPP();
	Set<String> child = driver.getWindowHandles();
	for(String obj:child)
	{
	driver.switchTo().window(obj);
	}
	Actions a=new Actions(driver);
	dp.courseModule(a);
	dp.seleniumTrain();
	dp.addToCart();
	driver.switchTo().alert().accept();
	driver.quit();
	
}
}
