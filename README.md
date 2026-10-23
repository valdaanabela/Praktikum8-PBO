# Praktikum8-PBO
---
## Nama : Valda Anabela
## NIM  : L0325035
---

## Tujuan Pembelajaran
Setelah menyelesaikan modul ini, mahasiswa diharapkan mampu:
1. Memahami dan mengimplementasikan konsep **Polymorphism** pada tingkat *runtime* (*Method Overriding*)
2. Merancang **Abstract Class** dan **Abstract Method** sebagai kerangka dasar hierarki kelas
3. Mengimplementasikan **Interface** untuk menciptakan kontrak arsitektur perangkat lunak dan menyimulasikan *multiple inheritance* (pewarisan ganda)

---

## Struktur Proyek & Penjelasan Kode

### 1. Kegiatan 1: Implementasi Polymorphism (Method Overriding)
Mempelajari bagaimana sebuah metode dapat merespons secara berbeda tergantung pada bentuk objek aslinya saat *runtime*
* **`Hewan.java`**: Superclass dasar yang memiliki metode umum `bersuara()
* <img width="736" height="173" alt="Cuplikan layar 2026-10-23 231816" src="https://github.com/user-attachments/assets/5a2a1a84-9dd0-4949-8a51-8824bb692743" />
* **`Kucing.java`**: Subclass turunan `Hewan` yang meng-*override* metode `bersuara()` untuk mengeluarkan suara kucing (*"Meow meow!"*)
* <img width="786" height="203" alt="Cuplikan layar 2026-10-23 231829" src="https://github.com/user-attachments/assets/ead303e4-e16e-404a-9d09-80e654645e5d" />
* **`Anjing.java`**: Subclass turunan `Hewan` yang meng-*override* metode `bersuara()` untuk mengeluarkan suara anjing (*"Guk guk!"*)
* <img width="662" height="193" alt="Cuplikan layar 2026-10-23 231842" src="https://github.com/user-attachments/assets/b5e66ad7-589c-491b-b514-9ffac35b1f60" />
* **`PoliTester.java`**: Kelas utama untuk menguji *Dynamic Binding* menggunakan *Upcasting* dalam array tipe `Hewan`
* <img width="846" height="333" alt="Cuplikan layar 2026-10-23 231857" src="https://github.com/user-attachments/assets/5c629fe2-b01c-4ae4-9026-5ed2e83ca908" />
* **`Output`**
* <img width="625" height="162" alt="Cuplikan layar 2026-10-23 231918" src="https://github.com/user-attachments/assets/3c2ca632-32b5-4d3c-ba54-027575674673" />

### 2. Kegiatan 2: Implementasi Abstract Class
Mempelajari cara membuat kelas kerangka dasar yang tidak dapat diinstansiasi secara langsung namun wajib diimplementasikan oleh kelas turunannya
* **`BangunDatar.java`**: Kelas abstrak yang memiliki atribut warna, metode konkret `cetakWarna()`, dan *abstract method* `hitungLuas()`
* **`Lingkaran.java`**: Subclass dari `BangunDatar` yang wajib mengimplementasikan rumus perhitungan luas lingkaran

### 3. Kegiatan 3: Implementasi Interface (Multiple Implementation)
Mempelajari penggunaan cetak biru murni (*pure abstraction*) untuk mendukung penerapan banyak kontrak antarmuka pada satu kelas
* **`AlatElektronik.java`**: Interface yang mendefinisikan kontrak metode `nyalakan()` dan `matikan()`
* **`Kamera.java`**: Interface kedua yang mendefinisikan kontrak metode `ambilFoto()`
* **`Smartphone.java`**: Kelas yang mengimplementasikan dua interface sekaligus (`AlatElektronik` dan `Kamera`), mensimulasikan pewarisan ganda di Java

---
