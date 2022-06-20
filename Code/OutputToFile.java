import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OutputToFile implements Output {

	public OutputToFile() {
	}

	@Override
	public void write(List<String> lines) {
		FileWriter file;
		try {
			file = new FileWriter("kwic_output.txt");

			for (String str : lines) {
				file.write(str);
				file.write('\n');
			}
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
