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
}