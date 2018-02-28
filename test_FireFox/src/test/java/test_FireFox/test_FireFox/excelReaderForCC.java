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



public class excelReaderForCC {
	


	public static void main(String[] args) throws Exception {
		

		//String path = new File("H:/PriorityWork/open-for-3-days-or-more-chat-view-2017-08-28-0623.xlsx").getAbsolutePath();
		//FileInputStream fis = new FileInputStream("H:/PriorityWork/Open for 3 days/open-for-3-days-or-more-chat-view-2017-08-28-0623.xlsx");
		
		FileInputStream fis = new FileInputStream("H:/PriorityWork/Sep_15/First_1_1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row=sheet.getRow(0);
		XSSFCell cell=null;
		XSSFCell cell1=null;
		XSSFCell cellDate=null;
		List<String> CustomerNames=new ArrayList<String>();
		
		
		System.out.println("Hi :"+sheet.getLastRowNum());
		
		for(int i=1;i<=sheet.getLastRowNum();i++){
			row=sheet.getRow(i);
			cell=row.getCell(5);
			if(cell==null){
				
			}else{
			CustomerNames.add(cell.getStringCellValue());
			
			}
			//System.out.println(cell.getStringCellValue());
		}
		
		Map<String, Integer> mp = new HashMap<String, Integer>();
		Map<String, String> mp1 = new HashMap<String, String>();

		for (String customerName : CustomerNames) {

		    if(mp.keySet().contains(customerName))
		    {
		        mp.put(customerName, mp.get(customerName)+1);
		        System.out.println( "Customer Name :"+customerName);

		    }else
		    {
		        mp.put(customerName, 1);
		    }
		}

		//System.out.println("=mp="+mp);
		int j=1;
		XSSFSheet sheet1 = workbook.getSheet("latest");
		for (String key : mp.keySet()) {
			System.out.println(" Key :"+key);
			row = sheet1.createRow(j);
			cell = row.createCell(0);
			cell1=row.createCell(1);
			if(mp.get(key)>1){
			cell.setCellValue(key);
			cell1.setCellValue(mp.get(key));
			j++;
			}
					
		}
		FileOutputStream fos = new FileOutputStream("H:/PriorityWork/Sep_15/First_1_1.xlsx");
		workbook.write(fos);

		fos.close();

	}
}
