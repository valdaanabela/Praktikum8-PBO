package praktikumPBO8;

// Subclass Kucing yang mewarisi (extends) dari kelas Hewan
public class Kucing extends Hewan {
    @Override // Anotasi opsional tapi direkomendasikan untuk menandai method overriding
    public void bersuara() {
        // Mengganti perilaku method bersuara() khusus untuk Kucing
        System.out.println("Kucing: Meow meow!");
    }
}