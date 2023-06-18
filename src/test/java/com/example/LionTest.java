package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    private Lion lion;

    @Before
    public void setUP() throws Exception {
        lion = new Lion("Самец");
    }

    @Test
    public void positiveTestGetKittensLion() throws Exception {
        assertEquals(1, lion.getKittens());
        System.out.println("У львов обычно такое количество львят.");
    }

    @Test
    public void positiveTestEatingFoodLion() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
        System.out.println("Именно это львы едят.");
    }
}
