import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DATFile implements DAT {

	private String data;
	private File file;

	public DATFile(String path) {
		this.file = new File(path);
		this.data = new String();
	}

	@Override
	public void loadData() throws Exception {
		if (file.exists()) {
			BufferedReader input = new BufferedReader(new FileReader(file));

			while (input.ready()) {
				data += input.readLine();
			}

			input.close();
		}
	}

	@Override
	public String getData() {
		return data;
	}

}
