package com.ivi.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button boton_inicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton_inicio=findViewById(R.id.boton_iniciar);

    }
    public void IniciarActivity(View view){
        Intent iniciar_activity = new Intent(this, MainActivity2.class);
        startActivity(iniciar_activity);
    }
}