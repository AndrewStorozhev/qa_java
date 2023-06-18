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

public class CatNegativeTest {
    @Mock
    private Feline feline;
    private Cat cat;

    @Before
    public void setUP() {

        cat = new Cat(feline);
    }

    @Test
    public void negativeTestGetSoundCat() {
        assertEquals("Кошка звучит по другому!", "Гав", cat.getSound());
    }

    @Test
    public void negativeTestGetFoodCat() throws Exception {
        when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals("Кошка ест другое!", List.of("Трава", "Различные растения"), cat.getFood());
    }
}
