import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Kalkulator myKalkulator = new Kalkulator();
        Scanner scanner = new Scanner (System.in);

        System.out.println("Masukkan angka :");
        int angka_pertama = scanner.nextInt();
        int angka_kedua = scanner.nextInt();

        int hasilPenjumlahan = myKalkulator.jumlahkan(angka_pertama,angka_kedua);
        System.out.printf("Hasil : " + hasilPenjumlahan);
    }
}