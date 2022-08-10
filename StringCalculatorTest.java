package StringCalculator;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringCalculatorTest {
	
	StringCalculator calculator = new StringCalculator();

	@Test
	public void emptyStringReturnsZero() throws Exception{
		assertEquals(calculator.calculate(null), 0);
	}
	
	@Test
	public void oneNumberReturnsNumber() throws Exception{
		assertEquals(calculator.calculate("1"), 1);
	}

	@Test
	public void twoNumbersReturnSum() throws Exception{
		assertEquals(calculator.calculate("1,2"), 3);
	}
	
	@Test
	public void changingDelimiter() throws Exception{
		assertEquals(calculator.calculate("//;1;2"), 3);
	}
	
	@Test
	public void multipleNumbersreturnsSum() throws Exception{
		assertEquals(calculator.calculate("1,2,3,4"), 10);
	}
	
	@Test
	public void ignoreNewLineFromString() throws Exception{
		assertEquals(calculator.calculate("1,\n2,3"), 6);
	}
	
	@Test(expected = Exception.class)
	public void negativeNumberThrowsException() throws Exception {
		calculator.calculate("1,-2,3,4");
	}
}
