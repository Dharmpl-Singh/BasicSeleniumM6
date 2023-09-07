package practicePrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingData_ExcelSheet {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\DataSets.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String appURL=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		driver.get(appURL);
		int row=1;
		for(int i=0;i<6;i++) {
			int cell=1;
		String username=wb.getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		cell++;
		String password=wb.getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		row++;
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("pass")).clear();
	  }
		String title=driver.getTitle();
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\DataSets.xlsx");
		wb.getSheet("Sheet1").createRow(8).createCell(0).setCellValue(title);
		wb.write(fos);
	}

}
