package util;

import core.Student;
import core.StudyProfile;
import core.University;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelReader {

    private ExcelReader(){

    }

    public static List<Student> readStudentsFromExcel() throws IOException {
        List<Student> students = new ArrayList<>();

        FileInputStream fis = new FileInputStream("src/main/resources/universityInfo.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet studentsSheet = workbook.getSheet("Студенты");

        Iterator<Row> iterator = studentsSheet.iterator();
        iterator.next();

        while (iterator.hasNext()){
            Row currentRow = iterator.next();
            students.add(new Student(
                    currentRow.getCell(1).getStringCellValue(),
                    currentRow.getCell(0).getStringCellValue(),
                    (int) currentRow.getCell(2).getNumericCellValue(),
                    (float) currentRow.getCell(3).getNumericCellValue()));
        }
        return students;
    }

    public static List<University> readUniversitiesFromExcel() throws IOException {
        List<University> universities = new ArrayList<>();

        FileInputStream fis = new FileInputStream("src/main/resources/universityInfo.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet studentsSheet = workbook.getSheet("Университеты");

        Iterator<Row> iterator = studentsSheet.iterator();
        iterator.next();

        while (iterator.hasNext()){
            Row currentRow = iterator.next();
            universities.add(new University(
                    currentRow.getCell(0).getStringCellValue(),
                    currentRow.getCell(1).getStringCellValue(),
                    currentRow.getCell(2).getStringCellValue(),
                    (int) currentRow.getCell(3).getNumericCellValue(),
                    StudyProfile.valueOf(currentRow.getCell(4).getStringCellValue())));
        }
        return universities;
    }
}
