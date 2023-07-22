package util;

import core.Statistics;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class XlsWriter {

    private XlsWriter(){

    }

    public static void writeStatisticsToExcel(List<Statistics> statisticsList, Path targetPath){
        Workbook workbook = new XSSFWorkbook();
        //создаю новый лист
        Sheet sheet = workbook.createSheet("Статистика");
        //Создаю заголовок
        Row header = sheet.createRow(0);

        CellStyle headerStyle = workbook.createCellStyle();

        Font headerFont = workbook.createFont();
        headerFont.setItalic(true);
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 13);

        headerStyle.setFont(headerFont);
        headerStyle.setAlignment(HorizontalAlignment.CENTER);
        headerStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        headerStyle.setWrapText(true);


        Cell headerCell = header.createCell(0);
        headerCell.setCellValue("Профиль обучения");
        headerCell.setCellStyle(headerStyle);

        headerCell = header.createCell(1);
        headerCell.setCellValue("Средний балл за экзамен");
        headerCell.setCellStyle(headerStyle);

        headerCell = header.createCell(2);
        headerCell.setCellValue("Кол-во студентов");
        headerCell.setCellStyle(headerStyle);

        headerCell = header.createCell(3);
        headerCell.setCellValue("Кол-во университетов");
        headerCell.setCellStyle(headerStyle);

        headerCell = header.createCell(4);
        headerCell.setCellValue("Названия университетов");
        headerCell.setCellStyle(headerStyle);

//        заполнение таблицы
        AtomicInteger rowNum = new AtomicInteger(1);
        statisticsList.stream().forEach(statistics -> {
            Row row = sheet.createRow(rowNum.getAndIncrement());

            Cell cell = row.createCell(0);
            cell.setCellValue(statistics.getStudyProfile().toString());

            cell = row.createCell(1);
            cell.setCellValue(statistics.getAvgExamScore());

            cell = row.createCell(2);
            cell.setCellValue(statistics.getStudentsCountByProfile());

            cell = row.createCell(3);
            cell.setCellValue(statistics.getUniversityConutByProfile());

            cell = row.createCell(4);
            cell.setCellValue(statistics.getUniversitiesNames().toString());
        });

        String path = targetPath.toString() + "\\statistics.xlsx";
        try (OutputStream outputStream = new FileOutputStream(path)) {
            workbook.write(outputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
