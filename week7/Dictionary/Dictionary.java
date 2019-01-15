import java.util.*;

public class Dictionary {

	private HashMap<String, String> dictionaryOfWords = new HashMap<String, String>();

	public String translate(String word) {
		if (this.dictionaryOfWords.get(word) != null) {
			return this.dictionaryOfWords.get(word);
		} else {
			return "null";
		}
	}

	public void add(String word, String translation) {
		this.dictionaryOfWords.put(word, translation);
	}

	public int amountOfWords() {
		return this.dictionaryOfWords.size();
	}

	public ArrayList<String> translationList() {
		ArrayList<String> translations = new ArrayList<String>();
		for (String key : this.dictionaryOfWords.keySet()) {
			translations.add(this.dictionaryOfWords.get(key));
		}
		return translations;
	}

	public static void main(String[] args) {
    Dictionary dictionary = new Dictionary();
    dictionary.add("apina", "monkey");
    dictionary.add("banaani", "banana");
    dictionary.add("cembalo", "harpsichord");

    ArrayList<String> translations = dictionary.translationList();
    for(String translation: translations) {
        System.out.println(translation);
    }
	}
}