package com.ivi.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity2 extends AppCompatActivity {
    Button boton_agr;
    EditText edTxt1;
    EditText edTxt2;
    EditText edTxt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        boton_agr=findViewById(R.id.boton_add);
        edTxt1=findViewById(R.id.edittext1);
        edTxt2=findViewById(R.id.edittext2);
        edTxt2=findViewById(R.id.edittext3);

        boton_agr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Bundle enviarDatos = new Bundle ();
                enviarDatos.putString("keyDatos", edTxt1.getText().toString());
                enviarDatos.putString("keyDatos", edTxt2.getText().toString());
                enviarDatos.putString("keyDatos", edTxt3.getText().toString());

                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtras(enviarDatos);
                startActivity(intent);
            }
        });

    }
}