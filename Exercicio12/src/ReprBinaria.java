
public class ReprBinaria implements Observer{

	int valor;
	
	@Override
	public String getRepr() {
		switch(valor){
		case 1: return "0001";
		case 2: return "0010";
		case 3: return "0011";
		case 4: return "0100";
		case 5: return "0101";
		case 6: return "0110";
		case 7: return "0111";
		case 8: return "1000";
		case 9: return "1001";
		default: return "0000";
		}
	}

	

}
