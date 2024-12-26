package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainIfAmountLessThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotRemainIfAmountMoreThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}