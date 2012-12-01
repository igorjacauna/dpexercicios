
public class RegistradoraCommandSubtracao implements RegistradoraCommand {
	
	private Registradora r;
	private int i;

	public RegistradoraCommandSubtracao(Registradora r, int i) {
		this.r=r;
		this.i=i;
	}

	@Override
	public void doExecute() {
		r.subtrai(i);
		
	}

	@Override
	public void unDo() {
		r.soma(i);
		
	}

}
