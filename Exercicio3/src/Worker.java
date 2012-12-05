
public class Worker {

	static Worker w, w2;
	public static Worker getWorker() {
		if(w == null){
			w = new Worker();
			return w;
		} else if(w2 ==null){
			w2 = new Worker();
			return w2;
		}
		return null;
	}
	
	private Worker(){}

	public void done() {
		w = null;
	}

}
