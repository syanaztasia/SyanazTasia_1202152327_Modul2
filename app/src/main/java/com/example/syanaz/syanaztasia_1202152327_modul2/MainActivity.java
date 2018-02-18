package com.example.syanaz.syanaztasia_1202152327_modul2;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // membuat toast agar ketika main activity terbuka maka akan tampil nama dan nim
        Toast.makeText(getApplicationContext(), "Syanaz Tasia 1202152327",
                Toast.LENGTH_LONG).show();

        //menginisiasi radiogroup dari id yang ada pada main_activity.xml
    radioGroup = (RadioGroup)findViewById(R.id.radioGroup);

    }
//
    public void onRadioButtonClicked(View view) {
        int radioButton = radioGroup.getCheckedRadioButtonId();
        // switch itu ketika button take away yang diklik maka akan keluar toast take away dan dia akan pindah ke activity TakeAway.java
        //dan juga sebaliknya,maka dari itu digunakan switch
        switch (radioButton) {
            case R.id.dineIn:
                Toast.makeText(getApplicationContext(), "Dine In ",
                        Toast.LENGTH_LONG).show();
                startActivity(new Intent(this, DineIn.class));

                break;
            case R.id.takeAway:
                Toast.makeText(getApplicationContext(), "Take Away ",
                        Toast.LENGTH_LONG).show();
                startActivity(new Intent(this, TakeAway.class));
                break;

                default:break;

        }
    }
}