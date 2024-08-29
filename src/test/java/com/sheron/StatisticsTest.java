package com.sheron;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class StatisticsTest
{
    Statistics stats = new Statistics();
    double[] evenNumbers = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
    double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0,};

    @Test
    public void testMean(){
        assertEquals(5, stats.mean(numbers), 0.01);
        assertEquals(5.5, stats.median(evenNumbers), 0.01);
    }

    @Test
    public void testMedian(){
        assertEquals(5, stats.median(numbers), 0.1);
        assertEquals(5.5, stats.median(evenNumbers), 5);
    }

    @Test
    public void testVariance() {
        assertEquals(6.666666666666667, stats.variance(numbers), 0.01);
        assertEquals(8.25, stats.variance(evenNumbers), 5);
    }

    @Test
    public void testStandardDeviation() {

        assertEquals(Math.sqrt(6.666666666666667), stats.standardDeviation(numbers), 0.01);
        assertEquals(Math.sqrt(8.25), stats.standardDeviation(evenNumbers), 5);
    }
}
