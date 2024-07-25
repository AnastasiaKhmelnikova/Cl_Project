package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMaxOwnElement() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {10};
        long expected = 10;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    public void findMaxNegativeNumbers() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {-1, -2, -4, -5, -7};
        long expected = -1;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
    @Test
    public void findMaxMixedNumbers() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {-1, 5, -4, 8, -7};
        long expected = 8;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
}
