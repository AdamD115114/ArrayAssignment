package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AssignmentTest {
    @Test
    void testFindSecondSmallestItem() {
        assertEquals(2, Assignment.findSecondSmallestItem(new int[]{ 5, 8, 3, 2, 6}));
        assertEquals(-1, Assignment.findSecondSmallestItem(new int[]{ }));
        assertEquals(0, Assignment.findSecondSmallestItem(new int[]{ 1 }));
        assertEquals(0, Assignment.findSecondSmallestItem(new int[]{3, 3, 3, 3, 3, 3}));
        assertEquals(1, Assignment.findSecondSmallestItem(new int[]{ 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5 }));
    }

    @Test
    void testLowestCommonDenominator() {
        assertEquals(3, Assignment.lowestCommonDenominator(new int[]{ 3, 3, 3, 3, 3, 3 }));
        assertEquals(60, Assignment.lowestCommonDenominator(new int[]{ 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5 }));
        assertEquals(420, Assignment.lowestCommonDenominator(new int[]{ 1, 2, 3, 4, 5, 7 }));

    }

    @Test
    void testShowFrequency() {
        String expectedOutput = String.format(
        "1 -%s2 --%s3 ---%s4 ----%s5 -----",
         System.lineSeparator(),
         System.lineSeparator(),
         System.lineSeparator(),
         System.lineSeparator()); 
        assertEquals(expectedOutput, Assignment.showFrequency(new int[]{2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 1, 5}));

        expectedOutput = String.format("2 --%s11 --%s20 --%s44 --",
        System.lineSeparator(),
        System.lineSeparator(),
        System.lineSeparator());
        assertEquals(expectedOutput, Assignment.showFrequency(new int[]{44,44,2,2,11,11,20,20}));

        expectedOutput = "3 ------------";
        assertEquals(expectedOutput, Assignment.showFrequency(new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,}));
    }
}
