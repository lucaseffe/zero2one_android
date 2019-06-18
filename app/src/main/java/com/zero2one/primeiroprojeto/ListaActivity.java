package com.zero2one.primeiroprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class ListaActivity extends AppCompatActivity {
    private ListView listView;
    private String[] listaDeDados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        listView = (ListView) findViewById(R.id.lista);
        listaDeDados = new String[]{"Dado 1", "Dado 2", "Dado 3", "Dado 4", "Dado 5"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaDeDados);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String data = listaDeDados[position];
                abrirTela(data);
            }
        });
    }
    public void abrirTela(String parametro){
        Intent i = new Intent(getBaseContext(), DoisActivity.class);
        i.putExtra("parametro", parametro);
        startActivity(i);
    }
}
