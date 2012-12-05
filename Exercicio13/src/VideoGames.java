import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class VideoGames implements Iterable<String> {

	private SortedSet<String> consoles = new TreeSet<String>();
	private SortedSet<String> jogos = new TreeSet<String>();

	public void addJogo(String console, String jogo) {
		consoles.add(console);
		jogos.add(jogo);
	}

	@Override
	public Iterator<String> iterator() {
		return new VideoGameIterator();
	}

	private class VideoGameIterator implements Iterator<String> {

		private int iteracao = 0;

		@Override
		public boolean hasNext() {
			return iteracao < (consoles.size() + jogos.size());
		}

		@Override
		public String next() {
			if (hasNext()) {
				if (iteracao < consoles.size()) {
					return (String) consoles.toArray()[iteracao++];
				} else {
					return (String) jogos.toArray()[iteracao++ - consoles.size()];
				}
			} else {
				return null;
			}
		}

		@Override
		public void remove() {
		}

	}

}
