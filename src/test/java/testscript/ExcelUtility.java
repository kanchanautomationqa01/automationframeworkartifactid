package testscript;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
public static Object readExcelData(String filepath,String sheetname) throws IOException
{
	FileInputStream fis = new FileInputStream(new File(filepath));
    Workbook workbook = new XSSFWorkbook(fis);
    Sheet sheet = workbook.getSheet(sheetname);
    
    int rowcount = sheet.getPhysicalNumberOfRows();//rowcount = 3
    int callcount = sheet.getRow(0).getLastCellNum();//coloumn count = 2
    
  Object[][] data = new Object[rowcount-1][callcount];
    for (int i = 1 ; i<rowcount ; i++)
    {
    	Row row = sheet.getRow(i);
    	
		    	for (int j =0; j<callcount; j++)
		    	{
		    		
		    		Cell cell = row.getCell(j);
		    		data [i-1][j] = cell.toString();
		    	}
		    	
    	
    }
    
			    workbook.close();
			    return data;
}
    
	
	
	
	
	
	

}
