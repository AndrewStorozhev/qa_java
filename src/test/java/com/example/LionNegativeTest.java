package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionNegativeTest {
    @Mock
    Feline feline;

    @Test
    public void negativeTestDoesHaveManeLion() throws Exception {
        try {
            Lion lion = new Lion("Другое", feline);
            boolean expectedResult = true;
            boolean actualResult = lion.doesHaveMane();
            assertEquals(expectedResult, actualResult);
        } catch (Exception exception) {
            System.out.println("Используйте допустимые значения пола животного - самец или самка");
        }
    }

}
