package Menu;

import Exceptions.ArithmeticExceptionForDivision;
import Operation.CalculationServicesMethods;
import UserInput.ScannerInput;
import ValidationOfInput.InputValidation;

public class ImplemantationOfCases {

	CalculationServicesMethods itteration = new CalculationServicesMethods();
	ScannerInput userInput = new ScannerInput();
	InputValidation validation = new InputValidation();
	
	double secondNumber;
	int menuChoice;
	boolean inputFlag;

	public void menuForAllIteration(boolean setFlag, double firstNumber) {

		while (setFlag){			
			menuChoice = validation.menuValidation();
			
			switch (menuChoice) {
			case 1:
				secondNumber = validation.secondValidation();
				firstNumber = itteration.addition(firstNumber, secondNumber);
				System.out.println("Addition: " + firstNumber + "\n");
				break;

			case 2:
				secondNumber = validation.secondValidation();
				firstNumber = itteration.substraction(firstNumber, secondNumber);
				System.out.println("Substraction: " + firstNumber + "\n");
				break;

			case 3:
				secondNumber = validation.secondValidation();
				firstNumber = itteration.multiplication(firstNumber, secondNumber);
				System.out.println("Multiplication: " + firstNumber + "\n");
				break;

			case 4:
				boolean divisionFlag = true;
				do {
				secondNumber = validation.secondValidation();	
	
				if(secondNumber == 0)
				{
					try {					
						throw new ArithmeticExceptionForDivision("Divide by Zero not applicable");
					}
					catch(ArithmeticExceptionForDivision ex) {
						System.out.println(ex.getMessage());
					}
				}
				else {
					firstNumber = itteration.division(firstNumber, secondNumber);
					System.out.println("Division: " + firstNumber + "\n");
					divisionFlag = false;
				}
				
				}while(divisionFlag);
				break;

			case 5:
				setFlag = false;
				break;

			default:
				System.out.println("Oppsss!!! Please Enter Valid Option from LIST");
				break;
			}
		} 
	}
}