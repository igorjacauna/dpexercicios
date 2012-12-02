package factory;

public class ElginFactory implements ECFFactory {

	@Override
	public ECF getECF(){
		
	return new Elgin();
	}

	@Override
	public ECF getDLL(){
		
	return new Elgin();
	}
	
}
