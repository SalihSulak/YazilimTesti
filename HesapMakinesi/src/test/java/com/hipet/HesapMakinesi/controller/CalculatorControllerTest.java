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
    @Test
    void division() {
    	 double number1 = 6;
         double number2 = 6;
         double realResult = number1/number2;
         when(calculatorService.division(number1,number2)).thenReturn(realResult);
         double result = calculatorController.division(number1,number2);
         assertEquals(1,result);
    	
    }
    @Test
   	void log() {
       	     double number1 = 10;
             double realResult = Math.log10(10);
             when(calculatorService.log(number1)).thenReturn(realResult);
             double result = calculatorController.log(number1);
             assertEquals(1,result);
       	
    	
    }
    @Test
    void square() {
    	double number1 = 6;
        double realResult = number1*number1;
        when(calculatorService.square(number1)).thenReturn(realResult);
        double result = calculatorController.square(number1);
        assertEquals(36,result);
    }
    @Test
    void cub() {
    	double number1= 3;
    	double realResult = number1*number1*number1;
    	when(calculatorService.cub(number1)).thenReturn(realResult);
    	double result = calculatorController.cub(number1);
    	assertEquals(27,result);
    	
    }
    @Test    
    void squareRoot() {
    	double number1= 25;
    	double realResult = Math.sqrt(number1);
    	when(calculatorService.squareRoot(number1)).thenReturn(realResult);
    	double result = calculatorController.squareRoot(number1);
    	assertEquals(5,result);
    }     
}