package com.student;

public class StudentApp {

    private GradeService gradeService = new StudentGrade();

    public double getAverage(double grade1, double grade2) {
        return gradeService.calculateAverage(grade1, grade2);
    }

    public boolean checkPass(double grade) {
        return gradeService.isPassed(grade);
    }

    public String checkLevel(double grade) {
        return gradeService.getGradeLevel(grade);
    }

    public static void main(String[] args) {

        StudentApp app = new StudentApp();

        System.out.println("Average: " + app.getAverage(80, 90));
        System.out.println("Passed: " + app.checkPass(75));
        System.out.println("Level: " + app.checkLevel(95));
    }
}