package ru.netology.stats.stringsandarrays;

public class StatsService {
    // Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    // Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int maxSales(long[] sales) {
        int maxMonth = 0; //

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1; //
    }

    // Сумму всех продаж
    public int sumAllSales(long[] sales) {
        int sumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSale = (int) (sumSale + sales[i]);
        }
        return sumSale;
    }

    // Среднюю сумму продаж в месяц
    public int averageSalesPerMonth(long[] sales) {
        int averageSales = 0;
        for (int i = 0; i < sales.length; i++) {
            averageSales = (int) (averageSales + sales[i]);
        }
        int averageSalesMonth;
        averageSalesMonth = averageSales / sales.length;
        return averageSalesMonth;
    }

    // Количество месяцев, в которых продажи были ниже среднего
    public int MinAverageSalesPerMonth(long[] sales) {
        int averageSum = averageSalesPerMonth(sales);
        int quantityMinMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum) {
                quantityMinMonth++;
            }
        }
        return quantityMinMonth;
    }

    // Количество месяцев, в которых продажи были выше среднего
    public int MaxAverageSalesPerMonth(long[] sales) {
        int min = averageSalesPerMonth(sales);
        int quantityMinMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > min) {
                quantityMinMonth++;
            }
        }
        return quantityMinMonth;
    }
}
