import java.util.List;

public class MasterControl {

	public static void main(String[] args) throws IllegalArgumentException {
		MasterControl masterControl = new MasterControl();
		masterControl.start(ScannerWrapper.getInstance(), SystemWrapper.getInstance());
	}

	public void start(ScannerWrapper scannerWrapper, SystemWrapper systemWrapper) {
		List<String> lines;
		String choice;
		Input input;
		Output output;

		systemWrapper.println("Please enter FILE to input from file or CONSOLE to input from console:");
		choice = scannerWrapper.nextLine();
		InputFactory inputFactory = new InputFactory(systemWrapper, scannerWrapper);
		input = inputFactory.create(choice);

		systemWrapper.println("Please enter FILE to output from file or CONSOLE to output from console:");
		choice = scannerWrapper.nextLine();
		OutputFactory outputFactory = new OutputFactory(systemWrapper);
		output = outputFactory.create(choice);

		lines = input.read();

		CircularShifter circularShifter = new CircularShifter();
		lines = circularShifter.shiftLines(lines);

		Alphabetizer alphabetizer = new Alphabetizer();
		lines = alphabetizer.sort(lines);

		output.write(lines);
	}
}
