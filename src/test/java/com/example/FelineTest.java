package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    private Feline feline;

    @Before
    public void setUP() {
        feline = new Feline();
    }

    @Test
    public void positiveTestEatMeatFeline() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
        System.out.println("Семейство кошачьих питается этим.");
    }

    @Test
    public void positiveTesGetFamilyFeline() {
        assertEquals("Кошачьи", feline.getFamily());
        System.out.println("Да это семейство кошачьих.");
    }

    @Test
    public void positiveTesGetKittensFeline() {
        assertEquals(1, feline.getKittens());
        System.out.println("У семейства кошачьих обычно такое количество потомков.");
    }
}



