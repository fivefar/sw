package sw;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalculatorTest {
	
	Calculator calc;

	@BeforeEach
	void setUp() {
			calc = new Calculator();
	}

	@Test
	void testAddIntInt() {
		assertEquals(10, calc.add(3, 7));
		//fail("Not yet implemented");
	}

	@Test
	void testAddStringString() {
		assertEquals("apple", calc.add("app", "le"));
		//fail("Not yet implemented");
	}

}
