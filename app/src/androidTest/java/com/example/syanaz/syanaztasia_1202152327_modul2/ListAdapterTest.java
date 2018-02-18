package com.example.syanaz.syanaztasia_1202152327_modul2;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import org.junit.Test;

import java.text.NumberFormat;
import java.util.Locale;

import static org.junit.Assert.*;

/**
 * Created by Syanaz on 2/18/2018.
 */
public class ListAdapterTest {
    @Test
    public void onCreateViewHolder() throws Exception {
        ViewGroup parent;
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_list_adapter, parent, false);
        return new ListAdapter.MenuViewHolder(view);
    }


    @Test
    public void onBindViewHolder() throws Exception {
        holder.lblNama.setText(dataList.get(position).getNama());
        holder.lblHarga.setText(""+ NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(dataList.get(position).getHarga()));
        holder.lblGambar.setImageResource(dataList.get(position).getGambar());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("ItemMenuCLICKED");
                Toast.makeText(v.getContext(), "Memilih Menu '"+"'", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(v.getContext().getApplicationContext(), DetailMenu.class);
                i.putExtra("MenuID");
                v.getContext().startActivity(i);

            }
        });
    }

    @Test
    public void getItemCount() throws Exception {
    }

}