public class Mel implements Cafe {

	double preco = 0.25;
	Cafe adicional;

	public Mel(Cafe adicional) {
		this.adicional = adicional;
	}

	@Override
	public double getPreco() {
		return adicional.getPreco() + this.preco;
	}

	@Override
	public String getIngredientes() {
		return adicional.getIngredientes() + ",Mel";
	}

}
