import java.io.InputStream;

public class SystemWrapper {
	private static SystemWrapper instance = new SystemWrapper();

	System system;

	private SystemWrapper() {
	}

	public static SystemWrapper getInstance() {
		return instance;
	}

	public InputStream getInputStream() {
		return system.in;
	}

	public void println(String string) {
		system.out.println(string);
	}
}
