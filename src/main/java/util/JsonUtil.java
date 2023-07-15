package util;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import core.Student;
import core.University;

import java.util.List;

public class JsonUtil {

    private JsonUtil(){}

    public static String studentToJson(Student student){
        return new GsonBuilder().setPrettyPrinting().create().toJson(student);
    }

    public static String studentsListToJson(List<Student> students){
        return new GsonBuilder().setPrettyPrinting().create().toJson(students);
    }

    public static String universityToJson(University university){
        return new GsonBuilder().setPrettyPrinting().create().toJson(university);
    }

    public static String universitiesListToJson(List<University> universities){
        return new GsonBuilder().setPrettyPrinting().create().toJson(universities);
    }

    public static Student jsonToStudent(String json){
        return new GsonBuilder().create().fromJson(json, Student.class);
    }

    public static List<Student> jsonToStudentsList(String json){
        return new GsonBuilder().create().fromJson(json, new TypeToken<List<Student>>(){}.getType());
    }

    public static University jsonToUniversity(String json){
        return new GsonBuilder().create().fromJson(json, University.class);
    }

    public static List<University> jsonToUniversitiesList(String json){
        return new GsonBuilder().create().fromJson(json, new TypeToken<List<University>>(){}.getType());
    }

}
