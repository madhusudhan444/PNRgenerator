package TigerAirAutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaggageSelection {

	public void rtnSelectBaggage(WebDriver obj)
	{
		// TODO Auto-generated method stub

		obj.findElement(By.xpath("html/body/div[1]/div[4]/form/div[5]/div/div[1]/div[5]/div/div[4]/div[2]/div/div[1]/div[2]/div[3]")).click();
		obj.findElement(By.xpath("html/body/div[1]/div[4]/form/div[5]/div/div[1]/div[5]/div/div[2]/div[2]/div/div[1]/div[2]/div[3]")).click();
		
	}

	public void oneWaySelectBaggage(WebDriver obj)
	{
		// TODO Auto-generated method stub

	//	obj.findElement(By.xpath("html/body/div[1]/div[4]/form/div[5]/div/div[1]/div[5]/div/div[4]/div[2]/div/div[1]/div[2]/div[3]")).click();
		obj.findElement(By.xpath("html/body/div[1]/div[4]/form/div[5]/div/div[1]/div[5]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[1]")).click();
		
		
		
	}

	
	
	
}
