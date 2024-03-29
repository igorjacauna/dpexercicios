import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestStrategy {

	@Test
	public void test() {
		DIR.addCalculoIR(2009, new CalculoIR2009());

		DIR ir2009 = new DIR(2009, 3000, 0);
		DIR ir2010 = new DIR(2010, 3000, 1);
		DIR ir2011 = new DIR(2011, 4500, 2);

		assertTrue(ir2009.calculaIR() == 1000.0);
		assertTrue(ir2010.calculaIR() == (3000 - 100) / 3.0);
		assertTrue(ir2011.calculaIR() == (4500 - 200) / 3.0);

		DIR.addCalculoIR(2011, new CalculoIR2011());

		assertTrue(ir2009.calculaIR() == 1000.0);
		assertTrue(ir2010.calculaIR() == (3000 - 100) / 3.0);
		assertTrue(ir2011.calculaIR() == (4500 - 500) / 3.0);

	}

}
