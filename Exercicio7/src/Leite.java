public class Leite implements Cafe {

	double preco = 0.5;
	Cafe adicional;

	public Leite(Cafe adicional) {
		this.adicional = adicional;
	}

	@Override
	public double getPreco() {
		return adicional.getPreco() + this.preco;
	}

	@Override
	public String getIngredientes() {
		return adicional.getIngredientes() + ",Leite";
	}

}
