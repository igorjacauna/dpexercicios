import java.util.ArrayList;
import java.util.List;

public class Voo {

	List<Integer> diasDisponiveis;

	public Voo() {
		diasDisponiveis = new ArrayList<Integer>();
		diasDisponiveis.add(2);
		diasDisponiveis.add(1);
	}

	public boolean reservarVooNoDia(int dia) {
		return diasDisponiveis.contains(dia);
	}

}
