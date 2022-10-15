package CalculatorApp;

import java.util.InputMismatchException;

import Menu.ImplemantationOfCases;
import UserInput.ScannerInput;

public class CalculatorApplication {

	public static void main(String[] args) {

		ScannerInput userInput = new ScannerInput();
		ImplemantationOfCases menu = new ImplemantationOfCases();
		boolean inputFlag = false;

		System.out.println("Welcome to Calculator");

		try {
			System.out.println("Enter Number 1 :: ");
			userInput.setNumber1();
		} catch (InputMismatchException ex) {
			System.out.println("Invalid Input !!!!!!!!");
			inputFlag = true;
		}

		menu.menuForAllIteration(userInput.getFlag(), userInput.getNumber1());

	}
}
