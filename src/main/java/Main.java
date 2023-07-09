import core.Student;
import core.University;
import core.comparators.student.StudentComparator;
import core.comparators.university.UniversityComparator;
import core.enums.StudentComparatorType;
import core.enums.UniversityComparatorType;

import java.io.IOException;
import java.util.List;

import static util.Comparator.getStudentComparator;
import static util.Comparator.getUniversityComparator;
import static util.ExcelReader.readStudentsFromExcel;
import static util.ExcelReader.readUniversitiesFromExcel;

public class Main {
    public static void main(String[] args) throws IOException {

        StudentComparator studentComparator = getStudentComparator(StudentComparatorType.FULL_NAME);
        UniversityComparator universityComparator = getUniversityComparator(UniversityComparatorType.FULL_NAME);


        List<University> universities = readUniversitiesFromExcel();
        List<Student> students = readStudentsFromExcel();

       students.stream()
               .sorted(studentComparator)
               .forEach(System.out::println);
       universities.stream()
               .sorted(universityComparator)
               .forEach(System.out::println);
    }
}
