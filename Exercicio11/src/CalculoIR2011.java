public class CalculoIR2011 implements Calculo {

	@Override
	public double calculaIR(double salario, int dependentes) {
		return (salario - (dependentes * 250)) / 3.0;
	}

}
