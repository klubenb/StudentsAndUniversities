import core.Student;
import core.StudyProfile;
import core.University;

import java.io.IOException;
import java.util.List;

import static util.ExcelReader.readStudentsFromExcel;
import static util.ExcelReader.readUniversitiesFromExcel;

public class Main {
    public static void main(String[] args) throws IOException {
//        University university1 = new University();
//        University university2 = new University("National Research Nuclear io.University Moscow Engineering Physics Institute", "MEPhI", 1942, StudyProfile.PHYSICS);
//
//        Student student1 = new Student();
//        Student student2 = new Student("Petr Lomonosov", university2.getId(), 1, 4.2F);

//        System.out.println(university1);
//        System.out.println(university2);
//        System.out.println(student1);
//        System.out.println(student2);

        List<University> universities = readUniversitiesFromExcel();
        List<Student> students = readStudentsFromExcel();

        for (Student student : students){
            System.out.println(student);
        }

        for (University university : universities){
            System.out.println(university);
        }
    }
}
