public class CalculoIR2009 implements Calculo {

	@Override
	public double calculaIR(double salario, int dependentes) {
		return (salario - (dependentes * 100)) / 3.0;
	}

}
