package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
       FileInputStream fis = new FileInputStream("./Testdata/testdata.xlsx");
       Workbook wb = WorkbookFactory.create(fis);
       
       String data=wb.getSheet("TestingData").getRow(3).getCell(1).getStringCellValue();
       System.out.println(data);      
       
       double data1 = wb.getSheet("TestingData").getRow(2).getCell(0).getNumericCellValue();//getNumericCellValue-->return type double
	   System.out.println(data1);
	}

}
