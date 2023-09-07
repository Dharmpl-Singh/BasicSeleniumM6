package popUps;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NotificationPopUp {

	public static void main(String[] args) {
		
		HashMap<String, Integer> contentString=new HashMap<>();
		HashMap<String, Object> profile=new HashMap<>();
		HashMap<String, Object> prefs=new HashMap<>();
		
		contentString.put("notifications", 0);
		profile.put("managed_default_content-setting", contentString);
		prefs.put("profile", profile);
		
		//Handling notification pop up in Edge browser
		EdgeOptions options=new EdgeOptions();
		options.setCapability("preferences", prefs);
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.quikr.com/");

	}

}
