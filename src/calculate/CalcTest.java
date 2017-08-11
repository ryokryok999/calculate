package calculate;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void testAdd() {
		Calc calc = new Calc();
		assertEquals(3, calc.add(1,2));
	}
	@Test
	public void testSub() {
		Calc calc = new Calc();
		assertEquals(1, calc.sub(2,1));
		assertEquals(3, calc.sub(10,7));
	}
	@Test
	public void testMul() {
		Calc calc = new Calc();
		assertEquals(2, calc.mul(2,1));
	}
	@Test
	public void testDiv() {
		Calc calc = new Calc();
		assertEquals(50, calc.div(100,2));
	}
	@Test(expected = ArithmeticException.class)
	public void testDivArithmeticException() throws Exception {
		Calc calc = new Calc();
		assertEquals(10,calc.div(1, 0));
	}
}
