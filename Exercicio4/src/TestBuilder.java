import static org.junit.Assert.*;

import org.junit.Test;


public class TestBuilder {

	@Test
	public void test() {
		Pizza.Builder pb = new Pizza.Builder(Pizza.Massa.PAN);
		pb.addSabor(Pizza.Sabor.MUZZARELA);
		Pizza p = new Pizza(pb);
		
		assertEquals(Pizza.Massa.PAN, p.getMassa());
		assertEquals(1, p.getQtdDeSabores());
		assertTrue(p.containsSabor(Pizza.Sabor.MUZZARELA));
		assertFalse(p.containsSabor(Pizza.Sabor.PEPPERONI));
		assertFalse(p.containsSabor(Pizza.Sabor.CALABRESA));
		
	}
	
	@Test
	public void testPizzaComplexa(){
		Pizza.Builder pb = new Pizza.Builder(Pizza.Massa.PAN);
		pb.addSabor(Pizza.Sabor.MUZZARELA);
		pb.addSabor(Pizza.Sabor.PEPPERONI);
		Pizza p = new Pizza(pb);
		
		assertEquals(Pizza.Massa.PAN, p.getMassa());
		assertEquals(2, p.getQtdDeSabores());
		assertTrue(p.containsSabor(Pizza.Sabor.MUZZARELA));
		assertTrue(p.containsSabor(Pizza.Sabor.PEPPERONI));
		assertFalse(p.containsSabor(Pizza.Sabor.CALABRESA));
	}
	
	@Test
	public void testPizzaBuilder(){
		Pizza p = new Pizza(
				new Pizza.Builder2(Pizza.Massa.TRADICIONAL)
				.addSabor(Pizza.Sabor.CALABRESA)
				.addSabor(Pizza.Sabor.PEPPERONI)
				);
		
		assertEquals(Pizza.Massa.TRADICIONAL, p.getMassa());
		assertEquals(2, p.getQtdDeSabores());
		assertFalse(p.containsSabor(Pizza.Sabor.MUZZARELA));
		assertTrue(p.containsSabor(Pizza.Sabor.PEPPERONI));
		assertTrue(p.containsSabor(Pizza.Sabor.CALABRESA));
	}

}
