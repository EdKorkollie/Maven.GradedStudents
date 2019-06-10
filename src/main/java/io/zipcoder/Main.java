package io.zipcoder;

public class Main {
    public static void main(String[] args) {
            Double[] examSores = {98.2, 105.6, 150.3, 95.3, 100.4};

            Student ed = new Student("Edward", "K", examSores);

            Double[] examScores = {};
            ed.getExamScores();
            ed.addExamScore(100.5);
            ed.setExamScore(1, 150.0);
            Double avg = ed.getAverageExamScore();
        System.out.println("Avg: " + avg.toString());
            //String output = ed.getExamScores();
       // System.out.println(output);
        System.out.println("To String Method ");
        System.out.println(ed.toString());
        Double ag = ed.getAverageExamScore();

    }
}
