package com.hipet.HesapMakinesi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hipet.HesapMakinesi.service.CalculatorService;

@RestController
@RequestMapping("/api")
public class CalculatorController {

	private final CalculatorService calculatorService;


	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}


	@GetMapping("/sum")
	public double sum(@RequestParam("number1") double number1, @RequestParam("number2") double number2) {
		return calculatorService.sum(number1, number2);
	}
	
	@GetMapping("/extraction")
	public double extraction(@RequestParam("number1") double number1, @RequestParam("number2") double number2) {
		return calculatorService.extraction(number1, number2);
	}
	
	@GetMapping("/multiplication")
	public double multiplication(@RequestParam("number1") double number1, @RequestParam("number2") double number2) {
		return calculatorService.multiplication(number1, number2);
	}
	@GetMapping("/division")
	public double division(@RequestParam("number1") double number1, @RequestParam("number2") double number2) {
		return calculatorService.division(number1,number2);
	}
	@GetMapping("/log")
	public double log(@RequestParam("number1") double number1) {
		return calculatorService.log(number1);
	}
	
	@GetMapping("/square")
	public double square(@RequestParam("number1") double number1) {
		return calculatorService.square(number1);
	}
	@GetMapping("/cub")
	public double cub(@RequestParam("number1") double number1) {
		return calculatorService.cub(number1);
	}
	
	@GetMapping("/squareRoot")
	public double squareRoot(@RequestParam("number1") double number1) {
		return calculatorService.squareRoot(number1);
	}
}
