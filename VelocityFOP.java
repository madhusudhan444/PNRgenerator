package TigerAirAutomationProject;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class VelocityFOP {

	public void velocityPay(WebDriver obj,HashMap < String,String >var) throws Exception {
		// TODO Auto-generated method stub

		obj.findElement(By.id("VelocityPaymentOption")).click();
		Thread.sleep(2000);
		obj.findElement(By.id("velocity-member-no")).sendKeys(var.get("VelocityID"));
		Thread.sleep(2000);
		obj.findElement(By.id("velocity-member-password")).sendKeys(var.get("VelocityPWD"));
		Thread.sleep(5000);
		obj.findElement(By.id("VelocityLoginBtn")).click();
		Thread.sleep(10000);
	
		if (obj.findElement(By.id("CreditCardName")).isDisplayed()) {
			

//			obj.findElement(By.id("CreditCardPaymentOption")).click();
			
			obj.findElement(By.id("CreditCardName")).sendKeys(var.get("CreditCardName"));
			
			obj.findElement(By.id("CreditCardName")).sendKeys(Keys.TAB);
			
			obj.findElement(By.id("CreditCardNumber")).sendKeys(var.get("CreditCardNumber"));
			
			obj.findElement(By.id("CreditCardName")).sendKeys(Keys.TAB);
			
			obj.findElement(By.id("CreditCardExpMonth")).click();
			
			obj.findElement(By.id("CreditCardExpMonth")).sendKeys(var.get("CreditCardExpMonth"));
			
			obj.findElement(By.id("CreditCardName")).sendKeys(var.get("CreditCardExpYear"));
			
			obj.findElement(By.id("cvvNo")).sendKeys(var.get("cvvNo"));

			
			
			
			
		}

		Thread.sleep(2000);
		
		
	}

}
