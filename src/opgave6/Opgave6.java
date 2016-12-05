package opgave6;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Opgave6 {
	public static void main(String[] args) {
		System.out.println("Find person with last name 'Andersen'");
		System.out.println(linFileSearchPerson("personer.txt", "Andersen"));
		System.out.println("Find person with last name 'Behrens'");
		System.out.println(linFileSearchPerson("personer.txt", "Behrens"));
	}

	/**
	 * Søger efter en person med det angivne efternavn med lineær søgning
	 * 
	 * @param fileName
	 *            Filen der ledes i
	 * @param efternavn
	 *            Det efternavn der søges efter
	 * @return Det fulde navn, dvs. både fornavn og efternavn, eller den tomme
	 *         streng, hvis personen ikke findes.
	 */
	public static String linFileSearchPerson(String fileName, String efternavn) {
		String person = "";
		try {
			FileInputStream file = new FileInputStream("personer.txt");
			Scanner in = new Scanner(file);
			boolean found = false;
			String[] personInformation = new String[0];

			while (in.hasNextLine() && !found) {
				personInformation = in.nextLine().split(" ");
				for (String s : personInformation) {
					if (s.equals(efternavn)) {
						found = true;
					}
				}
			}
			if (found) {
				person = personInformation[1] + " " + personInformation[2];
			}
			in.close();
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
		return person;
	}

}