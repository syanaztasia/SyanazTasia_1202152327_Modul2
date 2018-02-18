package com.example.syanaz.syanaztasia_1202152327_modul2;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MenuViewHolder>{

    class MenuViewHolder extends RecyclerView.ViewHolder{
        private TextView lisNama,lisHarga,lisID;
        private ImageView lisGambar;

        public MenuViewHolder(View itemView){
            super(itemView);
            lisID = (TextView)itemView.findViewById(R.id.ID);
            lisNama = (TextView)itemView.findViewById(R.id.listNama);
            lisHarga = (TextView)itemView.findViewById(R.id.listHarga);
            lisGambar = (ImageView) itemView.findViewById(R.id.listGambar);

        }
    }

    private ArrayList<DeskMenu> dataList;
    public ListAdapter(ArrayList<DeskMenu> list){
        this.dataList = list;
        Log.d("Jumlah Menu","Ukuran"+getItemCount());
    }



    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_list_adapter2, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MenuViewHolder holder, final int position) {
        holder.lisID.setText(""+position);
        holder.lisNama.setText(dataList.get(position).getNama());
        holder.lisHarga.setText(""+ NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(dataList.get(position).getHarga()));
        holder.lisGambar.setImageResource(dataList.get(position).getGambar());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String id = holder.lisID.getText().toString();
                Log.d("ItemMenuCLICKED","ID:"+id);
                Toast.makeText(v.getContext(), "Memilih Menu '"+dataList.get(Integer.parseInt(id)).getNama()+"'", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(v.getContext().getApplicationContext(), DetailMenu.class);
                i.putExtra("MenuID",""+id);
                v.getContext().startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

}

