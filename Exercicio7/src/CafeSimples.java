public class CafeSimples implements Cafe {

	double preco;

	public CafeSimples() {
		this(1.0);
	}

	public CafeSimples(double preco) {
		this.preco = preco;
	}

	@Override
	public double getPreco() {
		return preco;
	}

	@Override
	public String getIngredientes() {
		return "Cafe";
	}

}
