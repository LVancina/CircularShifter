import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class CircularShifter {

	public List<String> shiftLines(List<String> lines) {
		ArrayList<String> newLines = new ArrayList<String>();
		for (String line : lines) {
			newLines.addAll(circularShift(line));
		}
		return newLines;
	}

	private ArrayList<String> circularShift(String title) {
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<String> newLines = new ArrayList<String>();
		StringTokenizer tokens = new StringTokenizer(title, " ");

		while (tokens.hasMoreTokens()) {
			words.add(tokens.nextToken());
		}
		for (int i = 0; i < words.size(); i++) {
			StringJoiner newTitle = new StringJoiner(" ");
			shift(words);
			for (String str : words) {
				newTitle.add(str);
			}
			newLines.add(newTitle.toString());
		}
		return newLines;
	}

	private void shift(ArrayList<String> list) {
		String temporaryString;
		temporaryString = list.get(list.size() - 1);
		list.add(0, temporaryString);
		list.remove(list.size() - 1);
	}
}
