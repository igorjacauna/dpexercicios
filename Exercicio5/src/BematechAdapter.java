
public class BematechAdapter implements ECF {
	
	Bematech bematech;
	
	public BematechAdapter(Bematech bematech) {
		this.bematech = bematech;
	}

	@Override
	public boolean isOpen() {
		return this.bematech.aberto();
	}

	@Override
	public void readX() {
		this.bematech.leituraX();
	}

	@Override
	public void reduceZ() {
		this.bematech.reducaoZ();
	}

}
