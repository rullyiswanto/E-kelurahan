package com.rz3.e_kelurahan;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void diklik(View view) {
        //pilih objek view
        EditText fnama = (EditText) findViewById(R.id.nama);


//taik nilai text yang di dalam view
        String nama = fnama.getText().toString();

//tampilkan nilai yg diimput

        //Toast.makeText(Form.this, nama, Toast.LENGTH_SHORT).show();


        //pindah intent
        Intent i = new Intent(Form.this, hitung.class);
        i.putExtra("nama", nama); //ini dikirim kesebelah bentuk integer
        startActivity(i);
    }


}
