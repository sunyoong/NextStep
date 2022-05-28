package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
//	// main을 이용한 방법 
//	public static void main(String[] args) {
//		Calculator cal = new Calculator();
//	System.out.println(cal.add(4, 50)); // 결과 54
//	System.out.println(cal.substract(3, 2)); // 결과 1
//	System.out.println(cal.divide(6, 3)); // 결과 2
//	System.out.println(cal.multiple(2, 3)); // 결과 6
//	}
//
	
	private Calculator cal;
	
	@BeforeEach
	public void setup() {
		cal = new Calculator();
		
	}
	
	
	@Test
	public void addTest() {
		assertEquals(2, cal.add(2, 0) );
	}
	
	
	@Test
	public void substractTest() {
		assertEquals(3, cal.substract(3, 1));
	}
	
}
