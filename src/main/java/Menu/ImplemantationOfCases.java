package Menu;

import Exceptions.ArithmeticExceptionForDivision;
import Operation.CalculationServicesMethods;
import UserInput.ScannerInput;

public class ImplemantationOfCases {

	CalculationServicesMethods itteration = new CalculationServicesMethods();
	ScannerInput userInput = new ScannerInput();
	double secondNumber;
	int menuChoice;

	public void menuForAllIteration(boolean setFlag, double firstNumber) {

		while (setFlag){
			System.out.println(
					"Menu listed out: \n 1 - Addition \n 2 - Substraction \n 3 - Multiplication \n 4 - Division \n 5 - Exit =>");
			menuChoice = userInput.setChoice();

			
			switch (menuChoice) {
			case 1:
				System.out.println("Enter Number 2 for Addition :: ");
				secondNumber = userInput.setNumber2();
				firstNumber = itteration.addition(firstNumber, secondNumber);
				System.out.println("Addition: " + firstNumber + "\n");
				break;

			case 2:
				System.out.println("Enter Number 2 for Substraction:: ");
				secondNumber = userInput.setNumber2();
				firstNumber = itteration.substraction(firstNumber, secondNumber);
				System.out.println("Substraction: " + firstNumber + "\n");
				break;

			case 3:
				System.out.println("Enter Number 2 for Multiplication :: ");
				secondNumber = userInput.setNumber2();
				firstNumber = itteration.multiplication(firstNumber, secondNumber);
				System.out.println("Multiplication: " + firstNumber + "\n");
				break;

			case 4:
				boolean divisionFlag = true;
				do {
				System.out.println("Enter Number 2 for Division :: ");
				secondNumber = userInput.setNumber2();	
	
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