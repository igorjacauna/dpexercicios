public class Cronometro {

	long tempoInicio;

	public void inicia() {
		tempoInicio = System.currentTimeMillis();
	}

	public long finaliza() {
		return System.currentTimeMillis() - tempoInicio;
	}

}
