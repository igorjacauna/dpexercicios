import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.junit.BeforeClass;
import org.junit.Test;


public class TestProxy {

	@BeforeClass
	public static void setUp() throws IOException {
		File f = new File("bigFile.dat");
		if(!f.exists()){
			Writer  output = new BufferedWriter(
					new FileWriter(f, true));
			
			for(int i=0; i<1024*1024; i++){
				output.write("0");
			}
			output.close();
		}
	}
	
	@Test
	public void testDataFile() throws IOException{
		DAT f = new DATFile("bigFile.dat");
		long startTime = System.nanoTime();
		f.loadData();
		long estimatedTime= System.nanoTime() - startTime;
		assertTrue(estimatedTime>5000);
		assertEquals(new String(new char[1024*1024]).replace("\0", "0"), f.getData());
		
	}
	
	@Test
	public void testDATProxy() throws IOException{
		DAT f = new DATProxy("bigFile.dat");
		long startTime = System.nanoTime();
		f.loadData();
		long estimatedTime= System.nanoTime() - startTime;
		assertTrue(estimatedTime>5000);
		assertEquals(new String(new char[1024*1024]).replace("\0", "0"), f.getData());
	}

}
