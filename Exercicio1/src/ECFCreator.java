
public class ECFCreator {

	public static ECF getECF(String string) {
		if(string.equals("Bematech")){
			return new Bematech();
		}else if(string.equals("Elgin")){
			return new Elgin();
		}else{
			return null;
		}
	}

}
