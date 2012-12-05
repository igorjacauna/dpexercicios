public class ReprRomana extends Representacao {

	String conversao[] = { "0", "I", "II", "III", "IV", "V", "VI", "VII",
			"VIII", "IX", "X" };

	@Override
	public String getRepr() {
		return conversao[valor];
	}

}
