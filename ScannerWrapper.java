import java.io.FileReader;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerWrapper {
	public static ScannerWrapper instance = new ScannerWrapper(SystemWrapper.getInstance().getInputStream());

	Scanner scanner;

	private ScannerWrapper(InputStream inputStream) {
		scanner = new Scanner(inputStream);
	}

	public ScannerWrapper(FileReader fileReader) {
		scanner = new Scanner(fileReader);
	}

	public static ScannerWrapper getInstance() {
		return instance;
	}

	public String nextLine() {
		return scanner.nextLine();
	}

	public Boolean hasNextLine() {
		return scanner.hasNextLine();
	}
}
