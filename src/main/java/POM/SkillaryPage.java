package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryPage {

	@FindBy(xpath="//a[contains(text(),'GEARS')]")
	private WebElement gearModule;	
	@FindBy(xpath="(//a[contains(text(),'SkillRary Demo APP')])[2]")
	private WebElement demoApp;
	
	public SkillaryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void gearMod()
	{
		gearModule.click();
	}
	public void demoAPP()
	{
		demoApp.click();
	}
	
}
