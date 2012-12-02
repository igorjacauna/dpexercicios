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
	
	@Test
	public void testAbastractFactory(){
		Client clil1 = new Client();
		clil1.setECF(new BematechFactory());
		
		Client clil2 = new Client();
		clil2.setECF(new ElginFactory());
		
		assertEquals("Bematech ECF", clil1.getECFName());
		assertEquals("Bematech.DLL", clil1.getDLLFileName());
		assertEquals("Elgin ECF", clil2.getECFName());
		assertEquals("Elgin.DLL", clil2.getDLLFileName());
		
	}
}
