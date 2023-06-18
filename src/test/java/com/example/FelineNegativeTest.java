package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineNegativeTest {
    @Mock
    private Feline feline;

    @Before
    public void setUP() {
        feline = new Feline();
    }

    @Test
    public void negativeTestEatMeatFeline() throws Exception {
        assertEquals("Семейство кошачьих питается не этим!", List.of("Трава", "Различные растения"), feline.eatMeat());

    }

    @Test
    public void negativeTesGetFamilyFeline() {
        assertEquals("Нет это не семейство кошачьих!", "Заичьих", feline.getFamily());

    }

    @Test
    public void negativeTesGetKittensFeline() {
        assertEquals("У семейства кошачьих обычно другое количество потомков!", 10, feline.getKittens());

    }
}



