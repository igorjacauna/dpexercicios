
public class ElginAdapter implements ECF {

	Elgin elgin;
	
	public ElginAdapter(Elgin elgin) {
		this.elgin = elgin;
	}

	@Override
	public boolean isOpen() {
		return this.elgin.estaAberto();
	}

	@Override
	public void readX() {
		this.elgin.leituraX();
	}

	@Override
	public void reduceZ() {
		this.elgin.reducaoZ();
	}

}
