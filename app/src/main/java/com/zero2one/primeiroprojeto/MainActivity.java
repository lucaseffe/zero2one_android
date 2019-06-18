package com.zero2one.primeiroprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btNovaAtividade;
    private Button btNovaAtividadeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btNovaAtividade = (Button) findViewById(R.id.bt_teladois);
        btNovaAtividade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirAtividadeDois("Parâmetro 1");
            }
        });

        btNovaAtividadeb = (Button) findViewById(R.id.bt_teladoisb);
        btNovaAtividadeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirAtividadeDois("Parâmetro 2");
            }
        });

        btNovaAtividadeb = (Button) findViewById(R.id.bt_abrelista);
        btNovaAtividadeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTelaLista();
            }
        });
    }

    public void abrirAtividadeDois(String parametro){
        //Toast.makeText(this, "Abrindo tela 2", Toast.LENGTH_LONG).show();
        Intent i = new Intent(getBaseContext(), DoisActivity.class);
        i.putExtra("parametro", parametro);
        startActivity(i);
    }

    public void abrirTelaLista(){
        Intent i = new Intent(getBaseContext(), ListaActivity.class);
        startActivity(i);
    }
}