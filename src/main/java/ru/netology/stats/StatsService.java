package ru.netology.stats;

public class StatsService {

    public int calcSumOfSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public double calcAverageInMonth(int[] sales) {
        double sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        double average = sum / sales.length;
        return average;
    }

    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int calcAmountMonthsBelowAverage(int[] sales) {
        int counter = 0;
        double average = calcAverageInMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                counter ++;
            }
        }
        return counter;
    }

    public int calcAmountMonthsAboveAverage(int[] sales) {
        int counter = 0;
        double average = calcAverageInMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                counter ++;
            }
        }
        return counter;
    }
}
