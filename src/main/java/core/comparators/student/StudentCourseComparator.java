package core.comparators.student;

import core.Student;

public class StudentCourseComparator implements StudentComparator {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getCourse(), o2.getCourse());
    }
}
