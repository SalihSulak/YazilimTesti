package com.hipet.HesapMakinesi.controller;

import com.hipet.HesapMakinesi.service.CalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CalculatorControllerTest {

    CalculatorController calculatorController;

    @Mock
    CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        calculatorController = new CalculatorController(calculatorService);
    }

    @Test
    void sum() {
        double number1=9;
        double number2=3;
        double realResult = number1+number2;
        when(calculatorService.sum(number1,number2)).thenReturn(realResult);
        double result= calculatorController.sum(number1,number2);
        assertEquals(12.0,result);
    }

    @Test
    void extraction() {
        double number1=9;
        double number2=3;
        double realResult = number1-number2;
        when(calculatorService.extraction(number1,number2)).thenReturn(realResult);
        double result= calculatorController.extraction(number1,number2);
        assertEquals(6.0,result);
    }

    @Test
    void multiplication() {
        double number1 = 6;
        double number2 = 6;
        double realResult = number1*number2;
        when(calculatorService.multiplication(number1,number2)).thenReturn(realResult);
        double result = calculatorController.multiplication(number1,number2);
        assertEquals(36,result);
    }
}