package util;

import core.Statistics;
import core.Student;
import core.University;
import core.enums.StudyProfile;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class StatisticsGenerator {
    private StatisticsGenerator(){

    }

    public static List<Statistics> generateStatistics(List<University> universities, List<Student> students){

        List<Statistics> statisticsList = new ArrayList<>();

        Set<StudyProfile> studyProfiles1 = universities.stream()
                .map(University :: getMainProfile)
                .collect(Collectors.toSet());

        studyProfiles1.stream().forEach(studyProfile -> {
            Statistics statistics = new Statistics();

            statistics.setStudyProfile(studyProfile);

            List<University> universitiesByProfile = universities.stream()
                    .filter(university -> university.getMainProfile().equals(studyProfile))
                    .toList();
            statistics.setUniversityConutByProfile(universitiesByProfile.size());

            List<Student> studentsByProfile = students.stream()
                    .filter(student -> universitiesByProfile.stream()
                            .map(University :: getId)
                            .collect(Collectors.toList())
                            .contains(student.getUniversityId()))
                    .toList();
            statistics.setStudentsCountByProfile(studentsByProfile.size());

            statistics.setUniversitiesNames(universitiesByProfile.stream()
                    .map(University :: getFullName)
                    .collect(Collectors.toList()));

            OptionalDouble avgExamScore1 = studentsByProfile.stream()
                    .mapToDouble(Student::getAvgExamScore)
                    .average();
            //средняя оценка по некоторым профилям может отсутствовать
            statistics.setAvgExamScore(0);
            avgExamScore1.ifPresent(value -> {
                statistics.setAvgExamScore(BigDecimal.valueOf(value).setScale(2, RoundingMode.HALF_UP).doubleValue());
            });

            statisticsList.add(statistics);
        });

        return statisticsList;
    }
}
