package selenium;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataIntoExcel 
{
	public static void main(String[] args) throws IOException
	{
	 Workbook w=new XSSFWorkbook();
	 Sheet s=w.createSheet("TestData");
	 Object [][] datas={{"1","siva","ranjani","Btech"},{"2","kusum","verma","Mtech"}};
	 int rowcont=0;
	 for(Object[] data:datas)
	 {
		 Row r=s.createRow(rowcont++);
		 int cellcount=0;
		 for(Object field:data)
		 {
			 Cell c=r.createCell(cellcount++);
			 if(field instanceof String)
			 {
				 c.setCellValue((String)field);	 
			 }
			 else if(field instanceof Integer)
			 {
				 c.setCellValue((int)field);
			 } 
		 } 
	 }
	 FileOutputStream output=new FileOutputStream("/home/tyss/Desktop/result.xlsx");
	 w.write(output);
		
	 System.out.println("ss");
	}
	
	
	

}
