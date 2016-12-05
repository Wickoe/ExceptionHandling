package opgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter("Opgave4NumberFile.txt");

            boolean stopOperations = false;

            System.out.println("Type an integer:");
            while (!stopOperations) {
                System.out.println("Type '-1' to end program or a positive integer");
                int i = in.nextInt();
                if (i == -1) {
                    stopOperations = true;
                    in.close();
                    out.close();
                }
                else if (i < 0) {
                    throw new InputMismatchException("Wrong kind of input");
                }
                else {
                    out.println(i);
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException:");
            e.printStackTrace();
        }
        catch (InputMismatchException e) {
            System.out.println("InputMismatchException: " + e.getMessage());
        }
    }
}