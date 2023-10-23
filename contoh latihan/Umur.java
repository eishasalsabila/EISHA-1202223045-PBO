import java.util.Scanner;

public class Umur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = scanner.nextInt();
        scanner.close();

        if (bilangan >=6 && bilangan <= 12) {
            System.out.println(bilangan + " anak-anak");
        } 
        else if (bilangan <=5 ){
            System.out.println(bilangan + " balita");
        }
        else if (bilangan >= 13 && bilangan <=18){
            System.out.println(bilangan + " remaja");
        }
        else if (bilangan >= 19 && bilangan <=60){
            System.out.println(bilangan + " dewasa");
        }
        else if (bilangan >60){
            System.out.println(bilangan + " tua");
        }
        else {
            System.out.println(bilangan + " bukan umur");
        }
    }
}
