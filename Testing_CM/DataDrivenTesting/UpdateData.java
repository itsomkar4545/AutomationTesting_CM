package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UpdateData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
      FileInputStream fis =new FileInputStream("./Testdata/testdata.xlsx");
      Workbook wb = WorkbookFactory.create(fis);
      wb.getSheet("TestingData").getRow(1).getCell(1).setCellValue("Raju");
      
      FileOutputStream fos= new FileOutputStream("./TestData/testdata.xlsx");//java class
      wb.write(fos);
      wb.close();
	}

}
  