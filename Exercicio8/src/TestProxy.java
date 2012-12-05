import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestProxy {

	@BeforeClass
	public static void setUp() throws Exception {
		File f = new File("bigfile.dat");
		if (!f.exists()) {
			Writer output = new BufferedWriter(new FileWriter(f, true));

			for (int i = 0; i < 1024 * 1024; i++) {
				output.write("0");
			}

			output.close();
		}
	}

	@Test
	public void testDATFile() throws Exception {
		DAT f = new DATFile("bigfile.dat");

		long startTime = System.nanoTime();
		f.loadData();
		long estimatedTime = System.nanoTime() - startTime;
		assertTrue(estimatedTime > 5000);

		assertEquals(new String(new char[1024 * 1024]).replace("\0", "0"),
				f.getData());
	}

	@Test
	public void testDATProxy() throws Exception {
		DAT f = new DATProxy("bigfile.dat");

		long startTime = System.nanoTime();
		f.loadData();
		long estimatedTime = System.nanoTime() - startTime;
		assertTrue(estimatedTime < 1000);

		startTime = System.nanoTime();
		assertEquals(new String(new char[1024 * 1024]).replace("\0", "0"),
				f.getData());
		estimatedTime = System.nanoTime() - startTime;
		assertTrue(estimatedTime > 5000);
	}

}
