package com.example;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionNegativeTest {

    @Mock
    Feline feline;

    
    @Test
    public void negativeTestDoesHaveManeLion() {
        try {
            Lion lion = new Lion("Другое", feline);

        } catch (Exception exception) {
            Exception exceptions = new Exception("Используйте допустимые значения пола животного - самец или самка");
            assertEquals(exception.toString(), exceptions.toString());
        }
    }

}
