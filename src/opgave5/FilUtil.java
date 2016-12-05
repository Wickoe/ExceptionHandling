package opgave5;

import java.io.FileInputStream;
import java.util.Scanner;

public class FilUtil {
    public static int max(String filename) {
        int maxInteger = -1;

        try {
            FileInputStream file = new FileInputStream(filename);
            Scanner in = new Scanner(file);
            while (in.hasNextInt()) {
                int nextInt = in.nextInt();
                if (nextInt > maxInteger) {
                    maxInteger = nextInt;
                }
            }
            in.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return maxInteger;
    }
}