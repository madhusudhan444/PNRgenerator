package TigerAirAutomationProject;


	import java.util.concurrent.TimeUnit;
	import java.util.Date;
	import java.io.File;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.*;
	import static org.openqa.selenium.OutputType.*;

	public class ROKTdailogClose
	
	{
	    public void roktDailogClosing(WebDriver obj) throws Exception {
//	        FirefoxDriver wd;
//	        wd = new FirefoxDriver();
//	    	obj.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//	    	obj.get("https://uatbooking.tigerair.com.au/TigerAirIBE3415/Booking/Confirmation");
	    	obj.findElement(By.id("rl__roktAppsBanner213659633")).click();
	    	obj = (FirefoxDriver) obj.switchTo().frame(0);
	        if (!obj.findElement(By.xpath("//div[3]/div/div/div[3]/div/div/div/div/div/form/div[1]/div/div/div[3]/div[1]/div[3]/div/div/div[2]/div[1]/div/div/div[1]/input")).isSelected()) {
	        	obj.findElement(By.xpath("//div[3]/div/div/div[3]/div/div/div/div/div/form/div[1]/div/div/div[3]/div[1]/div[3]/div/div/div[2]/div[1]/div/div/div[1]/input")).click();
	        }
	        obj.findElement(By.xpath("//div[3]/div/div/div[1]/div/div/a")).click();
	        //wd.quit();
	    }
	    
	    public static boolean isAlertPresent(WebDriver obj) {
	        try {
	        	obj.switchTo().alert();
	            return true;
	        } catch (NoAlertPresentException e) {
	            return false;
	        }
	    }
	}


