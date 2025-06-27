package Day40_ExcelReadWrite;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Data");
		
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue(19);
		row1.createCell(2).setCellValue("Selenium");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Python");
		row2.createCell(1).setCellValue(3);
		row2.createCell(2).setCellValue("RestAPI");
		
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("C#");
		row3.createCell(1).setCellValue(17);
		row3.createCell(2).setCellValue("Coding");

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\Writedata.xlsx");
		
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created...");
		
		
		
		
		
		
	}

}
