package opgave3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("UpdatedNumberTextFile.txt");
            Scanner in = new Scanner(file);
            ArrayList<Integer> workingArrayList = new ArrayList<>();

            while (in.hasNextInt()) {
                workingArrayList.add(in.nextInt());
            }

            in.close();

            PrintWriter out = new PrintWriter("UpdatedNumberTextFile.txt");
            
            for (int i = workingArrayList.size() - 1; i >= 0; i--) {
                out.println(workingArrayList.get(i));
            }
            out.close();
        }
        catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}