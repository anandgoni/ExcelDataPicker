package test_FireFox.test_FireFox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelRemoveduplicate {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("H:/PriorityWork/Sep_15/Consolidated.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row=sheet.getRow(0);
		XSSFCell cell=null;
		XSSFCell cell1=null;
		XSSFSheet sheet1 = workbook.getSheet("latest");
		Map<String,Integer> CustomerNames=new HashMap<String,Integer>();
		
		
		System.out.println("Hi :"+sheet.getLastRowNum());
		
		for(int i=1;i<=sheet.getLastRowNum();i++){
			row=sheet.getRow(i);
			cell=row.getCell(0);
			cell1=row.getCell(1);
			if(cell==null){
				
			}else{
				 if(CustomerNames.keySet().contains(cell.getStringCellValue()))
				    {
					 int count=CustomerNames.get(cell.getStringCellValue());
					 CustomerNames.put(cell.getStringCellValue(),(int) (cell1.getNumericCellValue()+count));

				    }else
				    {
				    	CustomerNames.put(cell.getStringCellValue(),(int)cell1.getNumericCellValue());
				    }

			
			}
		

	}
		int j=1;
		for (String key : CustomerNames.keySet()) {
			row = sheet1.createRow(j);
			cell = row.createCell(0);
			cell1=row.createCell(1);
			if(CustomerNames.get(key)>1){
			cell.setCellValue(key);
			cell1.setCellValue(CustomerNames.get(key));
			j++;
			}
					
		}
		FileOutputStream fos = new FileOutputStream("H:/PriorityWork/Sep_15/Consolidated.xlsx");
		workbook.write(fos);

		fos.close();

	}
}
