import java.util.ArrayList;
import java.util.Scanner;

public class KampusApp {
    public static void main(String[] args) {
        KampusApp kampusApp = new KampusApp();
        kampusApp.showMenu();
    }

    private Scanner scanner;
    private Database database;

    public KampusApp(){
        scanner = new Scanner(System.in) ;
        database = new Database();
    }

    public void showMenu() {
        System.out.println("---------------------------------");
        System.out.println("Selamat Datang di Aplikasi Kampus");
        System.out.println("Pilihan menu:");
        System.out.println("1 -> Tambah Data Mahasiswa");
        System.out.println("2 -> Ubah Data Mahasiswa");
        System.out.println("3 -> Hapus Data Mahasiswa");
        System.out.println("4 -> Cari Data Mahasiswa");
        System.out.println("5 -> Tampilkan Semua Data Mahasiswa");
        System.out.println("0 -> Keluar Aplikasi");
        System.out.println("Silahkan masukkan menu yang dipilih: ");
        int menuYangDipilih = scanner.nextInt();
        scanner.nextLine();
        switch (menuYangDipilih) {
            case 1 :
            menuTambah ();
            case 2 :
            menuUbah ();
            case 3:
            menuHapus ();
            case 4 :
            menuCari ();
            case 5 :
            menuTampilkan ();
            case 0 :{
                System.out.println("Terimakasih sudah menggunakan Aplikasi Kampus");
                System.exit(0);
            }
        }
        scanner.close();
    }

    public void menuTampilkan() {
        ArrayList<Mahasiswa> daftarMahasiswa = database.read();
    System.out.println("----- Menu Tampilkan Data Mahasiswa -----");
    if (daftarMahasiswa.isEmpty()) {
        System.out.println("* Tidak ada data mahasiswa *");
    } else {
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("Jenis Kelamin: " + mahasiswa.getJenisKelamin());
            System.out.println("Nomor HP: " + mahasiswa.getNomorHP());
        }
    }
    System.out.println("Tekan Enter untuk melanjutkan...");
    scanner.nextLine();
    showMenu();
    }


    public void menuTambah() {
        System.out.println("----- Menu Tambah Mahasiswa -----");
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jenis Kelamin: ");
        String jenisKelamin = scanner.nextLine();
        System.out.print("Masukkan Nomor HP: ");
        String nomorHP = scanner.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa(nim, nama, jenisKelamin, nomorHP);
        database.create(mahasiswa);
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuUbah () {
        System.out.println("----- Menu Ubah Data Mahasiswa -----");
        System.out.print("Masukkan NIM Sebelumnya: ");
        String nimLama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String nimBaru = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jenis Kelamin: ");
        String jenisKelamin = scanner.nextLine();
        System.out.print("Masukkan Nomor HP: ");
        String nomorHP = scanner.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa(nimBaru, nama, jenisKelamin, nomorHP);
        database.update(mahasiswa, nimLama);
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuCari() {
        System.out.println("----- Menu Cari Data Mahasiswa -----");
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        Mahasiswa mahasiswa = database.read(nim);
        if(mahasiswa == null) {
            System.out.println("* NIM tidak ditemukan *");
        } else {
            System.out.println("* NIM: " + mahasiswa.getNim() + " *");
            System.out.println("* Nama: " + mahasiswa.getNama() + " *");
            System.out.println("* Jenis Kelamin: " + mahasiswa.getJenisKelamin() + " *");
            System.out.println("* Nomor HP: " + mahasiswa.getNomorHP() + " *");
        }
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuHapus(){
        System.out.println("----- Menu Cari Data Mahasiswa -----");
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        database.delete(nim);
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }
}
