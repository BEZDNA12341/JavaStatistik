package ru.netology.stat;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public int averageAmount(int[] sales) {

        return calculateSum(sales) / sales.length;
    }


    public int maxSales(long[] sales) {
        int maxMonteh = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonteh]) {
                maxMonteh = month;
            }
            month = month + 1;
        }
        return maxMonteh + 1;
    }

    public int willbeMinimumSales (long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {


            if (sale <= sales[minMonth]) {

                minMonth = month;

            }

            month = month + 1;

        }

        return minMonth + 1;
    }

    public int WillbebeLowaverageSales(int[] sales) {
        int averageAmount = 15;
        int month = 0;
        int count = 0;
        for (int sale : sales) {

            if (sale < averageAmount) {
                count++;
            }
            month = month + 1;
        }
        return count;
    }
    public int salesWillBeAbovaeAveraga(int[] sales) {
        int averageAmount = 15;
        int month = 0;
        int count = 0;
        for (int sale : sales) {

            if (sale > averageAmount) {
                count++;
            }
            month = month + 1;
        }
        return count;
    }
}

