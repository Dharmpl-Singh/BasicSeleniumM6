package genericLibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	
	//generic method for mouseOver
	public void mouseOvering(WebDriver driver,WebElement ele)
	{
		Actions a =new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	//generic method for right click
	public void rightClick(WebDriver driver,WebElement ele)
	{
		Actions a =new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	//generic method for double click
		public void doubleClick(WebDriver driver,WebElement ele)
		{
			Actions a =new Actions(driver);
			a.doubleClick(ele).perform();
		}
		
	//generic method for drag and drop
	public void dragAndDrop(WebDriver driver,WebElement ele1,WebElement ele2)
	{
		Actions a =new Actions(driver);
		a.dragAndDrop(ele1, ele2).perform();
	}
	
	//generic method for drop down
	public void dropDown(WebElement ele,String value)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(value);
	}
	
	
	
	//generic method to handle frame
	
	public void frame(WebDriver driver,String ele)
	{
		driver.switchTo().frame(ele);
	}

	//generic method to shift the control back to normal web page
	
	public void frame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	//generic method for implicit wait
	public void implicitWait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);	
	}
	
	//generic method for alter pop-up accept
	public void alterPopUpAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	//generic method for alter pop-up accept
	public void alterPopUpDismiss(WebDriver driver)
	{
			driver.switchTo().alert().dismiss();
	}
	
	//generic method for parent window
	public void parentWindow(WebDriver driver)
	{
		driver.getWindowHandle();
	}
	
	//generic method for child window
	public void childWindow(WebDriver driver)
	{
		driver.getWindowHandles();
	}
	
	
	
	
	
	
	
	
}
