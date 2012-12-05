import static org.junit.Assert.*;

import org.junit.Test;


public class TestMultiton {

	@Test
	public void test() {
		Worker  w1 = Worker.getWorker();
		Worker  w2 = Worker.getWorker();
		Worker  w3 = Worker.getWorker();
		
		assertEquals(Worker.class, w1.getClass());	
		assertEquals(Worker.class, w2.getClass());
		
		assertTrue(w1 != null);
		assertTrue(w2 != null);
		assertTrue(w3 == null);
		
		w1.done();
		w1 = null;
		w3 = Worker.getWorker();
		
		assertEquals(Worker.class, w3.getClass());
		assertTrue(w3 != null);
	}

}
