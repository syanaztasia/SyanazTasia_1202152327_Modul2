package com.example.syanaz.syanaztasia_1202152327_modul2;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }
//ketika diklik button pesan sekarang maka akan pindah ke activity daftar menu menampilkan menu menu apa saja yang tersedia
    public void buttonPemesanan(View view) {
        startActivity(new Intent(this, DaftarMenu.class));
    }
    //ini untuk menampilkan tanggal pemesanan
    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.date_picker));
    }
    //ini untuk menampilkan waktu pemesanan
    public void showTimePickerDialog(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.time_picker));
    }

    public void processDatePickerResult(int year, int month, int day) {

        //memasukkan bulan pertama dan bulan selanjutnya
        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);

        String dateMessage = (month_string + "/" +
                day_string + "/" + year_string);
        Toast.makeText(this, getString(R.string.datee) + dateMessage,
                Toast.LENGTH_SHORT).show();
    }

    public void processTimePickerResult(int hourOfDay, int minute) {
        // melakukan convert kedalam waktu
        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);
        String timeMessage = (hour_string + ":" + minute_string);

        Toast.makeText(this, getString(R.string.timee) + timeMessage,
                Toast.LENGTH_SHORT).show();
    }
}
