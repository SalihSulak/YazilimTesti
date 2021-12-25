package com.hipet.HesapMakinesi.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void log(){
        double number1 = 100;
        double result = calculatorService.log((number1));
        assertEquals(2,result);
    }

    @Test
    void square() {
        double number1=3;
        double result=calculatorService.square((number1));
        assertEquals(9,result);
    }

    @Test
    void cub() {
        double number1=2;
        double result=calculatorService.cub((number1));
        assertEquals(8,result);
    }

    @Test
    void squareRoot() {
        double number1=9;
        double result=calculatorService.squareRoot((number1));
        assertEquals(3,result);
    }


}
