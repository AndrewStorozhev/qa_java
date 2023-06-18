package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {
    @Mock
    private Feline feline;
    private Cat cat;

    @Before
    public void setUP() {

        cat = new Cat(feline);
    }

    @Test
    public void positiveTestGetSoundCat() {
        assertEquals("Мяу", cat.getSound());
        System.out.println("Кошка говорит - Мяу.");
    }

    @Test
    public void positiveTestGetFoodCat() throws Exception {
        when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
        System.out.println("Именно так кошки и питаются.");
    }
}
