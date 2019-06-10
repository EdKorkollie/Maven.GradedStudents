package io.zipcoder;
import java.util.ArrayList;
import java.util.Arrays;


public class Student {

    private String firstName;
    private String lastName;
    //private Integer totalExamTaken;
     ArrayList<Double> examScores; //= new ArrayList<Double>();
    public Student(){
        firstName = "";
        lastName = "";
        examScores = new ArrayList<>();
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName) {
        this.firstName = firstName;
    }

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
       // this.examScores = new ArrayList<>(Arrays.asList(examScores));
       // ArrayList<Double> arrayList =
        if(examScores != null) {
            this.examScores = new ArrayList<>(Arrays.asList(examScores));
        }else {
            this.examScores = new ArrayList<>();
        }



    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public Double[] getExamScores(){
        Double[] examScoresAsArray = new Double[examScores.size()];
        return examScores.toArray(examScoresAsArray);
    }

    public Student(ArrayList<Double> examScores) {
        this.examScores = examScores;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setExamScores(Double[] examScores)
    {
        this.examScores = new ArrayList<>(Arrays.asList(examScores));
    }
    public Integer getNumberOfExamsTaken()
    {
        return examScores.size();
    }

    public Double getSumOfAllExamScores(){
        Double sumOfExamScores = 0.0;
        for(int i = 0; i < examScores.size(); i++){
            sumOfExamScores += examScores.get(i);
        }
        return sumOfExamScores;
    }

//        StringBuilder str = new StringBuilder();
//        int count =1;
//        for(int i = 0; i <this.examScores.size(); i++)
//        {
//
//
//            //System.out.println("Exam " + count++ + "->" + this.examScores.get(i).intValue());
//           str.append("Exam " + count++ + "->" + this.examScores.get(i).intValue() + "\n");
//        }
//        return str.toString();
    public String getExamScoresString(){
        String examAsString = "";
        if(examScores.size() != 0) {
            examAsString = "Exam Scores:\n";
            for(int i = 0; i < examScores.size(); i++) {
                examAsString += String.format("\tExam %d -> %.2f\n" + i + 1 + examScores.get(i));
            }
        }
        return examAsString.trim();
    }

    public void addExamScore(double examScores) {

        this.examScores.add(examScores);
    }
   public void setExamScore(int examNumber, double newScore) {

       this.examScores.set(examNumber -1, newScore);
   }
   public Double getAverageExamScore() {

      Double avg = getSumOfAllExamScores()/examScores.size();
      avg = Math.round(avg * 100)/100.0d;

       return avg;
   }

    public boolean isGradeA(Double examScore) {
        return examScore >=0.9;
    }
    public boolean isGradeB(Double examScore ) {
        return examScore < 0.9 && examScore > 0.7;
    }
    public boolean isGradeC(Double examScore) {
        return examScore<= 0.7 && examScore >= 0.5;
    }
    public boolean isGradeD(Double examScore) {
        return examScore < 0.5 && examScore> 0.1;
    }
    public boolean isGradeF(Double examScore){
        return examScore <= 0.1;
    }
    public String getAverageGrade() {

        Double examScore = getAverageExamScore();
        if(isGradeA(examScore)) {
            return "A";
        }
        else if(isGradeB(examScore)) {
            return "B";
        }
        else if(isGradeC(examScore)) {
            return "C";

        }
        else if(isGradeD(examScore)) {
            return "D";
        }
        else if(isGradeF(examScore)) {
            return "F";
        }
        else {
            return "Grade is not available";
        }
    }















}
