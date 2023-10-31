package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shoudCalculateBuyInAdditionifequal() {
        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(500);

        assertEquals(expected, actual);
    }
    @Test
    public void shoudCalculateBuyInAdditioniflessby1() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);

        assertEquals(expected, actual);
    }
    @Test
    public void shoudCalculateBuyInAdditioniflessby2() {
        CashbackHackService service = new CashbackHackService();

        int expected = 2;
        int actual = service.remain(998);

        assertEquals(expected, actual);
    }
    @Test
    public void shoudCalculateBuyInAdditionifequalboundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }
    @Test
    public void shoudCalculateBuyInAdditionifmoreby1() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);

        assertEquals(expected, actual);
    }
    @Test
    public void shoudCalculateBuyInAdditionifmoreby2() {
        CashbackHackService service = new CashbackHackService();

        int expected = 998;
        int actual = service.remain(1002);

        assertEquals(expected, actual);
    }
    @Test
    public void shoudCalculateBuyInAdditionifamount0() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(expected, actual);
    }
}
