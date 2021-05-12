package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public String[][] excelData(String fileName) throws IOException {
		//Step1-set up the workbook path
		XSSFWorkbook wb= new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		
		//Step2-Get in to the worksheet
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		
		int rowcount=ws.getLastRowNum();//excluding first row
		System.out.println(rowcount);
		
		//int incFR=ws.getPhysicalNumberOfRows();//includes first row
		
		short cellCount = ws.getRow(0).getLastCellNum();
		String[][] data=new String[rowcount][cellCount];
		
		for(int i=1;i<=rowcount;i++) {//rows
			for(int j=0;j<cellCount;j++) {//column
				
				String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=cellValue;
				//System.out.println(cellValue);
				
			}	
		}
		
		wb.close();
		return data;

	}

}
