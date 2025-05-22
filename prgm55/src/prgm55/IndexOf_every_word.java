package prgm55;
import java.util.List;
import java.util.ArrayList;

public class IndexOf_every_word {
	public static List<Integer> findWordIndices(String text, String word) {
		List<Integer> indices = new ArrayList<>();
		int index = text.toLowerCase().indexOf(word.toLowerCase());

		while (index >= 0) {
			indices.add(index);
			index = text.toLowerCase().indexOf(word.toLowerCase(), index + word.length());
		}

		return indices;
	}
	
	public static void main(String[] args) {
		String text = "This is an example. Another example is here. Example again.";
		String word = "example";
		List<Integer> indices = findWordIndices(text, word);

		System.out.println("Indices of the word \"" + word + "\": " + indices);
	}
}


