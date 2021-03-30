package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorAppTest {
    CalculatorApp calculatorApp;
    @BeforeEach
    void setUp() {
        calculatorApp=new CalculatorApp();
    }
    @Test
    public void GivenTwoNumbersReturnSumOfNumbers(){
        double result=calculatorApp.sum(2,7);
        assertEquals(9,result);
    }
    @Test
    public void GivenTwoDoubleValuesReturnSum(){
        double result=calculatorApp.sum(1.1,1.2);
        assertEquals(2.3,result);
    }
    @Test
    public void GivenTwoNegativeNumbersReturnSum(){
        double result=calculatorApp.sum(-10,-5);
        assertEquals(-15,result);
    }
    @Test
    public void GivenTwoNumbersReturnSubtractionOfNumbers(){
        double result=calculatorApp.subtract(7,6);
        assertEquals(1,result);
    }
    @Test
    public void GivenTwoDoubleValuesReturnSubtractionOfNumbers(){
        double result=calculatorApp.subtract(1.3,1.2);
        assertEquals(0.10000000000000009,result);
    }
    @Test
    public void GivenTwoFloatValuesReturnSubtractionOfNumbers(){
        double result=calculatorApp.subtract(10.7f,1.2f);
        assertEquals(9.499999761581421,result);
    }
    @Test void GivenTwoNumbersReturnMultipleTwoNumbers(){
        double result=calculatorApp.multiple(3,4);
        assertEquals(12,result);
    }
    @Test
    void GivenTwoDoubleNumbersReturnMultipleTwoNumbers(){
        double result=calculatorApp.multiple(3.1,4);
        assertEquals(12.4,result);
    }
    @Test
    void GivenOneNegativeAndOnePositiveReturnMultipleTwoNumbers(){
        double result=calculatorApp.multiple(-4,4);
        assertEquals(-16,result);
    }
    @Test
    void GivenTwoFloatNumbersReturnMultipleTwoNumbers(){
        double result=calculatorApp.multiple(2.2f,4.6f);
        assertEquals(10.120000009536739,result);
    }
    @Test
    public void GivenTwoNumbersReturnDivisionOfNumbers(){
        double result=calculatorApp.division(6,2);
        assertEquals(3,result);
    }
    @Test
    public void GivenOneValueAndZeroReturnSameValueAfterSum(){
        double result=calculatorApp.sum(6,0);
        assertEquals(6,result);
    }
    @Test
    public void GivenOnePositiveAndOneNegativeReturnSubtract(){
        double result=calculatorApp.subtract(6,-1);
        assertEquals(7,result);
    }
    @Test
    public void GivenTwoNegativeReturnSum(){
        double result=calculatorApp.sum(-1,-1);
        assertEquals(-2,result);
    }
    @Test
    public void GivenTwoDoubleNumbersReturnDivisionOfNumbers(){
        double result=calculatorApp.division(6.6,2);
        assertEquals(3.3,result);
    }
    @Test
    public void GivenDivisorZeroShouldReturnException(){
        assertThrows(IllegalArgumentException.class,()->{
            calculatorApp.division(2,0);
        });

    }
}