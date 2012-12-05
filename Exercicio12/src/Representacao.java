public abstract class Representacao {
	int valor = 0;

	abstract public String getRepr();

	void update(int valor) {
		this.valor = valor;
	}
}
