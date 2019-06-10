package io.zipcoder;

import java.util.*;

public class Classroom {
    //private Student[] students;
    private ArrayList<Double> siScores;
    private ArrayList<Double> s2Scores;
    private int maxNumberStudents;

    private ArrayList<Student>students;
    public Classroom()
    {
        this.maxNumberStudents = 30;
        this.students = new ArrayList<>(30);
        //this.students = new Student[30];
    }

    public Classroom(int maxNumberOfStudents)
    {
        this.maxNumberStudents = maxNumberOfStudents;
        students = new ArrayList<>();
        //this.students = new Student[maxNumberOfStudents];
    }


    public Classroom(Student...students)
    {
        if(students != null)
        {
            this.students = new ArrayList<>(Arrays.asList(students));
        }
        else
        {
            this.students = new ArrayList<>();
        }
        this.maxNumberStudents = students.length;
    }

    public Student[] getStudents()
    {

        Student[] studentArray = new Student[students.size()];
        studentArray = students.toArray(studentArray);
        if(studentArray.length == 0)
        {
            studentArray = new Student[1];
        }
        return studentArray;
    }
   public int getMaxNumberOfStudents(){

        return maxNumberStudents;
   }
   public void addStudent(Student student) {
        students.add(student);
   }
   public void removeStudent(String firstName, String lastName) {
        for(int i = 0; i < students.size(); i++) {
            if(students.get(i).getFirstName().equals(firstName) && students.get(i).getLastName().equals(lastName)) {
                students.remove(students.get(i));
            }
        }
   }
   public Student[] getStudentsByScore() {
       Comparator<Student> compareStudents = new StudentComparator();
       students.sort(compareStudents);
       Student[] sortedStudents = new Student[students.size()];
       sortedStudents = students.toArray(sortedStudents);
       return sortedStudents;
   }
   public Map<Student, String> getGradeBook() {
        Map<Student, String> gradeBook = new TreeMap<>(new StudentComparator());
        for(int i = 0; i < students.size(); i++) {
            gradeBook.put(students.get(i), students.get(i).getAverageGrade());
        }
       return gradeBook;
   }



}
