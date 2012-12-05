import java.util.SortedMap;
import java.util.TreeMap;

public class DIR {

	static SortedMap<Integer, Calculo> tabelaCalculo = new TreeMap<Integer, Calculo>();
	static Integer padrao;

	public static void addCalculoIR(int ano, Calculo calculo) {
		tabelaCalculo.put(ano, calculo);

		if (padrao == null) {
			padrao = ano;
		}
	}

	int ano;
	double renda;
	int dependentes;

	public DIR(int ano, double renda, int dependentes) {
		this.ano = ano;
		this.renda = renda;
		this.dependentes = dependentes;
	}

	public double calculaIR() {
		if (tabelaCalculo.isEmpty()) {
			throw new IllegalStateException(
					"Voce precisa adicionar um calculo antes de chamar calculaIR()!!!");
		}

		Calculo calc;

		int anoCalculo = 0;

		for (int ano : tabelaCalculo.keySet()) {
			if (ano <= this.ano) {
				anoCalculo = ano;
			}
		}

		if (anoCalculo == 0) {
			anoCalculo = padrao;
		}

		calc = tabelaCalculo.get(anoCalculo);

		return calc.calculaIR(renda, dependentes);
	}

}
