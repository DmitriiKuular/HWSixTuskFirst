package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StatsServiceTest {

    @Test
//    @CsvSource(value = "'expected result, stats of sales',180,{8,15,13,15,17,20,19,20,7,14,14,18}")

    void shouldCalcSumOfSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calcSumOfSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    void shouldCalcAverageSalesInMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;
        double actual = service.calcAverageInMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.getMaxMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.getMinMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    void shouldCalcAmountMonthsBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calcAmountMonthsBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    void shouldCalcAmountMonthsAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calcAmountMonthsAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
