package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	public static void main(String[] args) throws IOException 
	{
      FileInputStream fis=new FileInputStream("./Testdata/CommonData.property");
      Properties p= new Properties();
      p.load(fis);
      String data=p.getProperty("username");
      System.out.println(data);
	}

}
