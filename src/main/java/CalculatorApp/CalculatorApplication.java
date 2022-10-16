package CalculatorApp;

import java.util.InputMismatchException;
import java.util.Scanner;

import Menu.ImplemantationOfCases;
import UserInput.ScannerInput;
import ValidationOfInput.InputValidation;

public class CalculatorApplication {

	public static void main(String[] args) {

		ScannerInput userInput = new ScannerInput();
		ImplemantationOfCases menu = new ImplemantationOfCases();
		InputValidation validation = new InputValidation();
		boolean inputFlag;

		System.out.println("Welcome to Calculator");

		double firstNumber = validation.firstnumberValidation();
		
//		do {
//			System.out.println("Enter Number 1 :: ");
//			if (userInput.getSc().hasNextDouble()) {
//				userInput.setNumber1();
//				inputFlag = true;
//			} else {
//				System.out.println("Invalid Input!!!");
//				inputFlag = false;
//				userInput.getSc().next();
//			}
//		} while (!inputFlag);

		menu.menuForAllIteration(userInput.getFlag(), firstNumber);
	}
}
