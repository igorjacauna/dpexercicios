
public class RegistradoraCommandReseta implements RegistradoraCommand {

	private Registradora r;
	private int i;
	
	public RegistradoraCommandReseta(Registradora r) {
		this.r=r;
		this.i=r.getTotal();
	}

	@Override
	public void doExecute() {
		r.reseta();
		
	}

	@Override
	public void unDo() {
		r.soma(i);
		
	}

}
