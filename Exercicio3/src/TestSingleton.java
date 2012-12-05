import static org.junit.Assert.*;

import org.junit.Test;


public class TestSingleton {

	@Test
	public void test() {
		ECF ecf1 = ECF.getECF();
		ECF ecf2 = ECF.getECF();
		assertTrue(ecf1 == ecf2);
	}

}
