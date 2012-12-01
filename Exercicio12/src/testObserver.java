import static org.junit.Assert.*;

import org.junit.Test;


public class testObserver {

	@Test
	public void test() {
		Algarismo a = new Algarismo();
		
		ReprBinaria rb = new ReprBinaria();
		a.addObserver(rb);
		
		a.setValor(3); assertEquals("0011", rb.getRepr());
		a.setValor(5); assertEquals("0101", rb.getRepr());
		
		ReprRomana rm = new ReprRomana();
		a.addObserver(rm);
		
		a.setValor(7);
		assertEquals("VII", rm.getRepr());
		assertEquals("0111", rb.getRepr());
		
		a.setValor(9);
		assertEquals("IX", rm.getRepr());
		assertEquals("1001", rb.getRepr());
	}

}
