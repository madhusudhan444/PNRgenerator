package TigerAirAutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AirportParkingSelection {

	public void mairportParkingSelect(WebDriver obj) throws Exception 
	
	{
		// TODO Auto-generated method stub

		obj.findElement(By.xpath("(//*[@href='#'])[11]")).click();
		Thread.sleep(2000);
		obj.findElement(By.xpath("//label[@for='AddParkingCheckbox']")).click();
//		obj.findElement(By.xpath("//*[@id=\"modalairportparking\"]/div/h1/img']")).click();
		
		obj.findElement(By.xpath("(//*[@class='close-button'])[4]")).click();
		Thread.sleep(1000);
		
		
	}

}
