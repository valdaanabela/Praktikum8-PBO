package praktikumPBO8;

// Mengimplementasikan dua interface sekaligus (Multiple Implementation)
public class Smartphone implements AlatElektronik, Kamera {
    private String merk;

    // Konstruktor untuk menset atribut merk
    public Smartphone(String merk) {
        this.merk = merk;
    }

    @Override
    // Implementasi method nyalakan() dari interface AlatElektronik
    public void nyalakan() {
        System.out.println(merk + " menyala. Booting OS...");
    }

    @Override
    // Implementasi method matikan() dari interface AlatElektronik
    public void matikan() {
        System.out.println(merk + " dimatikan. Goodbye.");
    }

    @Override
    // Implementasi method ambilFoto() dari interface Kamera
    public void ambilFoto() {
        System.out.println("Cekrek! Foto berhasil disimpan di galeri " + merk);
    }
}