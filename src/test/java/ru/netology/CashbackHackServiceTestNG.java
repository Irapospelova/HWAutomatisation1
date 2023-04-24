package ru.netology;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.Assert.*;

public class CashbackHackServiceTestNG {
    @Test
    public void shouldCalcSumRemain() {
        CashbackHackService service = new CashbackHackService(); {

int amount;

int actual = service.remain(200);
int expected = 800;
assertEquals(actual, expected);


        };

    }
    @Test
    public void shouldShowRemainSumNull() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);


    }
}