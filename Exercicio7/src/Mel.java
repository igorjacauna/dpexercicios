
public class Mel implements Cafe {
	
	CafeSimples cafe;
	Leite leite;
	double preco;

	public Mel(CafeSimples cafeSimples) {
		preco = cafeSimples.preco;
	}

	public Mel(Leite leite) {
		preco = leite.preco;
	}

	@Override
	public double getPreco() {
		return preco + 0.25;
	}

	@Override
	public String getIngredientes() {
		return this.cafe.getIngredientes() + ",mel";
	}

}
