import static org.junit.Assert.*;

import org.junit.Test;


public class testFacade {

	@Test
	public void testCronometro() {
		Cronometro t = new Cronometro();
		t.incia();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		assertTrue(t.finaliza() > 1000);
	}
	
	@Test
	public void testReservaHotel(){
		Hotel h = new Hotel();
		
		assertFalse(h.reservarQuartoNoDia(1));
		assertTrue(h.reservarQuartoNoDia(2));
		assertFalse(h.reservarQuartoNoDia(3));
		
	}
	
	@Test
	public void testReservaVoo(){
		Voo v = new Voo();
		
		assertTrue(v.reservarVooNoDia(1));
		assertTrue(v.reservarVooNoDia(2));
		assertFalse(v.reservarVooNoDia(3));
	}
	
	@Test
	public void testReservaViagem(){
		ViagemFacade v = new ViagemFacade();
		
		assertFalse(v.reservarVooEHotelDia(1));
		assertTrue(v.reservarVooEHotelDia(2));
		assertFalse(v.reservarVooEHotelDia(3));
	}

}
