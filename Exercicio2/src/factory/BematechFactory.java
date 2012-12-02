package factory;


public class BematechFactory implements ECFFactory {

	@Override
	public ECF getECF() {
		// TODO Auto-generated method stub
		return new Bematech();
	}

	@Override
	public ECF getDLL() {
		// TODO Auto-generated method stub
		return new Bematech();
	}

	
}