import java.util.Scanner;

public class GenapGanjil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = scanner.nextInt();
        scanner.close();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " bilangan genap.");
        } else {
            System.out.println(bilangan + " bilangan ganjil.");
        }
    }
}
