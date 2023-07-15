package core;

import com.google.gson.annotations.SerializedName;

public class Student {

    @SerializedName("Full Name")
    private String fullName;
    @SerializedName("University ID")
    private String universityId;
    @SerializedName("Course")
    private int course;
    @SerializedName("Average Exam Score")
    private float avgExamScore;

    public Student() {
        this("Ivan Ivanov", null, 0, 4.5F);
    }

    public Student(String fullName, String universityId, int course) {
        this(fullName, universityId, course, 0);
    }

    public Student(String fullName, String universityId, int course, float avgExamScore) {
        this.fullName = fullName;
        this.universityId = universityId;
        this.course = course;
        this.avgExamScore = avgExamScore;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUniversityId() {
        return universityId;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public void setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

    @Override
    public String toString() {
        return String.format("\nStudent %s is learning in university %s at %d course ad has %f average exam score", fullName, universityId, course, avgExamScore);
    }
}
