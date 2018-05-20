package TigerAirAutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MealsSelection {

	public void rtnMealsSelect(WebDriver obj) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		obj.findElement(By.xpath("//div/div[4]/form/div[1]/div/div[2]/div[1]/div[2]/a")).click();
		Thread.sleep(3000);
		obj.findElement(By.id("foodDescription-0-MS07")).click();
		Thread.sleep(1000);
		obj.findElement(By.id("foodDescription-1-MS08")).click();
		obj.findElement(By.xpath("//div[@id='modalmeals']/div/h1/img")).click();
//		obj.findElement(By.xpath("//*[@class='close-button']")).click();
	}


	public void oneWayMealsSelect(WebDriver obj) 
	{
		// TODO Auto-generated method stub

		obj.findElement(By.xpath("//div/div[4]/form/div[1]/div/div[2]/div[1]/div[2]/a")).click();
		obj.findElement(By.id("foodDescription-0-MS07")).click();
		obj.findElement(By.xpath("//div[@id='modalmeals']/div/h1/img")).click();
		obj.findElement(By.xpath("//*[@class='close-button']")).click();
	}

	
	
	
}
