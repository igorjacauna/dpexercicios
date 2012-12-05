import java.util.ArrayList;
import java.util.List;

public class Hotel {

	List<Integer> diasDisponiveis;

	public Hotel() {
		diasDisponiveis = new ArrayList<Integer>();
		diasDisponiveis.add(2);
	}

	public boolean reservarHotelNoDia(int dia) {
		return diasDisponiveis.contains(dia);
	}

}
