package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionNegativeTest {

    @Test
    public void negativeTestGetKittensLion() throws Exception {
        Lion lion = new Lion("Самка");
        assertEquals("У львов обычно не такое количество львят!", 10, lion.getKittens());
    }

    @Test
    public void negativeTestDoesHaveManeLion() throws Exception {
        Lion lion = new Lion("Другое");
        boolean expectedResult = true;
        boolean actualResult = lion.doesHaveMane();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void negativeTestEatingFoodLion() throws Exception {
        Lion lion = new Lion("Самка");
        assertEquals("Это львы не едят.", List.of("Трава", "Различные растения"), lion.getFood());
    }
}
