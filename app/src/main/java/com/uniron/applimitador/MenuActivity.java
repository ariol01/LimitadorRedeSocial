package com.uniron.applimitador;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MenuActivity extends Activity {

    ListView listViewOpcoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        listViewOpcoes = findViewById(R.id.ltvMenu);
        listViewOpcoes.setOnItemClickListener(escutadorDeClicks);

    }


    AdapterView.OnItemClickListener escutadorDeClicks = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView <?> parent, View view, int position, long id) {

            if (id == 0) {


                Intent intent = new Intent(MenuActivity.this, PausaProgramadaActivity.class);
                startActivity(intent);


            } else {
                Intent intent = new Intent(MenuActivity.this, RelatorioActivity.class);
                startActivity(intent);

            }


        }


    };


}

