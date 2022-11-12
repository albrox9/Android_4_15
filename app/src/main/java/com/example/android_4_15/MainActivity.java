package com.example.android_4_15;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button myAlertBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myAlertBtn = (Button) findViewById(R.id.botonAlerta);
        myAlertBtn.setOnClickListener(view -> alertDialogShow());


    }

    private void alertDialogShow() {

        AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
        alerta.setMessage("¿Te gusta Android?")
                .setCancelable(false)
                .setPositiveButton(("SI"), (dialog, which) -> Toast.makeText(this, "ME ALEGRO MUCHO", Toast.LENGTH_SHORT).show())
                .setNegativeButton(("NO"), (dialog, which) -> Toast.makeText(this, "VETE A WEB", Toast.LENGTH_SHORT).show())
                .setCancelable(true);

            AlertDialog titulo = alerta.create();
            titulo.setTitle("GUSTO POR ANDROID");
            titulo.show();
    }
}


