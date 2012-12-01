
public class Leite implements Cafe {

	CafeSimples cafeSimples;
	double preco;
	
	public Leite(CafeSimples cafeSimples) {
		this.preco = cafeSimples.preco;
	}

	@Override
	public double getPreco() {
		return this.cafeSimples.getPreco() + 0.5;
	}

	@Override
	public String getIngredientes() {
		return this.cafeSimples.getIngredientes() + ",leite";
	}

}