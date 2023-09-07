package POM_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;

import POM.FB_LoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		FB_LoginPage fblogin=new FB_LoginPage(driver);
		fblogin.emailTextField("dharmpal");
		fblogin.passwordTextField("singh");
		fblogin.loginButton();

	}

}
