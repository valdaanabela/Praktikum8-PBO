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
* <img width="712" height="350" alt="Cuplikan layar 2026-10-23 234058" src="https://github.com/user-attachments/assets/5e2fbd79-cc83-4415-ba20-62625d885170" />
* **`Lingkaran.java`**: Subclass dari `BangunDatar` yang wajib mengimplementasikan rumus perhitungan luas lingkaran
* <img width="706" height="355" alt="Cuplikan layar 2026-10-23 234106" src="https://github.com/user-attachments/assets/4c4b14a9-fb0b-4c3c-bd53-42a4c74dcb16" />
* **`TesBangunDatar.java`**: Kelas utama untuk menguji
* <img width="686" height="188" alt="Cuplikan layar 2026-10-23 234128" src="https://github.com/user-attachments/assets/3d4b7d5f-c84c-49f4-b8e5-2cb177d0ff85" />
* **`Output`**
* <img width="347" height="106" alt="Cuplikan layar 2026-10-23 234138" src="https://github.com/user-attachments/assets/f89e6787-a507-4e76-9a0c-46c93beb9d0a" />

### 3. Kegiatan 3: Implementasi Interface (Multiple Implementation)
Mempelajari penggunaan cetak biru murni (*pure abstraction*) untuk mendukung penerapan banyak kontrak antarmuka pada satu kelas
* **`AlatElektronik.java`**: Interface yang mendefinisikan kontrak metode `nyalakan()` dan `matikan()`
* <img width="688" height="128" alt="Cuplikan layar 2026-10-23 234433" src="https://github.com/user-attachments/assets/7953c88e-c7d8-4860-b36b-4705a4ef9734" />
* **`Kamera.java`**: Interface kedua yang mendefinisikan kontrak metode `ambilFoto()`
* <img width="682" height="111" alt="Cuplikan layar 2026-10-23 234442" src="https://github.com/user-attachments/assets/bcfe65a9-9ba1-4ef1-8e17-9b6802b6d037" />
* **`Smartphone.java`**: Kelas yang mengimplementasikan dua interface sekaligus (`AlatElektronik` dan `Kamera`), mensimulasikan pewarisan ganda di Java
* <img width="687" height="526" alt="Cuplikan layar 2026-10-23 234454" src="https://github.com/user-attachments/assets/5b787c83-1266-494c-8950-54284eb518ce" />
* **`TesSmarthphone.java`**: Kelas utama untuk menguji
* <img width="523" height="202" alt="Cuplikan layar 2026-10-23 234503" src="https://github.com/user-attachments/assets/374ec7b2-0453-4db9-93ee-96b6d0bb8bc3" />
* **`Output`**
* <img width="410" height="106" alt="Cuplikan layar 2026-10-23 234521" src="https://github.com/user-attachments/assets/05b93686-4fd7-423a-9c48-1c55f2c81585" />

---
