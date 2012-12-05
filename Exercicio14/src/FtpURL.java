public class FtpURL extends URI {

	@Override
	protected String setPrefix() {
		return "ftp://";
	}

	@Override
	protected String setSuffix() {
		return ":21";
	}

}
