package TigerAirAutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeatSelection {

	public void noSeatSelection(WebDriver obj) 
	{
		// TODO Auto-generated method stub
		
		obj.findElement(By.id("ContinueWithoutSeatsBtn")).click();

	}

	
	public void rtnSeatSelection(WebDriver obj)
	
	{
        obj.findElement(By.cssSelector("span.seat-selection-button")).click();
        obj.findElement(By.id("0_18B")).click();
        obj.findElement(By.xpath("//div[@class='table-responsive']//span[.='Select']")).click();
        obj.findElement(By.id("1_18C")).click();
        obj.findElement(By.id("ContinueBtn")).click();

	}
	
	public void oneWaySeatSelection(WebDriver obj) 
	{
				
	        obj.findElement(By.cssSelector("span.seat-selection-button")).click();
	        obj.findElement(By.id("0_18B")).click();
	        obj.findElement(By.id("ContinueBtn")).click();

	}
	
	
	
}
