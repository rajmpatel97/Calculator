package Operation;

import CalculatorServices.DeclarationOfOperations;

public class CalculationServicesMethods extends DeclarationOfOperations{
	
	

	public double addition(double firstNumber, double secondNumber) {

		result = firstNumber + secondNumber;
		return result;
	}

	public double substraction(double firstNumber, double secondNumber) {

		result = firstNumber - secondNumber;
		return result;
	}

	public double multiplication(double firstNumber, double secondNumber) {

		result = firstNumber * secondNumber;
		return result;
	}

	public double division(double firstNumber, double secondNumber) {
		result = firstNumber / secondNumber;
		return result;	
	}

}
