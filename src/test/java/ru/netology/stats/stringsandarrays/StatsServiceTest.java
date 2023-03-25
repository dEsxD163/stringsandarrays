package ru.netology.stats.stringsandarrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    // Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    @Test
    void minSalesMoth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    // Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    @Test
    void maxSalesMoth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    // Сумму всех продаж
    @Test
    void sumAllMoth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 180;
        int actual = service.sumAllSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    // Среднюю сумму продаж в месяц
    @Test
    void averageSalesAllMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 15;
        int actual = service.averageSalesPerMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    // Количество месяцев, в которых продажи были ниже среднего
    @Test
    void allMinAverageSalesPerMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = service.MinAverageSalesPerMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    // Количество месяцев, в которых продажи были выше среднего
    @Test
    void allMaxAverageSalesPerMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = service.MaxAverageSalesPerMonth(sales);

        Assertions.assertEquals(expected, actual);
    }
}