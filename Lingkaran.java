package praktikumPBO8;

// Subclass yang mewarisi BangunDatar
public class Lingkaran extends BangunDatar {
    private double jariJari;

    // Konstruktor Lingkaran yang memanggil konstruktor superclass (BangunDatar)
    public Lingkaran(String warna, double jariJari) {
        super(warna); // Memanggil konstruktor BangunDatar(String warna)
        this.jariJari = jariJari;
    }

    @Override
    // Wajib mengimplementasikan/meng-override abstract method hitungLuas()
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}