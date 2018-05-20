package TigerAirAutomationProject;


	import java.util.concurrent.TimeUnit;
	import java.util.Date;
	import java.io.File;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.*;
	import static org.openqa.selenium.OutputType.*;

	public class HotelSelection 
	{
	    public void mHotelSelection(WebDriver obj) throws Exception {
//	        FirefoxDriver wd;
//	        wd = new FirefoxDriver();
//	        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//	        wd.get("https://uatbooking.tigerair.com.au/TigerAirIBE3415/Booking/Extras");
	    	
	    	
	    	obj.findElement(By.xpath("html/body/div/div[4]/form/div[1]/div/div[2]/div[5]/div[2]/a")).click();
	    	Thread.sleep(2000);
	    	obj.switchTo().frame("booking_inpath");
	    	obj.findElement(By.xpath("html/body/div[1]/div[3]/div/ul/li[1]/div[2]/div[2]/div[2]/a")).click();
	    	Thread.sleep(10000);

//	    	Actions action=new Actions(obj);
//	    	action.moveToElement(obj.findElement(By.xpath("//div[@id='modalhotels']/div/h1/img"))).click()
//	    	action.build().perform();
	    	
	    	 new Actions(obj).doubleClick(obj.findElement(By.xpath("//div[@id='modalhotels']/div/h1/img"))).build().perform();
		    	
//	    	obj.findElement(By.xpath("//*[@class='room-selector--button room-selector--button-plus']")).click();
	//    	obj.findElement(By.xpath("html/body/div[1]/div[4]/div/div[1]/div[4]/div[2]/div/div[2]/div[3]")).get(1).click();
//	    	obj.findElement(By.xpath("html/body/div[1]/div[4]/div/div[1]/div[3]/div[2]/div/div[2]/div[3]")).click();
	    	Thread.sleep(5000);
//	    	obj.switchTo().defaultContent();
	    	obj.findElement(By.xpath("html/body/div[1]/div[4]/form/div[4]/div/h1/img")).click();
	    	Thread.sleep(5000);
	    	
//	        new Actions(obj).doubleClick(obj.findElement(By.xpath("//div[@id='modalhotels']/div/h1/img"))).build().perform();
//	        Thread.sleep(2000);
//	        obj.findElement(By.xpath("//*[@class='close-button']")).click();
//
//	    	
//	    	
//	    	
//	    	
//	    	
//	    	obj.findElement(By.linkText("show hotels")).click();
//	    	Thread.sleep(2000);
//	        new Actions(obj).doubleClick(obj.findElement(By.xpath("//div[@id='modalhotels']/div/h1/img"))).build().perform();
//	        Thread.sleep(2000);
//	        obj.findElement(By.xpath("//*[@class='close-button']")).click();
	    }
	    
//	    public static boolean isAlertPresent(FirefoxDriver wd) {
//	        try {
//	            wd.switchTo().alert();
//	            return true;
//	        } catch (NoAlertPresentException e) {
//	            return false;
//	        }
//	    }
	}


