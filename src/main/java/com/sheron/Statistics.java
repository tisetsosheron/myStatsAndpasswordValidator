package com.sheron;

/**
 * Hello world!
 *
 */
public class Statistics
{

    public double mean(double[] numbers){
        double sum = 0.0;
        for(double num : numbers){
            sum += num;
        }
        return sum/numbers.length;
    }

    public double median(double[] numbers){
        double median = 0.0;
        int middle = numbers.length/2;
        if(numbers.length % 2 == 0){
            median = (numbers[middle] + numbers[middle - 1])  / 2.0;
        }
        else {
            median = numbers[middle];
        }
        return median;
    }

    public double variance(double[] numbers) {
        double mean = mean(numbers);
        double temp = 0;
        for (double num : numbers) {
            temp += (num - mean) * (num - mean);
        }
        return temp / numbers.length;
    }

    public double standardDeviation(double[] numbers){
        return (Math.sqrt(variance(numbers)));
    }

}
