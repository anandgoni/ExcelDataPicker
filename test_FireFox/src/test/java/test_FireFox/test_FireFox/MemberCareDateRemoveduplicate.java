package test_FireFox.test_FireFox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class MemberCareDateRemoveduplicate {
	


	public static void main(String[] args) throws Exception {
		

		//String path = new File("H:/PriorityWork/open-for-3-days-or-more-chat-view-2017-08-28-0623.xlsx").getAbsolutePath();
		//FileInputStream fis = new FileInputStream("H:/PriorityWork/Open for 3 days/open-for-3-days-or-more-chat-view-2017-08-28-0623.xlsx");
		
		FileInputStream fis = new FileInputStream("H:\\PriorityWork\\Jan2018\\Jan2018.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row=sheet.getRow(0);
		XSSFCell cell=null;
		XSSFCell cell1=null;
		XSSFCell cellDate=null;
	
	Map<String, String> mp1 = new HashMap<String, String>();
	Map<String,Integer> CustomerNames=new HashMap<String,Integer>();
		
		
		for(int i=1;i<=sheet.getLastRowNum();i++){
			row=sheet.getRow(i);
			cell=row.getCell(0);
			cell1=row.getCell(1);
			cellDate=row.getCell(2);
			
			if(CustomerNames.keySet().contains(cell.getStringCellValue()))
			    {
				 int count=CustomerNames.get(cell.getStringCellValue());
				 CustomerNames.put(cell.getStringCellValue(),(int) (cell1.getNumericCellValue()+count));

			    }else
			    {
			    	CustomerNames.put(cell.getStringCellValue(),(int)cell1.getNumericCellValue());
			    }
			
			    if(mp1.keySet().contains(cell.getStringCellValue()))
			    {
			    	String datevalue = mp1.get(cell.getStringCellValue()) +","+ cellDate.getStringCellValue();
			    	mp1.put(cell.getStringCellValue(), datevalue);
			    //	System.out.println( "Customer Name :"+datevalue);
	
			    }else
			    {
			    	mp1.put(cell.getStringCellValue(), cellDate.getStringCellValue()) ;
			    }
			
		}			
			

		int j=1;
		XSSFSheet sheet1 = workbook.getSheet("latest");
		for (String key : CustomerNames.keySet()) {
			//System.out.println(" Key :"+key);
			row = sheet1.createRow(j);
			cell = row.createCell(0);
			cell1=row.createCell(1);
			if(CustomerNames.get(key)>1){
			cell.setCellValue(key);
			cell1.setCellValue(CustomerNames.get(key));
			cellDate=row.createCell(2);
			cellDate.setCellValue(mp1.get(key));
			j++;
			}
					
		}
		FileOutputStream fos = new FileOutputStream("H:/PriorityWork/Jan2018/Jan2018.xlsx");
		workbook.write(fos);

		fos.close();

		
	}
}
