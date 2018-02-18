package com.example.syanaz.syanaztasia_1202152327_modul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

    private ListAdapter mAdapter;
    private RecyclerView recyclerView;

    public static ArrayList<DeskMenu> listMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        listMenu = isiMenu();
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        mAdapter = new ListAdapter(listMenu);
        recyclerView.setAdapter(mAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
//menyediakan data-datanya dan akan di ambil ketika detailmenu di klik
    private ArrayList<DeskMenu> isiMenu() {
        ArrayList<DeskMenu> data = new ArrayList<>();
        data.add(new DeskMenu("Bibimbap", 30000, R.drawable.bibimbap,"Nasi dengan tambahan telor sayur-sayuran dan daging cincang"));
        data.add(new DeskMenu("Budae Jiggae", 28000, R.drawable.budae,"Mie Ramen dengan tambahan sosis sayur dan lainnya"));
        data.add(new DeskMenu("Corndog", 15000, R.drawable.corndog,"Sosis dibalut dengan kentang goreng dan diberi saus juga mayonaise"));
        data.add(new DeskMenu("Kimci", 20000, R.drawable.kimci,"Sayur di fermentasi"));
        data.add(new DeskMenu("Odeng", 26000, R.drawable.odeng,"Fish Cake"));
        return data;
    }
    }