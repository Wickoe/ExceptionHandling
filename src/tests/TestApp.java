package tests;

public class TestApp {
    
    public static void main(String[] args) {
        try {
            String s = "42 ";
            int i = -1;
            
            System.out.println(Integer.parseInt(s.trim()));
            System.out.println(i);
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        finally {
            
        }
    }
}