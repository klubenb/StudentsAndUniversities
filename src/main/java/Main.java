import core.Statistics;
import core.Student;
import core.University;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static util.JsonUtil.*;
import static util.StatisticsGenerator.generateStatistics;
import static util.XlsReader.readStudentsFromExcel;
import static util.XlsReader.readUniversitiesFromExcel;
import static util.XlsWriter.writeStatisticsToExcel;

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

        List<Statistics> statisticsList = generateStatistics(readUniversitiesFromExcel(), readStudentsFromExcel());
        writeStatisticsToExcel(statisticsList, Path.of("src/main/resources/output"));
    }
}
