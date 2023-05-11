package com.example.tugascheckbox_maul;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox cAyam, cMie, cBakso;
    String[] menu;
    Button pesan;
    TextView pilihan1, pilihan2, pilihan3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cAyam = (CheckBox) findViewById(R.id.ayam);
        cBakso = (CheckBox) findViewById(R.id.bakso);
        cMie = (CheckBox) findViewById(R.id.mie);
        pilihan1 = (TextView) findViewById(R.id.pilihan_satu);
        pilihan2 = (TextView) findViewById(R.id.pilihan_dua);
        pilihan3 = (TextView) findViewById(R.id.pilihan_tiga);
        pesan = (Button) findViewById(R.id.pesan);

        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cAyam.isChecked()) {
                    menu[0] = "Ayam Goreng";
                }else {
                    menu[0] = " ";
                }

                if(cBakso.isChecked()) {
                    menu[1] = "Bakso";
                }else {
                    menu[1] = " ";
                }

                if(cMie.isChecked()) {
                    menu[2] = "Mie Rebus";
                }else {
                    menu[2] = " ";
                }

                pilihan1.setText(menu[0]);
                pilihan2.setText(menu[1]);
                pilihan3.setText(menu[2]);
            }
        });
    }
}