// Lokasi: src/com/contoh/main/MainApp.java
package com.contoh.main;

// Import class Mahasiswa dari package lain
import com.contoh.model.Mahasiswa;

public class MainApp {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Abid Zuhdi Muzammil", "2403051");
        mhs.tampilkanInfo();
    }
}
