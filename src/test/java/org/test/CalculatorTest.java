package org.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.test.Calculator;
import static org.testng.Assert.*;

public class CalculatorTest {

	private Calculator calc = new Calculator();

	@DataProvider
	public Object[][] summLocalData() {
		return new Object[][] { { 5, calc.summ(2, 3) }, { 0, calc.summ(0, 0) },
				{ 0, calc.summ(-2, 2) }, { -100, calc.summ(-30, -70) },
				{ 10000, calc.summ(3000, 7000) }, { 2, calc.summ(1, 1) },
				{ 9, calc.summ(8, 1) } };
	}

	@Test(dataProvider = "summLocalData")
	public void sum(int rezult, int sumDigit) {
		assertEquals(rezult, sumDigit);
	}

	@DataProvider
	public Object[][] minusLocalData() {
		return new Object[][] { { -1, calc.minus(2, 3) },
				{ 0, calc.minus(0, 0) }, { -4, calc.minus(-2, 2) },
				{ 40, calc.minus(-30, -70) },
				{ -4000, calc.minus(3000, 7000) }, { 0, calc.minus(1, 1) },
				{ 7, calc.minus(8, 1) } };
	}

	@Test(dataProvider = "minusLocalData")
	public void minus(int rezult, int sumDigit) {
		assertEquals(rezult, sumDigit);
	}

}