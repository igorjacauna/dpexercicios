
public class Registradora {
	private int total;

	public Registradora(){
		this.total=0;
	}
	
	public void soma(int i) {
		this.total += i;
		
	}

	public void subtrai(int i) {
		this.total -= i;
		
	}

	public int getTotal() {
		return this.total;
	}

	public void reseta() {
		this.total=0;
		
	}
}
