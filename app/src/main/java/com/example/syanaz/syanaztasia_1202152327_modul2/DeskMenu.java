package com.example.syanaz.syanaztasia_1202152327_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DeskMenu {

    private int harga;
    private String nama;
    private String deskripsi;
    private int gambar;
//untuk mengambil data harga nama gambar dan deskripsi jadi ketika ditampilkan akan keluar data-datanya

    public DeskMenu(String nama, int harga, int gambar, String deskripsi) {
        this.gambar = gambar;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
    }
    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}