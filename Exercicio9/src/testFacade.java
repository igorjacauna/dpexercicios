import static org.junit.Assert.*;

import org.junit.Test;

public class TestFacade {

	@Test
	public void testCronometro() {
		Cronometro t = new Cronometro();
		t.inicia();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		assertTrue(t.finaliza() >= 1000);
	}

	@Test
	public void testReservaHotel() {
		Hotel h = new Hotel();

		assertFalse(h.reservarHotelNoDia(1));
		assertTrue(h.reservarHotelNoDia(2));
		assertFalse(h.reservarHotelNoDia(3));
	}

	@Test
	public void testReservaVoo() {
		Voo v = new Voo();

		assertTrue(v.reservarVooNoDia(1));
		assertTrue(v.reservarVooNoDia(2));
		assertFalse(v.reservarVooNoDia(3));
	}

	@Test
	public void testReservaViagem() {
		ViagemFacade v = new ViagemFacade();

		assertFalse(v.reservarVooEHotelNoDia(1));
		assertTrue(v.reservarVooEHotelNoDia(2));
		assertFalse(v.reservarVooEHotelNoDia(3));
	}

}
