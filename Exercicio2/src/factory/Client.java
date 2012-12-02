package factory;

public class Client {

	private ECF ecf;
	private DLL dll;
	
	public void setECF(ECFFactory ecf) {
		// TODO Auto-generated method stub
		this.ecf = ecf.getECF();
		this.dll = dll.getDLL();
	}
	
	public String getECFName() {
		// TODO Auto-generated method stub
		return this.ecf.getECFName();
	}

	public Object getDLLFileName() {
		// TODO Auto-generated method stub
		return this.dll.getDLLFileName();
	}
	
	

}
