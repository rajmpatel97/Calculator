package CalculatorApp;

import Menu.ImplemantationOfCases;
import UserInput.ScannerInput;
import ValidationOfInput.InputValidation;

public class CalculatorApplication {

	public static void main(String[] args) {

		ScannerInput userInput = new ScannerInput();
		ImplemantationOfCases menu = new ImplemantationOfCases();
		InputValidation validation = new InputValidation();
		System.out.println("Welcome to Calculator");

		double firstNumber = validation.firstnumberValidation();

		menu.menuForAllIteration(userInput.getFlag(), firstNumber);
	}
}
