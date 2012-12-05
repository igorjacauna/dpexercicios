public class ViagemFacade {

	public boolean reservarVooEHotelNoDia(int dia) {
		Voo v = new Voo();
		Hotel h = new Hotel();

		return v.reservarVooNoDia(dia) && h.reservarHotelNoDia(dia);
	}

}
