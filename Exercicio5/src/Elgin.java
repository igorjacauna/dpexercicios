
public class Elgin {
	
	private boolean aberto=false;
	
	public boolean estaAberto() {
		return this.aberto;
	}

	public void leituraX() {
		aberto = true;
	}

	public void reducaoZ() {
		aberto = false;
	}

}
