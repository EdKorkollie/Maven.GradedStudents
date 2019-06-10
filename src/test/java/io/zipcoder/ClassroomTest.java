package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClassroomTest {

    @Test
    public void getStudents() {
        Double[] sco1 = {100.5, 200.4};
        Double[] sco2 = {150.3, 210.3};
        Student stu1 = new Student("Ed", "Ko", sco1);
        Student stu2 = new Student("Jo", "Jb", sco2);
        Student[] s1 = new Student[]{stu1, stu2 };
        Classroom class1  = new Classroom(s1);
        Student[] actual = class1.getStudents();

        Assert.assertArrayEquals(s1, actual);

    }

    @Test
    public void getMaxNumberOfStudents() {
        // given
        int expectedNumber = 40;
        Classroom classroom = new Classroom(expectedNumber);

        //when
        int actualNumber = classroom.getMaxNumberOfStudents();
        Assert.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void addStudent() {
        Double[] sco1 = {100.5, 200.4};
        Student stu1 = new Student("Ed", "Ko", sco1);
        Student[] s1 = new Student[]{};
        Student[] expected = new Student[]{stu1};
        Classroom class1  = new Classroom(s1);

        class1.addStudent(stu1);
        Student[] actual = class1.getStudents();
        Assert.assertArrayEquals(expected, actual);
        // Given
    }

    @Test
    public void removeStudent() {
        Double[] sco1 = {100.5, 200.4};
        Student stu1 = new Student("Ed", "Ko", sco1);
        Student[] s1 = new Student[]{stu1};
        Student[] expected = new Student[]{null};
        Classroom class1  = new Classroom(s1);

        class1.removeStudent("Ed", "Ko");
        Student[] actual = class1.getStudents();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getStudentsByScore() {
        Double[] sco1 = {100.5, 200.4};
        Double[] sco2 = {150.3, 210.3};
        Student stu1 = new Student("Ed", "Ko", sco1);
        Student stu2 = new Student("Jo", "Jb", sco2);
        Student[] s1 = new Student[]{stu1, stu2 };
        Classroom class1  = new Classroom(s1);
        Student[] actual = class1.getStudentsByScore();

        Assert.assertArrayEquals(s1, actual);


    }

    @Test
    public void getGradeBook() {
    }
}