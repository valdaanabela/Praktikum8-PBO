package praktikumPBO8;

// Class utama untuk menguji Polimorfisme Runtime (Dynamic Binding)
public class PoliTester {
    public static void main(String[] args) {
        // Deklarasi array dari tipe Superclass (Hewan), tetapi diisi dengan objek Subclass
        Hewan[] daftarHewan = new Hewan[3];
        daftarHewan[0] = new Hewan();
        daftarHewan[1] = new Kucing(); // Upcasting: Objek Kucing diperlakukan sebagai Hewan
        daftarHewan[2] = new Anjing(); // Upcasting: Objek Anjing diperlakukan sebagai Hewan

        // Polimorfisme: Pemanggilan method yang sama (bersuara()) menghasilkan output berbeda
        // tergantung jenis objek aslinya saat runtime
        for (Hewan h : daftarHewan) {
            h.bersuara();
        }
    }
}