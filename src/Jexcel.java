import java.io.File;

import jxl.Workbook;


public class Jexcel {

public static void main(String[] args) throws Exception {
		
		//Specify the location
		File src = new File("C:\\Users\\560932\\Downloads\\New_Jexcel.xls");
		System.out.println("file detected");
		
		//Loading the workbook
		Workbook wb = Workbook.getWorkbook(src);
		System.out.println("file open");
		
		//Loading cell
		String data00= wb.getSheet(0).getCell(0,0).getContents();
		System.out.println("Data is"+data00);
		String data11= wb.getSheet(0).getCell(1,1).getContents();
		System.out.println("Data is"+data11);
		
		//Printing the number of rows in the work sheet
		int row = wb.getSheet(0).getRows();
		System.out.println("TOtal number of rows :"+row);
	}

}
