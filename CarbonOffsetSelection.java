package TigerAirAutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarbonOffsetSelection {

	public void rtnCarbonOffsetSelection(WebDriver obj) throws Exception
	{
		// TODO Auto-generated method stub

		obj.findElement(By.xpath("//div[@class='extras-maincontent']/div[3]/div[2]/a")).click();
		Thread.sleep(2000);
		obj.findElement(By.xpath("(//*[@for='AddCarbonOffsetCheckbox'])[1]")).click();
//		obj.findElement(By.xpath("//*[@class='close-button']")).click();
		obj.findElement(By.xpath("//*[@id=\"modalcarbonoffset\"]/div/h1/img")).click();

	}



	public void oneWayCarbonOffsetSelection(WebDriver obj)
	{
		// TODO Auto-generated method stub

		obj.findElement(By.xpath("//div[@class='extras-maincontent']/div[2]/div[2]/a")).click();
		obj.findElement(By.xpath("//*[@for='AddCarbonOffsetCheckbox']")).click();
		obj.findElement(By.xpath("//*[@id=\"modalcarbonoffset\"]/div/h1/img")).click();
	}


}
