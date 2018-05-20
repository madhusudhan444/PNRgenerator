package TigerAirAutomationProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {

	static LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();

	public static LinkedHashMap<String, String> loadExcelData() {

		File fileName = new File("E:\\Sellenium\\FrameWork\\TestData\\BookingDetailsNEW.xlsx");

		try {
			FileInputStream fis = new FileInputStream(fileName);

			XSSFWorkbook workBook = new XSSFWorkbook(fis);
			for (int i = 0; i < workBook.getNumberOfSheets(); i++) {

				XSSFSheet sheet = workBook.getSheetAt(i);
				int totalRows = sheet.getLastRowNum() - sheet.getFirstRowNum();
				Row headerRow = sheet.getRow(0);
				for (int row = 1; row <= totalRows; row++) {
					Row row1 = sheet.getRow(row);
					for (int c = 0; c < row1.getLastCellNum(); c++) //{
						map.put(headerRow.getCell(c).getStringCellValue(), row1
								.getCell(c).getStringCellValue());
			
					
						System.out.println("MADHU");
				
					
					
					
					//}
					System.out.println(map);
//					/*for (Map.Entry entry : map.entrySet()) {
//						System.out.println(entry.getKey() + " -- "
//								+ entry.getValue());
//					}*/
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;

	}

	public static void main(String[] args) {
		loadExcelData();
	}

}
