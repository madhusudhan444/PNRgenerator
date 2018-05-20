package TigerAirAutomationProject;


import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class ReturnFareFltSelect

{

    public void RtnLtFr(WebDriver obj) throws Exception
    
    {

//        obj.findElement(By.cssSelector("td.js-fare-selection.flight-price")).click();
         Thread.sleep(5000);

         
//         if(obj.findElement(By.xpath("/html/body/div/div[4]/div[7]/div/div")).isDisplayed())
//        	 
//        	 html/body/div[1]/div[4]/div[6]/div/div/img
//        	 html/body/div[1]/div[4]/div[6]/div/div
        	 
        	 if(obj.findElement(By.xpath("html/body/div[1]/div[4]/div[6]/div/div")).isDisplayed())	 
         {
        
        obj.findElement(By.xpath("html/body/div[1]/div[4]/div[6]/div/div")).click();
       
         } 
         
        	 obj.findElement(By.cssSelector("td.js-fare-selection.flight-price")).click();
       
         
        Thread.sleep(2000);
//        obj.findElement(By.xpath("//table[@id='table-1']/tbody/tr[2]/td[3]")).click();
         Thread.sleep(2000);
        obj.findElement(By.id("ContinueBtn")).click();
         
    }
    

	 public void RtnExpFr(WebDriver obj) throws Exception
	    
   {

		 Thread.sleep(2000);
       obj.findElement(By.xpath("//table[@id='table-0']/tbody/tr[2]/td[4]")).click();
         Thread.sleep(2000);
       obj.findElement(By.xpath("/html/body/div/div[4]/div[7]/div/div")).click();
         Thread.sleep(2000);
       obj.findElement(By.xpath("//table[@id='table-1']/tbody/tr[2]/td[4]")).click();
         Thread.sleep(2000);
       obj.findElement(By.id("ContinueBtn")).click();
	       
   }

	 public void RtnLtAndExpFr(WebDriver obj) throws Exception
	    
	   {

	       obj.findElement(By.xpath("//table[@id='table-0']/tbody/tr[2]/td[3]")).click();
	          Thread.sleep(2000);
	       obj.findElement(By.xpath("/html/body/div/div[4]/div[7]/div/div")).click();
	          Thread.sleep(2000);
	       obj.findElement(By.xpath("//table[@id='table-1']/tbody/tr[2]/td[4]")).click();
	          Thread.sleep(2000);
	       obj.findElement(By.id("ContinueBtn")).click();
		       
	   }
	 
	 
	 
	 
	 
	 
}
