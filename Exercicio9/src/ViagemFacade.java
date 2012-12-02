
public class ViagemFacade {
	
	int diaVoo, diaHotel;
	boolean teste=false;

	public boolean reservarVooEHotelDia(int diaVoo) {
		
		if(diaVoo == this.diaHotel){
			teste=true;
		}
		return true;
	}
	
	public boolean reservarQuartoNoDia(int diaHotel) {
		
		if(this.diaHotel==diaHotel){
			teste=true;
		}
		
		return teste;
	}
	
	public boolean reservarVooNoDia(int diaVoo) {
		
		if(this.diaVoo==diaVoo){
			teste=true;
		}
		
		return teste;
	}


}
