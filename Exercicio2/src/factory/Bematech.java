package factory;

public class Bematech implements ECF{

	@Override
	public ECF getECF() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public DLL getDLL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getECFName() {
		// TODO Auto-generated method stub
		return "Bematech ECF";
	}

	@Override
	public String getDLLFileName() {
		// TODO Auto-generated method stub
		return "Bematech.DLL";
	}
}
