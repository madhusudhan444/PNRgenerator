package TigerAirAutomationProject;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TrailTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		String filePath = "E:\\Sellenium\\FrameWork\\TestData\\BookingDetailsNEW.xlsx";
		FileInputStream file = new FileInputStream(new File(filePath));

		XSSFWorkbook wrkBook = new XSSFWorkbook(file);
		XSSFSheet wrkSht = wrkBook.getSheetAt(0);

		HashMap <String, List> map = new HashMap<String, List>();

		
//		for (int i = 1; i < 24; i++) {
//
//			map.put(wrkSht.getRow(i).getCell(0).getStringCellValue(),
//					wrkSht.getRow(i).getCell(1).getStringCellValue());
//
//		}


		
		for (int i = 0; i < 4; i++) 
		{

			for (int j = 0; j < 24; j++)
			{
				
			map.put(wrkSht.getRow(i).getCell(j).getStringCellValue(),
					wrkSht.getRow(i).getCell(j).getStringCellValu66e());
			}

		}

		
	
		System.out.println(map.get("firstName1"));
			
		
	
	}

}
