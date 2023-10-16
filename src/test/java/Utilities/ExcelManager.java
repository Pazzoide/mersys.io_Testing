package Utilities;

import io.cucumber.java.Scenario;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelManager {
    public static ArrayList<ArrayList<String>> getData(String filePath, String sheetTitle, int columnCount) {
        ArrayList<ArrayList<String>> Matrix = new ArrayList<>();
        Sheet dataSheet = null;
        try {
            FileInputStream fileSource = new FileInputStream(filePath);
            Workbook dataWorkbook = WorkbookFactory.create(fileSource);
            dataSheet = dataWorkbook.getSheet(sheetTitle);
        } catch (IOException Ex) {
            throw new RuntimeException(Ex);
        }
        for (int i = 0; i < dataSheet.getPhysicalNumberOfRows(); i++) {
            ArrayList<String> rowData = new ArrayList<>();
            for (int j = 0; j < columnCount; j++) {
                rowData.add(dataSheet.getRow(i).getCell(i).toString());
            }
            Matrix.add(rowData);
        }
        return Matrix;
    }

    public static void excelWriter(String filePath, Scenario testCase) {
        File file = new File(filePath);
        if (!file.exists()) {
            XSSFWorkbook excelWorkbook = new XSSFWorkbook();
            XSSFSheet excelSheet = excelWorkbook.createSheet("Page1");
            Row row = excelSheet.createRow(0);
            Cell cell1 = row.createCell(0);
            cell1.setCellValue(testCase.getName());
            Cell cell2 = row.createCell(1);
            cell2.setCellValue(testCase.getStatus().toString());
            try {
                FileOutputStream outputWriter = new FileOutputStream(filePath);
                excelWorkbook.write(outputWriter);
                excelWorkbook.close();
                outputWriter.close();
            } catch (IOException Ex) {
                throw new RuntimeException(Ex);
            }
        } else {
            FileInputStream fileSource2 = null;
            Workbook excelWorkbook2 = null;
            Sheet excelSheet2 = null;
            try {
                fileSource2 = new FileInputStream(filePath);
                excelWorkbook2 = WorkbookFactory.create(fileSource2);
                excelSheet2 = excelWorkbook2.getSheetAt(0);
            } catch (IOException Ex) {
                throw new RuntimeException(Ex);
            }
            int lastRowIndex = excelSheet2.getPhysicalNumberOfRows();
            Row newRow = excelSheet2.createRow(lastRowIndex);
            Cell newCell1 = newRow.createCell(0);
            newCell1.setCellValue(testCase.getName());
            Cell newCell2 = newRow.createCell(1);
            newCell2.setCellValue(testCase.getStatus().toString());
            try {
                fileSource2.close();
                FileOutputStream outputStream = new FileOutputStream(filePath);
                excelWorkbook2.write(outputStream);
                excelWorkbook2.close();
                outputStream.close();
            } catch (IOException Ex) {
                throw new RuntimeException(Ex);
            }
        }
    }
}
