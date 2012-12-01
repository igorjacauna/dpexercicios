import static org.junit.Assert.*;

import org.junit.Test;


public class testDecorator {

	@Test
	public void testCafeSimples() {
		Cafe c = new CafeSimples();
		assertTrue(c.getPreco() == 1.0);
		assertEquals("Cafe", c.getIngredientes());
	}
	
	@Test
	public void testCafeComLeite(){
		Cafe c = new Leite(new CafeSimples());
		assertTrue(c.getPreco() == 1.5);
		assertEquals("Cafe,leite", c.getIngredientes());
	}
	
	@Test
	public void testCafeComMel(){
		Cafe c = new Mel(new CafeSimples(1.5));
		assertTrue(c.getPreco() == 1.5);
		assertEquals("Cafe,mel", c.getIngredientes());
	}
	
	@Test
	public void testVariosCafes(){
		Cafe c = new Mel(new Leite(new CafeSimples(1.5)));
		assertTrue(c.getPreco() == 2.25);
		assertEquals("Cafe,leite,mel", c.getIngredientes());
	}

}