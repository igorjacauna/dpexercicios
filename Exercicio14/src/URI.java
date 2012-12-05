public abstract class URI {

	String userName;
	String hostName;
	String prefix;
	String suffix;

	public void setHostName(String host) {
		this.hostName = host;
	}

	public void setUserName(String user) {
		this.userName = user;
	}

	public String getURL() {
		prefix = setPrefix();
		suffix = setSuffix();

		return prefix + userName + "@" + hostName + suffix;
	}

	abstract protected String setPrefix();

	abstract protected String setSuffix();

}
