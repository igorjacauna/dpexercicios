import java.util.ArrayList;
import java.util.List;


public class DIR {
	
	private static List<CalculoIR> calculos = new ArrayList<CalculoIR>();
	//SortedMap<Intenger,CalculoIR>
	
	public DIR(int ano, int salario, int dependente) {
		// TODO Auto-generated constructor stub
	}

	public static void addCalculaIR(int i, CalculoIR dir) {
		calculos.add(dir);
	}

	public double calculaIR() {
		for(CalculoIR cal: calculos){
			
			
		}
		return 0;
	}

}
