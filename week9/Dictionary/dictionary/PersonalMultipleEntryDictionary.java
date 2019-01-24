package dictionary;

import dictionary.MultipleEntryDictionary;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{


	private Map<String, Set<String>> dictionaryWords;

	public PersonalMultipleEntryDictionary() {
		this.dictionaryWords = new HashMap<String, Set<String>>();
	}
	
	public void add(String word, String translation) {
		if(this.dictionaryWords.get(word) != null) {
			this.dictionaryWords.get(word).add(translation);
		} else {
			this.dictionaryWords.put(word, new HashSet<String>());
			this.dictionaryWords.get(word).add(translation);
		}
		return;
	}

	public Set<String> translate(String word) {
		//if(this.dictionaryWords.get(word) != null) {
			return this.dictionaryWords.get(word);
		//}
	}

	public void remove(String word)  {
		if(this.dictionaryWords.get(word) != null) {
			this.dictionaryWords.remove(word);
		} else {
			System.out.println("Word does not exist.");
		}
	}




}
