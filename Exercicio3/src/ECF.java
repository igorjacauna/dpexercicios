
public class ECF {

	static ECF ecf;
	public static ECF getECF() {
		if(ecf == null) ecf = new ECF();
		return ecf;
	}
	
	private ECF(){}
	
}
