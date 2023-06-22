package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParamTest {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    private Feline feline;
    private final String sexLion;
    private final boolean hasManeLion;



    public LionParamTest(String sexLion, boolean hasManeLion) {
        this.sexLion = sexLion;
        this.hasManeLion = hasManeLion;
    }

    @Parameterized.Parameters
    public static Object[][] getLionParam() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void positiveTestDoesHaveManeLion() throws Exception {
        Lion lion = new Lion(this.sexLion, feline);
        boolean expectedResult = hasManeLion;
        boolean actualResult = lion.doesHaveMane();
        assertEquals(expectedResult, actualResult);
    }
}
