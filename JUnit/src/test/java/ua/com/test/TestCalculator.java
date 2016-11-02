package ua.com.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ua.com.lesson.Calculator;

public class TestCalculator {
	
	private static Calculator calculator;

	@BeforeClass
	public static void init(){
		calculator = new Calculator();
		
	}
	
	@AfterClass
	public static void destory(){
		calculator = null;
	}
	
	@Test
	public void testAdd(){
		int expected = calculator.add(5, 5);
		int real = 10;
		
		Assert.assertEquals(expected, real);
			
	}
	
	@Ignore
	@Test
	public void testSub(){
		Assert.assertEquals(calculator.substruc(5, 2),  3, 0.1);
	}

	@Test
	public void testMul(){
		Assert.assertEquals(calculator.multiply(5, 4), 20);
	}

	@Test
	public void testDiv(){
		Assert.assertEquals(calculator.devide(20, 4), 5, 0.1);
	}
	
	
	@Before
	public void before(){
		System.out.println("before");
	}
	
	
	
	
	
}
