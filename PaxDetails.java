package TigerAirAutomationProject;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PaxDetails {

	public void PasngrDet1(WebDriver obj, HashMap <String,String>var) 
	{
		// TODO Auto-generated method stub

		obj.findElement(By.id("titleSelect_0")).click();
		obj.findElement(By.id("titleSelect_0")).sendKeys(var.get("Title1"));
		obj.findElement(By.id("titleSelect_0")).sendKeys(Keys.ENTER);
		
		obj.findElement(By.id("genderSelect_0")).click();
		obj.findElement(By.id("genderSelect_0")).sendKeys(var.get("gender1"));
		obj.findElement(By.id("genderSelect_0")).sendKeys(Keys.ENTER);

		
		obj.findElement(By.id("firstName_0")).sendKeys(var.get("firstName1"));
		obj.findElement(By.id("lastName_0")).sendKeys(var.get("lastName1"));
		
		obj.findElement(By.id("birthdayDay_0")).sendKeys(var.get("birthDate1"));
		obj.findElement(By.id("birthdayMonth_0")).sendKeys(var.get("birthMonth"));
		obj.findElement(By.id("birthdayYear_0")).sendKeys(var.get("birthYear1"));
		
	}

}
