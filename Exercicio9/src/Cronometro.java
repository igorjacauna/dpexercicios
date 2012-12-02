

public class Cronometro {
	
	long start;

	public void incia() {
		this.start = System.currentTimeMillis();
	}

	public long finaliza() {
		
		return System.currentTimeMillis() - this.start;
	}

}
