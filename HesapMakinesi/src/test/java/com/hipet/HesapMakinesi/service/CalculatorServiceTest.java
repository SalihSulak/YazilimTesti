package com.hipet.HesapMakinesi.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CalculatorServiceTest {

    @Mock
    CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    void sum() {
        double number1 = 5;
        double number2 = 7;
        double result = calculatorService.sum(number1,number2);
        assertEquals(12.0,result);
    }

    @Test
    void extraction(){
        double number1=3;
        double number2=6;
        double result=calculatorService.extraction(number1,number2);
        assertEquals(-3,result);

    }

    @Test
    void multiplication(){
        double number1=8;
        double number2=-2;
        double result=calculatorService.multiplication(number1,number2);
        assertEquals(-16,result);
    }

    @Test
    void division(){
        double number1=10;
        double number2=2;
        double result=calculatorService.division(number1,number2);
        assertEquals(5,result);

    }
}