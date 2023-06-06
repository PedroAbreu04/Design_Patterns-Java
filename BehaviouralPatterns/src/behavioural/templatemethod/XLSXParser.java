package behavioural.templatemethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXParser extends DataParser {
		 
	@Override
	protected List<String> readData() {
		List<String> data = new ArrayList<>();
		try {
			FileInputStream file = new FileInputStream(new File(path));
			Workbook workbook = new XSSFWorkbook(file);
			org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheetAt(0);
			for (Row row : sheet) {
			data.add(row.getCell(0).getStringCellValue());
			}
				workbook.close();
				file.close();
			} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
 
	@Override
	protected void writeData(List<String> data) {
		try {
			Workbook workbook = new XSSFWorkbook();
			org.apache.poi.ss.usermodel.Sheet sheet = workbook.createSheet();
			for (int i=0; i<data.size(); i++) {
			sheet.createRow(i).createCell(0).setCellValue(data.get(i));
			}
			FileOutputStream file = new FileOutputStream(new File(path));
			workbook.write(file);
			workbook.close();
		} catch (IOException e) {
		e.printStackTrace();
		}
 
	}
	 
}
