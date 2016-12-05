package opgave5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScannerRead {

	public static void main(String[] args) {
		try {
			FileInputStream filein = new FileInputStream("C:/MAD/Ud/tal.txt");
			Scanner scan = new Scanner(filein);
			while (scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
			scan.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
