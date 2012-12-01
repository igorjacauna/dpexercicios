
public class RegistradoraCommandSoma implements RegistradoraCommand {

	private Registradora r;
	private int i;
	
	public RegistradoraCommandSoma(Registradora r, int i) {
		this.r=r;
		this.i=i;
	}

	@Override
	public void doExecute() {
		r.soma(i);
		
	}

	@Override
	public void unDo() {
		r.subtrai(i);
		
	}

}
