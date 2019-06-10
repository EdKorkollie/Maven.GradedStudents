package io.zipcoder;
import io.zipcoder.Student;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {

         int indexChange = s2.getAverageExamScore().compareTo(s1.getAverageExamScore());
        if(indexChange == 0) {
            indexChange = s1.getLastName().compareTo(s2.getLastName());
        }
        return indexChange;
    }
}
