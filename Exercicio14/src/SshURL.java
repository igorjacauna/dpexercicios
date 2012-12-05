public class SshURL extends URI {

	@Override
	protected String setPrefix() {
		return "ssh://";
	}

	@Override
	protected String setSuffix() {
		return ":22";
	}

}
