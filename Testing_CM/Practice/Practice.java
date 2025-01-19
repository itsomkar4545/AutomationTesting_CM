package Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Testdata/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		
		String a1 = wb.getSheet("Sheet2").getRow(2).getCell(2).getStringCellValue();
		System.out.println(a1);
	}

	
}
