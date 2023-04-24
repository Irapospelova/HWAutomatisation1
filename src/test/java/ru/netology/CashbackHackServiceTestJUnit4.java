package ru.netology;

import org.junit.Test;

import java.util.concurrent.Callable;

import static org.junit.Assert.*;

public class CashbackHackServiceTestJUnit4 {
    @Test
    public void shouldShowRemainSumNull() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);

    }
    @Test
    public void shouldCalcSumRemain() {
CashbackHackService service = new CashbackHackService();
int amount;
int actual = 400;
int expected = service.remain(600);
assertEquals(actual, expected);
            }
        };

