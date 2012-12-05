import java.util.ArrayList;
import java.util.List;

public class Algarismo {

	private List<Representacao> observers = new ArrayList<Representacao>();
	private int valor;

	public void addObserver(Representacao rep) {
		observers.add(rep);
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
		for (Representacao obs : observers) {
			obs.update(valor);
		}
	}

}
