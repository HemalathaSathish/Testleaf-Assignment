package week5.day3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExlFileTCIntegration {

	// Integration step 1 :Convert to String[][]
	public static String[][] getValue()throws IOException {
		// Step1 : Create Workbook And store locations2
		
		XSSFWorkbook wb = new XSSFWorkbook("./ReadExcel/CreateLead.xlsx");
		
		//Step2 : Access the sheet in workbook
		XSSFSheet detailSheet = wb.getSheetAt(0);
		
		//step 3: Access the specific Row
		XSSFRow row1 = detailSheet.getRow(1);

		//Getting number of rows in a table INCLUDING HEADER
		int lastRowNum = detailSheet.getLastRowNum();
		System.out.println("Printing number of rows including header : " +lastRowNum);
		
		//Getting number of rows in a table EXCLUDING HEADER
		int physicalNumberOfRows = detailSheet.getPhysicalNumberOfRows();
		System.out.println("Printing number of rows Excluding header : "+physicalNumberOfRows);
		
		//Getting number of Cell or Column in a table WITHOUT HEADER
		short lastCellNum = detailSheet.getRow(3).getLastCellNum();
		System.out.println("Number of Cells for a row : " + lastCellNum);
		
		//step 4 : Get the cell (or) column value using row
		XSSFCell cellVal =row1.getCell(2);
		System.out.println("Printing the Column number specific : " +cellVal);
		
		//Integration STEP 2:
		String data[][]=new String[lastRowNum][lastCellNum];
		
		
		//Step 5: Printing the values of all the cells 
		String allStringCellValue = cellVal.getStringCellValue();
		System.out.println("All the values of the String : "+ allStringCellValue);
		System.out.println();

		// To print all the values of the excel table
		System.out.println("Complete table values printing");
		System.out.println();

		for (int i = 1; i <= lastRowNum; i++) {
			
			for (int j = 0; j < lastCellNum ; j++) {
				
				String completeVal = detailSheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(completeVal +"  |  ");
				data[i-1][j]=completeVal;
			}
			System.out.println();	
		}
		 wb.close();
		 return data;	
		
	}

	}


