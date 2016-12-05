package opgave2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream(
                "NumberTextFile.txt");
            Scanner in = new Scanner(file);

            File outPutFile = new File("UpdatedNumberTextFile.txt");
            PrintWriter out = new PrintWriter(outPutFile);
            while (in.hasNextInt()) {
                int integerToValueDoubleUp = in.nextInt();
                integerToValueDoubleUp = integerToValueDoubleUp * 2;
                out.println(integerToValueDoubleUp);
            }

            in.close();
            out.close();
        }
        catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}