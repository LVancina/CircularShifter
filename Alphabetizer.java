import java.util.List;

public class Alphabetizer {

	public List<String> sort(List<String> lines) {
		for (int i = 0; i < lines.size(); i++) {
			for (int j = i + 1; j < lines.size(); j++) {
				String strOne = lines.get(i);
				String strTwo = lines.get(j);
				if (strOne.compareToIgnoreCase(strTwo) > 0) {
					swap(lines, i, j);
				}
			}
		}
		return lines;
	}

	private void swap(List<String> list, int a, int b) {
		String temp = list.get(b);
		list.remove(b);
		list.add(a, temp);
	}
}
