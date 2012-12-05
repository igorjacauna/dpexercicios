public class MailURL extends URI {

	@Override
	protected String setPrefix() {
		return "mailto:";
	}

	@Override
	protected String setSuffix() {
		return "";
	}

}
