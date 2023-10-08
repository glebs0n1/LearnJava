package org.example.Conditional;

import java.sql.SQLOutput;

public class AverageValue {
    public static void main(String[] args) {
        double[] arr = {14.63, 31.5, 12.2, 45.19, 89.9, 92.9};
        double average = calculateAverage(arr);

        System.out.println("Average num:" + average);
    }

    public static double calculateAverage(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }
}