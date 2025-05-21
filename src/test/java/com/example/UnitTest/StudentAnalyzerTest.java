package com.example.UnitTest;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class StudentAnalyzerTest {

    StudentAnalyzer analyzer = new StudentAnalyzer();

    // TEST CHO countExcellentStudents() 

    // Trường hợp bình thường: nhiều điểm hợp lệ và không hợp lệ
    @Test
    public void testCountExcellentStudents_Mixed() {
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(2, analyzer.countExcellentStudents(scores));
    }

    // Trường hợp bình thường: toàn bộ điểm hợp lệ
    @Test
    public void testCountExcellentStudents_AllValid() {
        List<Double> scores = Arrays.asList(8.5, 9.2, 6.0, 7.5);
        assertEquals(2, analyzer.countExcellentStudents(scores));
    }

    // Trường hợp biên: danh sách trống
    @Test
    public void testCountExcellentStudents_EmptyList() {
        List<Double> scores = Collections.emptyList();
        assertEquals(0, analyzer.countExcellentStudents(scores));
    }

    // Trường hợp biên: chỉ chứa 0 và 10
    @Test
    public void testCountExcellentStudents_OnlyZeroAndTen() {
        List<Double> scores = Arrays.asList(0.0, 10.0);
        assertEquals(1, analyzer.countExcellentStudents(scores));
    }

    // Trường hợp ngoại lệ: toàn bộ điểm không hợp lệ
    @Test
    public void testCountExcellentStudents_AllInvalid() {
        List<Double> scores = Arrays.asList(-2.0, 11.5, -0.1);
        assertEquals(0, analyzer.countExcellentStudents(scores));
    }

    // TEST CHO calculateValidAverage() 

    // Trường hợp bình thường: nhiều điểm hợp lệ và không hợp lệ
    @Test
    public void testCalculateValidAverage_Mixed() {
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(8.17, analyzer.calculateValidAverage(scores), 0.01);
    }

    // Trường hợp bình thường: toàn bộ điểm hợp lệ
    @Test
    public void testCalculateValidAverage_AllValid() {
        List<Double> scores = Arrays.asList(5.0, 6.0, 7.0);
        assertEquals(6.0, analyzer.calculateValidAverage(scores), 0.01);
    }

    // Trường hợp biên: danh sách trống
    @Test
    public void testCalculateValidAverage_EmptyList() {
        List<Double> scores = Collections.emptyList();
        assertEquals(0.0, analyzer.calculateValidAverage(scores), 0.01);
    }

    // Trường hợp biên: chỉ chứa 0 và 10
    @Test
    public void testCalculateValidAverage_OnlyZeroAndTen() {
        List<Double> scores = Arrays.asList(0.0, 10.0);
        assertEquals(5.0, analyzer.calculateValidAverage(scores), 0.01);
    }

    // Trường hợp ngoại lệ: toàn bộ điểm không hợp lệ
    @Test
    public void testCalculateValidAverage_AllInvalid() {
        List<Double> scores = Arrays.asList(-3.0, 15.0);
        assertEquals(0.0, analyzer.calculateValidAverage(scores), 0.01);
    }
}
