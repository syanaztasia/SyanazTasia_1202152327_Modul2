package com.example.syanaz.syanaztasia_1202152327_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;


import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class DetailMenu extends AppCompatActivity {

    private ArrayList<DeskMenu> menux;
    private String idMakanan;
    private TextView harga, nama, deskripsi;
    private ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
// melakukan inisiasi pada id yang ada di detail_menu.xml
        nama = (TextView)findViewById(R.id.menu_Nama);
        harga = (TextView)findViewById(R.id.menu_Harga);
        deskripsi = (TextView)findViewById(R.id.menu_Deskripsi);
        gambar = (ImageView) findViewById(R.id.menu_Gambar);
//
        menux = DaftarMenu.listMenu;

        //melakukan get data dari menu yang sebelumnya sudah mengambil data yang dikirimkan
        Intent q = getIntent();
        idMakanan = q.getStringExtra("MenuID");
        Log.d("DETAILED MENU","ID:"+idMakanan);
        DeskMenu menu = menux.get(Integer.parseInt(idMakanan));

        //melakukan setText dan setImageResource untuk data yang sudah ada dari layout sebelumnya
        nama.setText(menu.getNama());
        setTitle(menu.getNama());
        harga.setText(""+ NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(menu.getHarga()) +",- / Porsi");
        deskripsi.setText(menu.getDeskripsi());
        gambar.setImageResource(menu.getGambar());
    }
}
