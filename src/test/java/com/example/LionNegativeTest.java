package com.example;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionNegativeTest {

    @Mock
    Feline feline;



        @Test
        public void negativeTestDoesHaveManeLion() {
            String exceptionMessage = "Используйте допустимые значения пола животного - самец или самка";
            Exception exception = assertThrows(Exception.class, () -> new Lion("Другое", feline));
            assertEquals(exceptionMessage, exception.getMessage());
        }


}


