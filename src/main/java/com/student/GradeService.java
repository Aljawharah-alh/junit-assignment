package com.student;

public interface GradeService {

    double calculateAverage(double grade1, double grade2);

    boolean isPassed(double grade);

    String getGradeLevel(double grade);
}