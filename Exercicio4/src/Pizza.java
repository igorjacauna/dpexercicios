import java.util.ArrayList;
import java.util.List;


public class Pizza {
	
	public static enum Massa { PAN, TRADICIONAL }
	public static enum Sabor { MUZZARELA, PEPPERONI, CALABRESA }
	
	Massa massa;
	List<Sabor> sabores = new ArrayList<Sabor>();
	
	public Pizza(Builder b){
		this.massa = b.massa;
		this.sabores = b.sabores;
	}
	
	public Pizza(Builder2 b){
		this.massa = b.massa;
		this.sabores = b.sabores;
	}
	
	public Massa getMassa() {
		return this.massa;
	}

	public int getQtdDeSabores() {
		return this.sabores.size();
	}

	public boolean containsSabor(Sabor sabor) {
		return this.sabores.contains(sabor);
	}
	
	//inner class Builder
	
	public static class Builder {
		
		Massa massa;
		List<Sabor> sabores = new ArrayList<Sabor>();

		public Builder(Massa massa){
			this.massa = massa;
		}
		
		public void addSabor(Sabor sabor){
			sabores.add(sabor);
		}
	}
	
	// inner class Builder

	public static class Builder2 {

		Massa massa;
		List<Sabor> sabores = new ArrayList<Sabor>();

		public Builder2(Massa massa) {
			this.massa = massa;
		}

		public Builder2 addSabor(Sabor sabor) {
			sabores.add(sabor);
			return this;
		}
	}

}
