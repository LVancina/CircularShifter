public class InputFactory {

	SystemWrapper systemWrapper;
	ScannerWrapper scannerWrapper;

	public InputFactory(SystemWrapper systemWrapper, ScannerWrapper scannerWrapper) {
		this.systemWrapper = systemWrapper;
		this.scannerWrapper = scannerWrapper;
	}

	public Input create(String choice) {
		switch (choice) {
		case "CONSOLE":
			return new InputFromConsole(scannerWrapper, systemWrapper);
		case "FILE":
			return new InputFromFile();
		default:
			throw new IllegalArgumentException();
		}
	}
}
