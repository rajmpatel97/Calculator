package ValidationOfInput;

import UserInput.ScannerInput;

public class InputValidation {

	ScannerInput userInput = new ScannerInput();
	boolean inputFlag;

	public double firstnumberValidation() {

		do {
			System.out.println("Enter Number 1 :: ");
			if (userInput.getSc().hasNextDouble()) {
				inputFlag = true;
				return userInput.setNumber1();
			} else {
				System.out.println("Invalid Input!!!");
				inputFlag = false;
				userInput.getSc().next();
			}
		} while (!inputFlag);
		return 0;
	}

	public double secondValidation() {

		do {
			System.out.println("Enter Number 2 :: ");
			if (userInput.getSc().hasNextDouble()) {
				inputFlag = true;
				return userInput.setNumber2();
			} else {
				System.out.println("Invalid Input!!!");
				inputFlag = false;
				userInput.getSc().next();
			}
		} while (!inputFlag);
		return 0;
	}
	
	public int menuValidation() {

		do {
			System.out.println(
					"Menu listed out: \n 1 - Addition \n 2 - Substraction \n 3 - Multiplication \n 4 - Division \n 5 - Exit =>");
			if (userInput.getSc().hasNextInt()) {
				inputFlag = true;
				return userInput.setChoice();
			} else {
				System.out.println("Invalid Input!!!");
				inputFlag = false;
				userInput.getSc().next();
			}
		} while (!inputFlag);
		return 0;
	}
}
