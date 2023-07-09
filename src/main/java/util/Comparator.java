package util;

import core.comparators.student.*;
import core.comparators.university.*;
import core.enums.StudentComparatorType;
import core.enums.UniversityComparatorType;

public class Comparator {
    private Comparator(){

    }

    public static StudentComparator getStudentComparator(StudentComparatorType comparatorType){
        switch (comparatorType){
            case COURSE:
                return new StudentCourseComparator();
            case FULL_NAME:
                return new StudentFullNameComparator();
            case UNIVERSITY_ID:
                return new StudentUniversityIdComparator();
            case AVG_EXAM_SCORE:
                return new StudentAvgExamScoreComparator();
            default:
                return new StudentFullNameComparator();
        }
    }

    public static UniversityComparator getUniversityComparator(UniversityComparatorType comparatorType){
        switch (comparatorType){
            case ID:
                return new UniversityIdComparator();
            case FULL_NAME:
                return  new UniversityFullNameComparator();
            case SHORT_NAME:
                return new UniversityShortNameComparator();
            case YEAR_OF_FOUNDATION:
                return new UniversityYearOfFoundationComparator();
            case MAIN_PROFILE:
                return new UniversityProfileComparator();
            default:
                return new UniversityFullNameComparator();
        }
    }
}


