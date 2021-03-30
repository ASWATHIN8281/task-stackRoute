package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {
    Calculate calculate;
    @BeforeEach
    void setUp() {
        calculate=new Calculate();
    }
   @ParameterizedTest
    @ValueSource(ints = {2,4,-6,12,-18})
    public void GivenEvenNumbersReturnTrue(int numbers){
        assertEquals(true,calculate.isEven(numbers));
   }
   @ParameterizedTest
    @ValueSource(ints = {1,7,11,71,-31})
    public void GivenOddNumbersShouldReturnFalse(int numbers){
        assertEquals(false,calculate.isEven(numbers));
   }
   @ParameterizedTest
    @CsvSource(value = {"1,4,5","3,3,6","6,2,8","8,1,9"})
    public void GivenTwoPositiveNumbersReturnSum(int a,int b,int expected){
        assertEquals(expected,calculate.addSum(a,b));
   }
    @ParameterizedTest
    @CsvSource(value = {"1,-4,-3","-3,-3,-6","-6,2,-4","8,-1,7"})
    public void GivenOnePositiveAndOneNegativeReturnSum(int a,int b,int expected){
        assertEquals(expected,calculate.addSum(a,b));
    }

}