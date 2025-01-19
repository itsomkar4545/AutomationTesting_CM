package DataDrivenTesting;

import java.io.IOException;

public class MethodsUtilization {

	public static void main(String[] args) throws IOException 
	{
       MethodsForDDT m= new MethodsForDDT();
       String URL=m.readDataFromProperty("url");
       System.out.println(URL);
       
       System.out.println("====================");
       
       String data=m.readDataFromExcel("TestingData", 1,3);//Excel
       System.out.println(data);
       
	}

}
