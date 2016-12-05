package opgave5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class CreateFileText {

	public static void main(String[] args) {
		Random random = new Random();

		try {
			PrintWriter outOne = new PrintWriter("fileNameLarge.txt");
			PrintWriter outTwo = new PrintWriter("fileNameSmall.txt");

			for (int i = 0; i < 2500; i++) {
				outOne.println(random.nextInt(2500) + 1);
			}

			for (int i = 0; i < 10; i++) {
				outTwo.println(random.nextInt(2500) + 1);
			}
			outOne.close();
			outTwo.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException: " + e.getMessage());
		}
	}

}
