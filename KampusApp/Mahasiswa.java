public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String nomorHP;


    public Mahasiswa (String nim, String nama, String jenisKelamin, String nomorHP) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.nomorHP = nomorHP;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getNomorHP() {
        return nomorHP;
    }
    
}
