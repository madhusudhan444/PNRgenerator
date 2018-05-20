package TigerAirAutomationProject;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaxContactDetails {

	public void PaxCntDetails(WebDriver obj , HashMap <String,String>var)
	
	{
		// TODO Auto-generated method stub
		obj.findElement(By.id("streetAddress")).sendKeys(var.get("streetAddress"));
		obj.findElement(By.id("townCityText")).sendKeys(var.get("townCityText"));
		obj.findElement(By.id("postalCode")).sendKeys(var.get("postalCode"));
		obj.findElement(By.id("phone-number")).sendKeys(var.get("phoneNumber"));
		obj.findElement(By.id("emailText")).sendKeys(var.get("emailText"));
		obj.findElement(By.id("confirmEmail")).sendKeys(var.get("confirmEmail"));
	}

}
