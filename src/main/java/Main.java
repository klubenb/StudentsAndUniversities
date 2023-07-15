import core.Student;
import core.University;

import java.io.IOException;
import java.util.List;

import static util.ExcelReader.readStudentsFromExcel;
import static util.ExcelReader.readUniversitiesFromExcel;
import static util.JsonUtil.*;

public class Main {
    public static void main(String[] args) throws IOException {

        List<University> universities = readUniversitiesFromExcel();
        List<Student> students = readStudentsFromExcel();

        String universitiesJson = universitiesListToJson(universities);
        String studetsJson = studentsListToJson(students);

        System.out.println(universitiesJson);
        System.out.println(studetsJson);

        List<University> deserializedUniversities = jsonToUniversitiesList(universitiesJson);
        List<Student> deserializedStudents = jsonToStudentsList(studetsJson);

        System.out.println(universities.size() == deserializedUniversities.size());
        System.out.println(students.size() == deserializedStudents.size());

        students.stream().forEach(student -> {
            String json = studentToJson(student);
            System.out.println(json);
            Student student1 = jsonToStudent(json);
            System.out.println(student1);
        });

        universities.stream().forEach(university -> {
            String json = universityToJson(university);
            System.out.println(json);
            University university1 = jsonToUniversity(json);
            System.out.println(university1);
        });
    }
}
