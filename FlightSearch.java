package TigerAirAutomationProject;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightSearch {

	public void fltSearchRtn(WebDriver obj,HashMap <String,String>var) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		obj.findElement(By.id("departurePortSelected")).click();
		obj.findElement(By.id("departurePortSelected")).sendKeys(var.get("Origin"));
		Thread.sleep(1000);
		
		
		obj.findElement(By.id("arrivalPortSelected")).click();
		obj.findElement(By.id("arrivalPortSelected")).sendKeys(var.get("Destination"));
		Thread.sleep(1000);
		
		obj.findElement(By.id("departureDateField")).click();
//		obj.findElement(By.linkText(""))
		
		
		obj.findElement(By.linkText("Next")).click();
		obj.findElement(By.linkText("Next")).click();
		obj.findElement(By.linkText("21")).click();
		
		obj.findElement(By.id("returnDateField")).click();
		obj.findElement(By.linkText("27")).click();
		
	    
//		Select maxAdt = new Select(obj.findElement(By.id("Adults")));
//		List <WebElement> AdtCount = maxAdt.getOptions();
//		System.out.println(AdtCount.size());
		
		
		
		
		
		
		obj.findElement(By.id("Adults")).click();
		
		obj.findElement(By.id("Adults")).sendKeys(var.get("NoOfAdults"));
		obj.findElement(By.id("Adults")).sendKeys(Keys.ENTER);
		
		
		//Continue button  to navigate select page
		Thread.sleep(5000);
		obj.findElement(By.id("searchFlightBtn")).click();
			
		
//		if(var.get("NoOfChild"))
//		
//		
//		
//		
	}

	
	
	
	
	// Oneway
	
	public void fltSearchOneway(WebDriver obj,HashMap <String,String>var) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		obj.findElement(By.xpath("/html/body/div[1]/div[4]/form/div[2]/div[1]/div/label[2]/span[1]")).click();
		
		obj.findElement(By.id("departurePortSelected")).click();
		obj.findElement(By.id("departurePortSelected")).sendKeys(var.get("Origin"));
		Thread.sleep(1000);
		
		
		obj.findElement(By.id("arrivalPortSelected")).click();
		obj.findElement(By.id("arrivalPortSelected")).sendKeys(var.get("Destination"));
		Thread.sleep(1000);
		
		obj.findElement(By.id("departureDateField")).click();
		obj.findElement(By.linkText("Next")).click();
		obj.findElement(By.linkText("Next")).click();
		obj.findElement(By.linkText("25")).click();
		
//		obj.findElement(By.id("returnDateField")).click();
//		obj.findElement(By.linkText("30")).click();
		
	    
//		Select maxAdt = new Select(obj.findElement(By.id("Adults")));
//		List <WebElement> AdtCount = maxAdt.getOptions();
//		System.out.println(AdtCount.size());
		
		obj.findElement(By.id("Adults")).click();
		
		obj.findElement(By.id("Adults")).sendKeys(var.get("NoOfAdults"));
		obj.findElement(By.id("Adults")).sendKeys(Keys.ENTER);
		
		
		//Continue button  to navigate select page
		Thread.sleep(5000);
		obj.findElement(By.id("searchFlightBtn")).click();
			
	}

	
	
}
