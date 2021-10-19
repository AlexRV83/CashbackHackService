package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    public CashbackHackService CashbackHackService = new CashbackHackService();

    @Test
    void shouldCashBackSum900() {
        int actual = CashbackHackService.remain(900);
        int expected = 100;
        assertEquals(actual,expected);

    }
    @Test
    void shouldCashBackSum100() {
        int actual = CashbackHackService.remain(100);
        int expected = 900;
        assertEquals(actual,expected);
    }

    @Test
    void shouldCashBackSum0() {
        int actual = CashbackHackService.remain(1000);// тест не проходит
        int expected = 0;
        assertEquals(actual,expected);
    }
    @Test
    void shouldCashBackSum1100() {
        int actual = CashbackHackService.remain(1100);
        int expected = 900;
        assertEquals(actual,expected);
    }
    @Test
    void shouldCashBackSum5500() {
        int actual = CashbackHackService.remain(5500);
        int expected = 500;
        assertEquals(actual,expected);
    }


}