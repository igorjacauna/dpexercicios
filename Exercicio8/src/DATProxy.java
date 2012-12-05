public class DATProxy implements DAT {

	private String fileName;
	private DATFile datFile;

	public DATProxy(String path) {
		this.fileName = path;
	}

	@Override
	public void loadData() throws Exception {
	}

	@Override
	public String getData() {
		if (datFile == null) {
			datFile = new DATFile(fileName);
		}

		try {
			datFile.loadData();
		} catch (Exception e) {
		}
		return datFile.getData();
	}

}
