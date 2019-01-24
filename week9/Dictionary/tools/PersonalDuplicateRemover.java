package tools;

import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;
import tools.DuplicateRemover;

public class PersonalDuplicateRemover implements DuplicateRemover {

	private List<String> allStrings;
	public PersonalDuplicateRemover() {
		this.allStrings = new ArrayList<String>();
	}

	public void add(String characterString) {
		this.allStrings.add(characterString);
	}

	public int getNumberOfDetectedDuplicates() {
		int totalDups = 0;
		for(int i = 0; i < this.allStrings.size() - 1;i++) {
			for (int j = 1 + i; j < this.allStrings.size();j++) {
				if(this.allStrings.get(i) == this.allStrings.get(j)) {
					totalDups++;
					break;
				}
			}
		}
		return totalDups;
	}

	public Set<String> getUniqueCharacterStrings() {
		Set uniques = new HashSet<String>();
		for(String string : this.allStrings) {
			uniques.add(string);
		}
		return uniques;
	}

	public void empty() {
		this.allStrings = new ArrayList<String>();
	}
}