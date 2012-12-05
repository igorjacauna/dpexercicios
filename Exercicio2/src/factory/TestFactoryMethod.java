package factory;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFactoryMethod {
	
	@Test
	public void testBematech(){
		ECF ecf = ECFCreator.getECF("Bematech");
		assertEquals(Bematech.class, ecf.getClass());
	}

	@Test
	public void testElgin(){
		ECF ecf = ECFCreator.getECF("Elgin");
		assertEquals(Elgin.class, ecf.getClass());
	}
	
}
