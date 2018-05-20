package TigerAirAutomationProject;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class VoucherFOP {

	public void voucher(WebDriver obj,HashMap < String,String >var) throws Exception {
		// TODO Auto-generated method stub

		
		obj.findElement(By.xpath("//*[@id=\"VoucherPaymentOption\"]/div")).click();
		obj.findElement(By.xpath("//*[@id=\"voucherNo\"]")).sendKeys(var.get("VoucherDetails"));
		Thread.sleep(2000);
		obj.findElement(By.xpath("//*[@id=\"RetrieveVoucherBtn\"]")).click();
		Thread.sleep(2000);
		obj.findElement(By.xpath("//*[@id=\"AddVoucherBtn\"]")).click();
		Thread.sleep(3000);
		
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
		
	}

}
