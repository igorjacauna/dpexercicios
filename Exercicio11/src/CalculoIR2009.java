
public class CalculoIR2009 implements CalculoIR{

//	int ano;
	double renda;
	double ir;
	int dependentes;
	
	@Override
	public double calculaIR() {
		
		ir=(renda-(dependentes*100))/3.0;
		
		return ir;
	}


}
