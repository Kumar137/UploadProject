package excelreader;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.*;

public class ExcelReader {

    public static void main(String[] args) throws IOException, InvalidFormatException {

        FileInputStream fis=new FileInputStream("C:\\Users\\krshu\\OneDrive\\Desktop\\AutomationReader.xlsx");
        Workbook wb= WorkbookFactory.create(fis);
        Sheet sh=wb.getSheetAt(0);
//       // wb.getSheet()
        Row rw=sh.getRow(2);
//       // String str=rw.getCell(0).getStringCellValue();
//        double value=rw.getCell(2).getNumericCellValue();
//        System.out.println((int)value);

        int index=sh.getLastRowNum();
        System.out.println(index);
        int index2=rw.getLastCellNum();
        System.out.println(index2);


        writedataToExcel();

    }

    public static void writedataToExcel() throws IOException, InvalidFormatException {
        FileInputStream fis=new FileInputStream("C:\\Users\\krshu\\OneDrive\\Desktop\\AutomationReader.xlsx");
        Workbook wb= WorkbookFactory.create(fis);
        Sheet sh=wb.getSheetAt(0);
//       // wb.getSheet()
        Row rw=sh.getRow(2);

        rw.createCell(3).setCellValue("FAIL");

        FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\krshu\\OneDrive\\Desktop\\AutomationReader.xlsx");
        wb.write(fileOutputStream);
        fileOutputStream.close();


    }
}
