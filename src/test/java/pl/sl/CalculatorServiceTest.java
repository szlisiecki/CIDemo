package pl.sl;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

	private static CalculatorService calculatorService;
	
	@BeforeAll
	public static void init() {
		calculatorService = new CalculatorService();
	}
	
	@Test
	void should_return_5_when_adding_2_to_3() {
		// given 
		int a = 2;
		int b = 3;
		
		// when
		int add = calculatorService.add(a, b);
		
		// then
		Assert.assertEquals(5, add);
	}
	
	@Test
	void should_return_10_when_adding_4_to_6() {
		// given 
		int a = 4;
		int b = 6;
		
		// when
		int add = calculatorService.add(a, b);
		
		// then
		Assert.assertEquals(10, add);
	}
	
//	@Test
//	void should_throw_exception() {
//		// given 
//		int a = 4;
//		int b = 6;
//		
//		// when
//		int add = calculatorService.add(a, b);
//		
//		// then
//		Assert.assertEquals(11, add);//
//	}
}
