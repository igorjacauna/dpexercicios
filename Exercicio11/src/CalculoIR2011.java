
public class CalculoIR2011 implements CalculoIR{

//	int ano;
	double renda;
	double ir;
	int dependentes;
	
	@Override
	public double calculaIR() {
		
		ir=(renda-(dependentes*250))/3.0;
		
		return ir;
	}


}
