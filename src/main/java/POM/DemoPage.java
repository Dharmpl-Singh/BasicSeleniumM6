package POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPage {

	@FindBy(id="course")
	private WebElement course;
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumTraining;
	@FindBy(xpath="//button[contains(text(),'Add to Cart')]")
	private WebElement cart;
	
	public DemoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void courseModule(Actions a)
	{
		a.moveToElement(course).perform();
	}
	public void seleniumTrain()
	{
		seleniumTraining.click();
	}
	public void addToCart()
	{
		cart.click();
	}
	
}
