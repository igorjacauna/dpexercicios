
public class SshURL extends URI {

	@Override
	public void setHostName(String host) {
		super.host = host;
		
	}

	@Override
	public void setUserName(String user) {
		super.user = user;
		
	}

	@Override
	public String getHostName() {
		// TODO Auto-generated method stub
		return super.host;
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return super.user;
	}

}
