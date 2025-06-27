package Day40_ExcelReadWrite;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// Excel File >> Workbook >> Sheets >> Rows >> Cells

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
//		XSSFSheet sheet1 = workbook.getSheetAt(0);
		
		int totalRows = sheet.getLastRowNum();
		
		int totalCells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("No of rows : " + totalRows); // 5
		System.out.println("No of cells : " + totalCells); // 4 
		
		for(int r=0; r<=totalRows; r++) {
			
			XSSFRow currentRow = sheet.getRow(r);
			
			for (int c=0; c<totalCells; c++) {
				XSSFCell currCell = currentRow.getCell(c);
				System.out.print(currCell.toString() + "\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
	}

}
