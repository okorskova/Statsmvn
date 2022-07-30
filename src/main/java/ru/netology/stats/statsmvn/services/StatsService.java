package ru.netology.stats.statsmvn.services;

public class StatsService {

    public int summSales(long[] sales) {
        int summMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            summMonth = (int) (summMonth + sales[i]);
        }
        return summMonth;
    }

    public int averageSales(long[] sales) {
        int averSale = summSales(sales) / 12;
        return averSale;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int countLessAverSales(long[] sales) {
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (i < averageSales(sales)) {
                count++;
            }
        }
        return count;
    }
}

