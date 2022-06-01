package poi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

//GO TO THE EXEL FILE THAT YOU SAVED THEN COPY IT AND PASTE IT ON RESOURCES.
//sadece row u alip kacinci cell oldugunu yaziyouruz
public class ReadFromExcel {

    //workbook -->sheet-->Row--->Cell
    Workbook workbook;

    @Test
    public void readData1() throws IOException {
        File excelFile = new File("src/test/resources/testData.xlsx");
        FileInputStream fileInputStream = new FileInputStream(excelFile);


        //getting whole excel structure
        Workbook workbook = new XSSFWorkbook(fileInputStream);

        //getting the first sheet
        Sheet sheet = workbook.getSheet("Sheet1");

        //getting the first row
        Row row1 = sheet.getRow(0);

        //getting the first cell/column
        Cell cell1 = row1.getCell(0);

        String firstName = cell1.toString();

        Assert.assertEquals("First Name", firstName);
        System.out.println(firstName);
    }

    @Test
    public void readData2() throws IOException {
        File excelFile = new File("src/test/resources/testData.xlsx");
        FileInputStream fileInputStream = new FileInputStream(excelFile);
        //FileInputStream takes the data from file and put it in intelij as String
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet1 = workbook.getSheetAt(0);
        Row row1 = sheet1.getRow(0);

        for (int i = row1.getFirstCellNum(); i < row1.getLastCellNum(); i++) {
            Cell tempCell = row1.getCell(i);
            System.out.print(tempCell + " | ");
        }

    }

    @Test
    public void readData3() {
    Sheet sheet = workbook.getSheet("Sheet1");
    int totalRows = sheet.getLastRowNum();
    for (int i = sheet.getFirstRowNum();i<=totalRows;i++){
        Row tempRow = sheet.getRow(i);
        for (int j= tempRow.getFirstCellNum();j<tempRow.getLastCellNum();j++){
            Cell tempCell = tempRow.getCell(j);
            System.out.print(tempCell + " | ");
        }
        System.out.println();
    }
    }

    @Before
    public void setup() throws IOException {
        File excelFile = new File("src/test/resources/testData.xlsx");
        FileInputStream fileInputStream = new FileInputStream(excelFile);
        workbook = new XSSFWorkbook(fileInputStream);
    }

}

