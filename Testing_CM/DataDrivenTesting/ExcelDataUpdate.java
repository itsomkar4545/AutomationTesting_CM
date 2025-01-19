package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataUpdate {

	
      public void updateintoExcel(String sheet,int row,int cell,String value) throws EncryptedDocumentException, IOException
      {
    	  FileInputStream fis =new FileInputStream("./Testdata/testdata.xlsx");
    	  Workbook wb = WorkbookFactory.create(fis);
    	  
    	  wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);
    	  
    	  FileOutputStream fos=new FileOutputStream("./Testdata/testdata.xlsx");
    	  wb.write(fos);
    	  }

}
    