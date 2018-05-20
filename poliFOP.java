package TigerAirAutomationProject;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class poliFOP {

	public void poliPay(WebDriver obj,HashMap < String,String >var) throws Exception {
		// TODO Auto-generated method stub

		obj.findElement(By.id("PoliPaymentOption")).click();
		Thread.sleep(2000);

		obj.findElement(By.id("disclaimer-check")).click();
		Thread.sleep(1000);
		obj.findElement(By.id("SubmitPaymentBtn")).click();
		Thread.sleep(3000);
		
		obj.findElement(By.id("proceed-button")).click();
		Thread.sleep(6000);
		
		obj.findElement(By.xpath("//*[@id=\"stepContainer\"]/div[2]/div[1]/input")).sendKeys(var.get("PoliID"));
		Thread.sleep(2000);
		obj.findElement(By.xpath("//*[@id=\"stepContainer\"]/div[2]/div[2]/input")).sendKeys(var.get("PoliPWD"));
		Thread.sleep(2000);
		obj.findElement(By.xpath("//*[@id=\"footerButtonsRight\"]/div[1]/button")).click();
		Thread.sleep(8000);
		
		obj.findElement(By.xpath("//*[@class='button stp-button primary-button']")).click();
		Thread.sleep(9000);
		
		obj.findElement(By.xpath("//*[@class='button stp-button primary-button']")).click();
		Thread.sleep(10000);
		

		
	}

}
