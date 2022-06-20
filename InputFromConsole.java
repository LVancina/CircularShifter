import java.util.ArrayList;

public class InputFromConsole implements Input {

	ScannerWrapper scannerWrapper;
	SystemWrapper systemWrapper;

	public InputFromConsole(ScannerWrapper scannerWrapper, SystemWrapper systemWrapper) {
		this.scannerWrapper = scannerWrapper;
		this.systemWrapper = systemWrapper;
	}

	@Override
	public ArrayList<String> read() {
		ArrayList<String> lines = new ArrayList<>();
		String newLine;
		systemWrapper.println("Please enter lines to add, then enter -1 to finish:");
		newLine = scannerWrapper.nextLine();
		while (newLine.compareTo("-1") != 0) {
			lines.add(newLine);
			newLine = scannerWrapper.nextLine();
		}
		return lines;
	}
}
