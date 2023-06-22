package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {

    private Feline feline;

    @Before
    public void setUP() {
        feline = new Feline();
    }

    @Test
    public void positiveTestEatMeatFeline() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void positiveTesGetFamilyFeline() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void positiveTesGetKittensFeline() {
        assertEquals(1, feline.getKittens());
    }
}



