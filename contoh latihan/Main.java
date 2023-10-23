import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        // int c = 10; // Unused variable

        if (a == 3 && b == 5) {
            System.out.println("Blok TRUE");
        } else {
            System.out.println("Blok FALSE");
        }

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Masukan angka");
        int input = 3;

        for (int i = 0; i < input; i++) { 
            for (int j = 0; j < input -1; j++) {
                System.out.print("*");
            }
            char huruf = (char) ('A' +i);
            System.out.print(huruf);
            System.out.println(); 
        }

        //scanner.close();
    }
}