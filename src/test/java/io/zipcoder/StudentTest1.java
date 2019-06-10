package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest1 {

    @Test
    public void getFirstName() {
        //Given
        String expected = "Edward";
        String expected2 = "Korkollie";
        Student student = new Student(expected, expected2);

        //When

        String output = student.getFirstName();
        String output2 = student.getLastName();

        //Then

        Assert.assertEquals(expected, output);
        Assert.assertEquals(expected2, output2);
    }

    @Test
    public void setFirstName() {
        //Given
        Student student = new Student("Edward");
        String expected = "John";

        //When
        student.setFirstName(expected);
        String output = student.getFirstName();
        //Then
        Assert.assertEquals(expected, output);
    }

    @Test
    public void getLastName() {
        //Given";
        String expected = "Korkollie";
        Student student = new Student("",expected,null);

        //When
        //student.setFirstName(expected);
        String output = student.getLastName();


        //Then

        Assert.assertEquals(expected, output);

    }

    @Test
    public void getExamScores() {
        //Given
//
        Double[] expected = {100.0, 200.0};
        Student student = new Student();
        //When

        student.setExamScores(expected);
        Double[] output = student.getExamScores();
        System.out.println(Arrays.asList(output));
        //Then
        Assert.assertEquals(expected, output);
    }

    @Test
    public void setLastName() {
    }

    @Test
    public void setExamScores() {
    }

    @Test
    public void getNumberOfExamsTaken() {

        //Given
        ArrayList<Double> arr = new ArrayList<>();
        arr.add(100.0);
        arr.add(150.0);
        Student stu1 = new Student(arr);
        Integer expected = arr.size();
        //When
        Integer outPut = stu1.getNumberOfExamsTaken();
        //Then
        Assert.assertEquals(expected, outPut);
    }

    @Test
    public void getSumOfAllExamScores() {

        //Given
        ArrayList<Double> arr = new ArrayList<>();
        arr.add(100.0);
        arr.add(150.0);
        Student stu1 = new Student(arr);
        Double expected = 0.0;
        for (Double st: arr)
                expected += st;




        //When
        Double actual = stu1.getSumOfAllExamScores();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getExamScoresString() {

    }

    @Test
    public void addExamScore() {
    }

    @Test
    public void setExamScore() {
    }

    @Test
    public void getAverageExamScore() {
       //Given
        ArrayList<Double> arr = new ArrayList<>();
        arr.add(100.0);
        arr.add(200.0);
        Student stu1 = new Student(arr);
        Double sum = 0.0;
        for (Double st: arr)
            sum += st;
        Double expected = sum/arr.size();
        //When
        Double actual = stu1.getAverageExamScore();
        //Then
        Assert.assertEquals(expected, actual);

        //
    }

    @Test
    public void isGradeA() {
    }

    @Test
    public void isGradeB() {
    }

    @Test
    public void isGradeC() {
    }

    @Test
    public void isGradeD() {
    }

    @Test
    public void isGradeF() {
    }

    @Test
    public void getAverageGrade() {
    }

    @Test
    public void getFirstName1() {
    }

    @Test
    public void setFirstName1() {
    }

    @Test
    public void getLastName1() {
    }

    @Test
    public void getExamScores1() {
    }

    @Test
    public void setLastName1() {
    }

    @Test
    public void setExamScores1() {
    }

    @Test
    public void getNumberOfExamsTaken1() {
    }

    @Test
    public void getSumOfAllExamScores1() {
    }
}