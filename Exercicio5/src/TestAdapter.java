import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdapter {

	@Test
	public void testElgin() {
		Elgin ecf = new Elgin();

		assertEquals(false, ecf.estaAberto());
		ecf.leituraX();
		assertEquals(true, ecf.estaAberto());
		ecf.reducaoZ();
		assertEquals(false, ecf.estaAberto());
	}

	@Test
	public void testBematech() {
		Bematech ecf = new Bematech();

		assertEquals(false, ecf.aberto());
		ecf.leituraX();
		assertEquals(true, ecf.aberto());
		ecf.reducaoZ();
		assertEquals(false, ecf.aberto());
		ecf.abrir();
		assertEquals(true, ecf.aberto());
	}

	@Test
	public void testElginAdapter() {
		ECF ecf = new ElginAdapter(new Elgin());

		assertEquals(false, ecf.isOpen());
		ecf.readX();
		assertEquals(true, ecf.isOpen());
		ecf.reduceZ();
		assertEquals(false, ecf.isOpen());
	}

	@Test
	public void testBematechAdapter() {
		ECF ecf = new BematechAdapter(new Bematech());

		assertEquals(false, ecf.isOpen());
		ecf.readX();
		assertEquals(true, ecf.isOpen());
		ecf.reduceZ();
		assertEquals(false, ecf.isOpen());

	}
}
