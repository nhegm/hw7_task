package ru.netology.services;

public class StatsService {

    public int sumSales(long[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        return sum;
    }

    public int avrgSumSales(long[] sales) {

        return sumSales(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int monthsUnderAvrgSales(long[] sales) {

        int monthsUnderAvrg = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avrgSumSales(sales)) {
                monthsUnderAvrg++;
            }
        }

        return monthsUnderAvrg;
    }

    public int monthsAboveAvrgSales(long[] sales) {

        int monthsAboveAvrg = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avrgSumSales(sales)) {
                monthsAboveAvrg++;
            }
        }

        return monthsAboveAvrg;
    }
}
