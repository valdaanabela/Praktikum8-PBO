package praktikumPBO8;

// Abstract Class: Tidak bisa diinstansiasi langsung menggunakan 'new'
public abstract class BangunDatar {
    String warna;

    // Konstruktor untuk inisialisasi variabel warna
    public BangunDatar(String warna) {
        this.warna = warna;
    }

    // Abstract method: Tidak memiliki isi/bodi, wajib di-override oleh subclass
    public abstract double hitungLuas();

    // Concrete method: Memiliki isi/bodi, bisa langsung digunakan oleh subclass
    public void cetakWarna() {
        System.out.println("Warna bangun ini adalah: " + warna);
    }
}