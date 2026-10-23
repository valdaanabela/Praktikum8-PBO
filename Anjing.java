package praktikumPBO8;

// Subclass Anjing yang mewarisi (extends) dari kelas Hewan
public class Anjing extends Hewan {
    @Override // Meng-override method bersuara() dari superclass
    public void bersuara() {
        // Mengganti perilaku method bersuara() khusus untuk Anjing
        System.out.println("Anjing: Guk guk!");
    }
}