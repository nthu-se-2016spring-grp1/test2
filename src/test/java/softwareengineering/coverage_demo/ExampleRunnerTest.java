package softwareengineering.coverage_demo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ExampleRunnerTest {
	private ExampleRunner expr;
	
	@Before
	public void setUp(){
		expr = new ExampleRunner();
	}
	
	@After
	public void tearDown(){
		expr = null;
	}
	
	@Test
	public void testRunExample1_01(){
		int a = 0;
		int b = 0;
		int expect = 1;
		int result = expr.runExample1(a, b);
		Assert.assertEquals(expect, result);
	}
	
	@Test
	public void testRunExample1_02(){
		int a = 0;
		int b = 1;
		int expect = 1;
		int result = expr.runExample1(a, b);
		Assert.assertEquals(expect, result);
	}
	
	@Test
	public void testRunExample1_03(){
		int a = 1;
		int b = 0;
		int expect = 3;
		int result = expr.runExample1(a, b);
		Assert.assertEquals(expect, result);
	}
	
}
