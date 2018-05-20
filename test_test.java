package TigerAirAutomationProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class test_test extends TigerAirAutomation {

	public static void main(String[] args) throws IOException 
	
	{

		@SuppressWarnings("null")
		public static void ascs() //throws IOException  
		{
			
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\madhusudhan\\Desktop\\geckodriver.exe");
		WebDriver obj = new FirefoxDriver();
//		WebDriver obj = null;
		String filePath = "E:\\Sellenium\\FrameWork\\TestData\\BookingDetails.xlsx";
		FileInputStream file=new FileInputStream(new File(filePath));		
		 
		  
//		XSSFWorkbook wrkBook = new XSSFWorkbook(file);		
//		XSSFSheet wrkSht = wrkBook.getSheetAt(0);
//		
//		System.out.println("hai");
//		String CreditCardName = wrkSht.getRow(16).getCell(0).getStringCellValue();
//
//		String CreditCardNumber = wrkSht.getRow(17).getCell(1).getStringCellValue();
//		String CreditCardExpMonth = wrkSht.getRow(18).getCell(1).getStringCellValue();
//		String CreditCardExpYear = wrkSht.getRow(19).getCell(1).getStringCellValue();
//		String cvvNo = wrkSht.getRow(7).getCell(20).getStringCellValue();
		
//		System.out.println(CreditCardNumber);		
		
		obj.findElement(By.id("CreditCardPaymentOption")).click();
		
//		obj.findElement(By.id("CreditCardName")).sendKeys("peter");
//		
//		obj.findElement(By.id("CreditCardName")).sendKeys(Keys.TAB);
//		
//		obj.findElement(By.id("CreditCardNumber")).sendKeys(CreditCardNumber);
//		
//		obj.findElement(By.id("CreditCardName")).sendKeys(Keys.TAB);
//		
//		obj.findElement(By.id("CreditCardExpMonth")).click();
//		
//		obj.findElement(By.id("CreditCardExpMonth")).sendKeys(CreditCardExpMonth);
//		
//		obj.findElement(By.id("CreditCardName")).sendKeys(CreditCardExpYear);
//		
//		obj.findElement(By.id("cvvNo")).sendKeys(cvvNo);
		
		
		
		
	//////////////////////////////////////////////////////////////////////////////////////////	
		
		
		import java.util.concurrent.TimeUnit;
		import java.util.Date;
		import java.io.File;
		import org.openqa.selenium.support.ui.Select;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.*;
		import static org.openqa.selenium.OutputType.*;

		public class  {
		    public static void main(String[] args) throws Exception {
		        FirefoxDriver wd;
		        wd = new FirefoxDriver();
		        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		        wd.get("https://uatbooking.tigerair.com.au/TigerAirIBE3415/Booking/Extras");
		        wd.findElement(By.linkText("park my car\n                                from\n                                \n                                    $\n                                    87.00")).click();
		        wd.findElement(By.xpath("//label[@for='AddParkingCheckbox']")).click();
		        if (!wd.findElement(By.id("AddParkingCheckbox")).isSelected()) {
		            wd.findElement(By.id("AddParkingCheckbox")).click();
		        }
		        wd.findElement(By.xpath("//div[@id='modalairportparking']/div/h1/img")).click();
		        wd.quit();
		    }
		    
		    public static boolean isAlertPresent(FirefoxDriver wd) {
		        try {
		            wd.switchTo().alert();
		            return true;
		        } catch (NoAlertPresentException e) {
		            return false;
		        }
		    }
		}
	
		
		
		
		
	///////////////////////////////////////////////////////////////////////////////////////////////////	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}
			
