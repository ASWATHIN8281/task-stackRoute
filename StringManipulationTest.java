package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulationTest {
    StringManipulation stringManipulation;
    @BeforeEach
    void setUp() {
        stringManipulation=new StringManipulation();
    }

    @ParameterizedTest
    @CsvSource(value = {"aswathi,7","aleena,6","India,5"})
    public void GivenStringReturnCharacterCount(String str,int expected){
        assertEquals(expected,stringManipulation.characterCount(str));
    }

    @ParameterizedTest
    @CsvSource(value = {"india,3","Sun,1","mississippi,4","RHYTHMS,0"})
    public void GivenStringsReturnVowelsCount(String input,int expected){
        assertEquals(expected,stringManipulation.vowelCount(input));
    }
}