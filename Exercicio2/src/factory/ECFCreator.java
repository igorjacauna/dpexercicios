package factory;

public class ECFCreator {

	public static ECF getECF(String type){
		if(type.equals("Bematech")){
			return new Bematech();
		}else if(type.equals("Elgin")){
			return new Elgin();
		}else{
			return null;
		}
	}
	
}
