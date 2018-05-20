package TigerAirAutomationProject;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CardPayment {

	public void cardPay(WebDriver obj,HashMap < String,String >var) throws InterruptedException {
		// TODO Auto-generated method stub

//		var.get("origin");
		
//		String x = (String) var.get("origin");
		
//		System.out.println(x);
		
		
		
		obj.findElement(By.id("CreditCardPaymentOption")).click();
		
		obj.findElement(By.id("CreditCardName")).sendKeys(var.get("CreditCardName"));
		
		obj.findElement(By.id("CreditCardName")).sendKeys(Keys.TAB);
		
		obj.findElement(By.id("CreditCardNumber")).sendKeys(var.get("CreditCardNumber"));
		
		obj.findElement(By.id("CreditCardName")).sendKeys(Keys.TAB);
		
		obj.findElement(By.id("CreditCardExpMonth")).click();
		
		obj.findElement(By.id("CreditCardExpMonth")).sendKeys(var.get("CreditCardExpMonth"));
		
		obj.findElement(By.id("CreditCardName")).sendKeys(var.get("CreditCardExpYear"));
		
		obj.findElement(By.id("cvvNo")).sendKeys(var.get("cvvNo"));
	
		Thread.sleep(2000);
		
	}

}
