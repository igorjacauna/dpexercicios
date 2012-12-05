import static org.junit.Assert.*;

import org.junit.Test;

public class TestTemplateMethod {

	@Test
	public void testFTP() {
		URI uri = new FtpURL();
		uri.setHostName("fpf.br");
		uri.setUserName("user1");

		assertEquals("ftp://user1@fpf.br:21", uri.getURL());
	}

	@Test
	public void testSSH() {
		URI uri = new SshURL();
		uri.setHostName("fpf.br");
		uri.setUserName("user1");

		assertEquals("ssh://user1@fpf.br:22", uri.getURL());
	}

	@Test
	public void testMAIL() {
		URI uri = new MailURL();
		uri.setHostName("fpf.br");
		uri.setUserName("user1");

		assertEquals("mailto:user1@fpf.br", uri.getURL());
	}

}
