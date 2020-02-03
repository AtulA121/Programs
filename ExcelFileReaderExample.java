import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileReaderExample {
	public static void main(String[] args) {
		String fileName = "C:/Users/Atul A121/Desktop/sts workspace/com.excelFileProgram/src/main/java/atull.xlsx";
		int n=1;
		updateExcelFile(n,fileName);
	}
	
	private static void updateExcelFile(int n,String fileName){
		try {
            FileInputStream inputStream = new FileInputStream(new File(fileName));
            Workbook workbook = WorkbookFactory.create(inputStream);
            Sheet newSheet = workbook.getSheetAt(0);
            for(int i=0;i<=newSheet.getLastRowNum();i++) {
            	Row row = newSheet.getRow(i);
            	Cell cell=row.getCell(n);
            	if(cell!=null && "Atul Pisal".equals(cell.getStringCellValue())) {
                		cell.setCellValue("Atul");
            	}
            }
            System.out.println("Updated successfully : ");
            FileOutputStream outputStream = new FileOutputStream(fileName);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
             
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
}
