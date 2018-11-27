package com.uniron.applimitador;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.uniron.applimitador.Models.Aplicativo;
import com.uniron.applimitador.Models.Usuario;
import com.uniron.applimitador.Repository.UsuarioRepository;


public class InicioActivity extends Activity implements View.OnClickListener {



    ImageButton configuracoes;
    Button btnBuscarApp,btnSalvar;
    UsuarioRepository usuarioRepository;
    EditText usuarioNome, numExecaucaoApp;
    int id;


    private Application.ActivityLifecycleCallbacks myLifecycleHandler;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
         usuarioRepository = new UsuarioRepository(this);
        CaputrarElementos();


    }


    public  void CaputrarElementos(){
        configuracoes = findViewById(R.id.imgbtnConfiguracoes);
        btnBuscarApp = findViewById(R.id.btnBuscarAplicativos);
        btnSalvar = findViewById(R.id.btnSalvarNome);
        usuarioNome = findViewById(R.id.edtUsuario);
        numExecaucaoApp = findViewById(R.id.edtNumExecucaoApp);
        btnSalvar.setOnClickListener(this);
        configuracoes.setOnClickListener(this);
        btnBuscarApp.setOnClickListener(this);

    }

   private void CapturarUsuario(int Usuarioid){

        Usuarioid = id;

        if ( id != 0)
        {

            Usuario usuario = new Usuario();
            usuario = usuarioRepository.SelecionarPorId(id);
            numExecaucaoApp.setText(usuario.getNome().toString());


        }




    }

   // @android.support.annotation.RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onClick(View v) {

       switch (v.getId()){
           case R.id.btnBuscarAplicativos:

               String teste ="";
               Aplicativo aplicativo = new Aplicativo();
               teste =  aplicativo.getCurProcessName(this);
               numExecaucaoApp = findViewById(R.id.edtNumExecucaoApp);
               numExecaucaoApp.setText(teste);
               Toast.makeText(this, "Erro ao escolher uma opção " , Toast.LENGTH_LONG).show();




               break;

           case R.id.imgbtnConfiguracoes:
               Intent intent = new Intent(this, MenuActivity.class);
               startActivity(intent);
               break;

           case R.id.btnSalvarNome:


               Usuario usuario = new Usuario();
               usuario.setNome(usuarioNome.getText().toString());

               long usuarioID = usuarioRepository.Insert(usuario);
               id = (int) usuarioID;


              Toast.makeText(this, "id:  "+ String.valueOf(usuarioID) + " nome: " , Toast.LENGTH_LONG).show();




               break;

               default:
                   Toast.makeText(this, "Erro ao escolher uma opção " , Toast.LENGTH_LONG).show();

       }


    }


}

