package opgave5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FilUtil {
	public static int max(String fileName) {
		int maxInteger = -1;

		try {
			FileInputStream file = new FileInputStream(fileName);
			Scanner in = new Scanner(file);
			while (in.hasNextInt()) {
				int nextInt = in.nextInt();
				if (nextInt > maxInteger) {
					maxInteger = nextInt;
				}
			}
			in.close();
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
		return maxInteger;
	}

	public static int min(String fileName) {
		int minValue = Integer.MAX_VALUE;

		try {
			FileInputStream file = new FileInputStream(fileName);
			Scanner in = new Scanner(file);

			while (in.hasNextInt()) {
				int nextInt = in.nextInt();
				if (nextInt < minValue) {
					minValue = nextInt;
				}
			}
			in.close();
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}

		return minValue;
	}

	public static double gennemsnit(String fileName) {
		double average = 0.0;
		int antalIntegers = 0;

		try {
			FileInputStream file = new FileInputStream(fileName);
			Scanner in = new Scanner(file);

			while (in.hasNextInt()) {
				average += in.nextInt();
				antalIntegers++;
			}
			in.close();
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}

		return average / antalIntegers;
	}
}