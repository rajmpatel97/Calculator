package UserInput;

import java.util.Scanner;

public class ScannerInput {
	
	double number1, number2;
	int choice;
	boolean flag;
	Scanner sc = new Scanner(System.in);
	
	public ScannerInput() {
		this.flag = true;
	}
	
	public double getNumber1() {
		return number1;
	}
	public double getNumber2() {
		return number2;
	}
	public int getChoice() {
		return choice;
	}
	public boolean getFlag() {
		return flag;
	}
	
	
	public double setNumber1() {
		this.number1 = sc.nextDouble();
		return number1;
	}
	public double setNumber2() {
		this.number2 = sc.nextDouble();
		return number2;
	}
	public int setChoice() {
		this.choice = sc.nextInt();
		return choice;
	}

	
	

}
