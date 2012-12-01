import java.util.ArrayList;
import java.util.List;


public class Submenu extends ItemDeMenu{

	String nome;
	List<ItemDeMenu> opcoes = new ArrayList<ItemDeMenu>();
	
	public Submenu(String nome) {
		this.nome=nome;
	}

	public void add(ItemDeMenu opcao) {
		opcoes.add(opcao);
		
	}

	public void disabilite() {
		for(ItemDeMenu m: opcoes){
			m.disponivel=false;
		}
		
	}


}
