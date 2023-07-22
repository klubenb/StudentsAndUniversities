package core;

import core.enums.StudyProfile;

import java.util.List;

public class Statistics {
    private StudyProfile studyProfile;
    private double avgExamScore;
    private int studentsCountByProfile;
    private int universityConutByProfile;
    private List<String> universitiesNames;

    public Statistics(StudyProfile studyProfile, double avgExamScore, int studentsCountByProfile, int universityConutByProfile, List<String> universitiesNames) {
        this.studyProfile = studyProfile;
        this.avgExamScore = avgExamScore;
        this.studentsCountByProfile = studentsCountByProfile;
        this.universityConutByProfile = universityConutByProfile;
        this.universitiesNames = universitiesNames;
    }

    public StudyProfile getStudyProfile() {
        return studyProfile;
    }

    public void setStudyProfile(StudyProfile studyProfile) {
        this.studyProfile = studyProfile;
    }

    public double getAvgExamScore() {
        return avgExamScore;
    }

    public void setAvgExamScore(double avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

    public int getStudentsCountByProfile() {
        return studentsCountByProfile;
    }

    public void setStudentsCountByProfile(int studentsCountByProfile) {
        this.studentsCountByProfile = studentsCountByProfile;
    }

    public int getUniversityConutByProfile() {
        return universityConutByProfile;
    }

    public void setUniversityConutByProfile(int universityConutByProfile) {
        this.universityConutByProfile = universityConutByProfile;
    }

    public List<String> getUniversitiesNames() {
        return universitiesNames;
    }

    public void setUniversitiesNames(List<String> universitiesNames) {
        this.universitiesNames = universitiesNames;
    }
}
