package Divrt.Dashboard;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Excel1
{
	public static String folderpath="E:\\";
	public static Workbook book;
	public static Sheet sh;
	public static WritableWorkbook wbook;
	public static WritableSheet wsh;
	// create excel connetion to read the data
		public static void createExcelConnection(String fileName, String sheetName)
		{
			try
			{
				FileInputStream fis = new FileInputStream(folderpath + fileName);
				book = Workbook.getWorkbook(fis);
				sh = book.getSheet(sheetName);
			} 
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// get no of rows
		public static int rowCount()
		{
			return sh.getRows();
		}

		// get no of columns
		public static int columnCount() 
		{
			return sh.getColumns();
		}
		// read the data from a particular cell
		public static String readData(int cnum, int rnum) 
		{
			return sh.getCell(cnum, rnum).getContents();
			
		}
}
