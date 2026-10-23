# Praktikum8-PBO
---
## Nama : Valda Anabela
## NIM  : L0325035
---

## Tujuan Pembelajaran
Setelah menyelesaikan modul ini, mahasiswa diharapkan mampu:
1. Memahami dan mengimplementasikan konsep **Polymorphism** pada tingkat *runtime* (*Method Overriding*)[cite: 1].
2. Merancang **Abstract Class** dan **Abstract Method** sebagai kerangka dasar hierarki kelas[cite: 1].
3. Mengimplementasikan **Interface** untuk menciptakan kontrak arsitektur perangkat lunak dan menyimulasikan *multiple inheritance* (pewarisan ganda)[cite: 1].

---

## Struktur Proyek & Penjelasan Kode

### 1. Kegiatan 1: Implementasi Polymorphism (Method Overriding)
Mempelajari bagaimana sebuah metode dapat merespons secara berbeda tergantung pada bentuk objek aslinya saat *runtime*
* **`Hewan.java`**: Superclass dasar yang memiliki metode umum `bersuara()
* **`Kucing.java`**: Subclass turunan `Hewan` yang meng-*override* metode `bersuara()` untuk mengeluarkan suara kucing (*"Meow meow!"*)
* **`Anjing.java`**: Subclass turunan `Hewan` yang meng-*override* metode `bersuara()` untuk mengeluarkan suara anjing (*"Guk guk!"*)
* **`PoliTester.java`**: Kelas utama untuk menguji *Dynamic Binding* menggunakan *Upcasting* dalam array tipe `Hewan`

### 2. Kegiatan 2: Implementasi Abstract Class
Mempelajari cara membuat kelas kerangka dasar yang tidak dapat diinstansiasi secara langsung namun wajib diimplementasikan oleh kelas turunannya
* **`BangunDatar.java`**: Kelas abstrak yang memiliki atribut warna, metode konkret `cetakWarna()`, dan *abstract method* `hitungLuas()`
* **`Lingkaran.java`**: Subclass dari `BangunDatar` yang wajib mengimplementasikan rumus perhitungan luas lingkaran

### 3. Kegiatan 3: Implementasi Interface (Multiple Implementation)
Mempelajari penggunaan cetak biru murni (*pure abstraction*) untuk mendukung penerapan banyak kontrak antarmuka pada satu kelas
* **`AlatElektronik.java`**: Interface yang mendefinisikan kontrak metode `nyalakan()` dan `matikan()`
* **`Kamera.java`**: Interface kedua yang mendefinisikan kontrak metode `ambilFoto()`[cite: 3].
* **`Smartphone.java`**: Kelas yang mengimplementasikan dua interface sekaligus (`AlatElektronik` dan `Kamera`), mensimulasikan pewarisan ganda di Java

---

## 🚀 Cara Menjalankan Program

1. Pastikan Anda telah memasang **Java Development Kit (JDK)** dan IDE (seperti IntelliJ IDEA, Eclipse, atau NetBeans) di komputer Anda.
2. Buat struktur direktori atau proyek baru dan sesuaikan *package* menjadi `com.praktikum8`
3. Salin file-file kode sesuai dengan struktur kegiatan di atas.
4. Jalankan file utama (seperti `PoliTester.java`) untuk melihat hasil eksekusi dari polimorfisme dan implementasi OOP lainnya.
