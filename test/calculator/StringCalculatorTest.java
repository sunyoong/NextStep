package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

	private StringCalculator cal;
	
	@BeforeEach
	public void setup() {
		cal = new StringCalculator();
	}
	
	@Test
	public void addTest() {
	assertEquals(0, cal.add("1"));
	} // 결과 test fail
	
	
	@Test
	public void addTest1() {
		assertEquals(1, cal.add("1")); 
				}
}
