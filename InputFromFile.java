import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class InputFromFile implements Input {

	ScannerWrapper scannerWrapper;

	public InputFromFile(/* ScannerWrapper scannerWrapper */) {
		// this.scannerWrapper = scannerWrapper;
	}

	@Override
	public ArrayList<String> read() {
		ArrayList<String> lines = new ArrayList<>();
		FileReader file = null;
		try {
			file = new FileReader("kwic.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		scannerWrapper = new ScannerWrapper(file);
		while (scannerWrapper.hasNextLine()) {
			lines.add(scannerWrapper.nextLine());
		}
		return lines;
	}
}
