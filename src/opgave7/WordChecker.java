package opgave7;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class WordChecker {
	public static void main(String[] args) {
		for (String s : wordChecker("personer.txt")) {
			System.out.println(s);
		}
	}

	public static ArrayList<String> wordChecker(String fileName) {
		ArrayList<String> noSuchWord = new ArrayList<>();

		try {
			FileInputStream file = new FileInputStream(fileName);
			Scanner in = new Scanner(file);

			String address = "http://www-personal.umich.edu/~jlawler/wordlist";
			URL pageLocation = new URL(address);
			Scanner wordArciveConnection = new Scanner(pageLocation.openStream());

			while (in.hasNext()) {
				String word = in.next();
				boolean found = false;
				while (!found && wordArciveConnection.hasNext()) {
					if (word.equals(wordArciveConnection.next())) {
						found = true;
					}
				}
				if (!found) {
					noSuchWord.add(word);
				}
			}

			in.close();
			wordArciveConnection.close();
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}

		return noSuchWord;
	}
}