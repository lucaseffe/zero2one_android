package com.zero2one.primeiroprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DoisActivity extends AppCompatActivity {
    private Button btVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doislayout);

        Intent intent = getIntent();
        String parametro = intent.getStringExtra("parametro");
        Toast.makeText(this, parametro, Toast.LENGTH_LONG).show();

        btVoltar = (Button) findViewById(R.id.bt_voltar);

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirMain();
            }
        });
    }

    public void abrirMain(){
        //Toast.makeText(this, "Abrindo tela principal", Toast.LENGTH_LONG).show();
        Intent i = new Intent(getBaseContext(), MainActivity.class);
        startActivity(i);
    }
}
