package com.student;

public class StudentGrade implements GradeService {

    @Override
    public double calculateAverage(double grade1, double grade2) {
        return (grade1 + grade2) / 2;
    }

    @Override
    public boolean isPassed(double grade) {
        return grade >= 60;
    }

    @Override
    public String getGradeLevel(double grade) {

        if (grade >= 90) {
            return "Excellent";
        } else if (grade >= 80) {
            return "Very Good";
        } else if (grade >= 70) {
            return "Good";
        } else if (grade >= 60) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}