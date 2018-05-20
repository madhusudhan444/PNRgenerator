package TigerAirAutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InsuranceSelection {

	public void noInsurance(WebDriver obj)
   {
		// TODO Auto-generated method stub

		obj.findElement(By.id("NotigerInsurance")).click();		
		
	}

	
	public void yesInsurance(WebDriver obj)
	   {
			// TODO Auto-generated method stub

		obj.findElement(By.xpath("(//*[@for='YestigerInsurance'])[1]")).click();		
			
		}

	
	
}
