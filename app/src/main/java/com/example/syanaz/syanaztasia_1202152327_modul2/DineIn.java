package com.example.syanaz.syanaztasia_1202152327_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class DineIn extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {

    private TextView nama;
    private Spinner spin;

    private static final String TAG = DineIn.class.getSimpleName();
    private String mSpinnerLabel = "";
    private BreakIterator buttonPilih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        nama = (TextView)findViewById(R.id.nama_customer);
//inisiasi untuk spinner
     spin = (Spinner) findViewById(R.id.label_spinner);
        if (spin != null){
            spin.setOnItemSelectedListener(this);
//memanggil array agar menampung data yanga ada pada spinner
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            if (spin != null){
                spin.setAdapter(adapter);
            }
        }

    }

    public void buttonPilih(View view) {
        //membuat string untuk meja dan nama agar jika diklik button pesan maka akan muncul nama dan meja yang dipilih menggunakan toast
        String meja, namax;
        meja = String.valueOf(spin.getSelectedItem());
        namax = nama.getText().toString();
        Toast.makeText(this, meja +" atas Nama "+namax, Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, DaftarMenu.class));
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        mSpinnerLabel = adapterView.getItemAtPosition(i).toString();


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Log.d(TAG, "onNothingSelected: ");


    }
}
