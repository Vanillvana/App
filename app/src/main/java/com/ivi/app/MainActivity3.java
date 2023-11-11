package com.ivi.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity3 extends AppCompatActivity {

    TextView txtDatos1;
    TextView txtDatos2;
    TextView txtDatos3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txtDatos1 = findViewById(R.id.d1);
        txtDatos2 = findViewById(R.id.d2);
        txtDatos3 = findViewById(R.id.d3);

        Bundle datosNuevos = getIntent().getExtras();
        String data = datosNuevos.getString("keyDatos");

        txtDatos1.setText(data);
    }
}