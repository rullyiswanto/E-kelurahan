package com.rz3.e_kelurahan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class hitung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung);


        Intent i = getIntent();
        String nama = i.getStringExtra("nama");



        TextView fnama = (TextView) findViewById(R.id.tampilnama);
        fnama.setText(nama);
    }


}
