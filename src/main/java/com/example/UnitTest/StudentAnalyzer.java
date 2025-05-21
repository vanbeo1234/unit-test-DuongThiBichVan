package com.example.UnitTest;

import java.util.List;

public class StudentAnalyzer {
    public int countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty())
            return 0;

        int count = 0;
        for (Double score : scores) {
            if (score >= 8.0 && score <= 10.0) {
                count++;
            }
        }
        return count;
    }
}
