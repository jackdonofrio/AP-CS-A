// I have removed the longer written response questions
// 5-15-2020

// a)
public ArrayList<Integer> screensWithMovies() {
	// list of indexes of open (non-null) movies
	ArrayList<Integer> screenIndexes = new ArrayList<>();
	// iterate through screenArr, if Movie obj not null, add to list
	for (int i = 0; i < screenArr.length; i++) {
		if (screenArr[i] != null) {
			screenIndexes.add(i);
		}
	}
	return screenIndexes;
}

// b)
public void updateScreenArr(ArrayList<Movie> moviesToAssign) {
	// iterate through screenArr, if a Movie obj is null
	// and we have available movies, set obj to first av. movie
	// remove av. movie from list.
	for (int i = 0; i < screenArr.length; i++) {
		if (screenArr[i] == null) {
			if (moviesToAssign.size() > 0) {
				screenArr[i] = moviesToAssign.get(0);
				moviesToAssign.remove(0);
			}
		}
	}
}

// c 
// REDACTED

// 2
// a

public static String letterAndPattern(String letter, String pattern) {
	// locate index of 'letter' in pattern; if -1, its not there
	int indexOfLetterInPattern = pattern.indexOf(letter);
	String result = "";
	// if not found in pattern return reversed pattern
	if (indexOfLetterInPattern == -1) {
		for (int i = pattern.length() - 1; i >= 0; i--) {
			result += pattern.substring(i, i+1);
		}
	}
	// if found in pattern, return letter 
	else {
		result = letter;
	}
	return result;
}

// b
// REDACTED
