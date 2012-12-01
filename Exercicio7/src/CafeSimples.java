
public class CafeSimples implements Cafe {
	
	double preco = 1;
	public CafeSimples() {
		// TODO Auto-generated constructor stub
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
