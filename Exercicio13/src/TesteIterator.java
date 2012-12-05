import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class TesteIterator {

	@Test
	public void test() {
		VideoGames gc = new VideoGames();

		gc.addJogo("Atari", "Hero");
		gc.addJogo("Atari", "River Raid");
		gc.addJogo("GBA", "Broken Sword");
		gc.addJogo("PC", "Grim Fandango");

		Iterator<String> gi = gc.iterator();

		assertEquals("Atari", gi.next());
		assertEquals("GBA", gi.next());
		assertEquals("PC", gi.next());

		assertEquals("Broken Sword", gi.next());
		assertEquals("Grim Fandango", gi.next());
		assertEquals("Hero", gi.next());
		assertEquals("River Raid", gi.next());

		assertFalse(gi.hasNext());
	}

}
