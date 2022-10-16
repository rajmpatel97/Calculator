package CalculationAppTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Operation.CalculationServicesMethods;

public class OperationTest {

	@Test
	public void getAddition() {
		CalculationServicesMethods add = new CalculationServicesMethods();
		Assertions.assertEquals(4, add.addition(2, 2));

	}

	@Test
	public void getSub() {
		CalculationServicesMethods sub = new CalculationServicesMethods();
		Assertions.assertEquals(4, sub.substraction(6, 2));

	}
	
	@Test
	public void getMultiplication() {
		CalculationServicesMethods sub = new CalculationServicesMethods();
		Assertions.assertEquals(12, sub.multiplication(6, 2));

	}
}
