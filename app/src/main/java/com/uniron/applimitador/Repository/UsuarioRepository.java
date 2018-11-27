package com.uniron.applimitador.Repository;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import com.uniron.applimitador.Models.Usuario;

public class UsuarioRepository {

    private Context _context;
    ConexaoRepository con;
    SQLiteDatabase db;
    long resultado;

    public   static final String USUARIO_REPOSITORY_SCRIPT =  "CREATE TABLE tbl_usuario (\n" +
            "    _id   INT PRIMARY KEY ,\n" +
            "    nome TEXT  NOT NULL\n" +
            ");";




    private static final String NOME_TABELA = "tbl_usuario";


    public UsuarioRepository(Context context){

        _context = context;
        con = new ConexaoRepository(context);
        db = con.getReadableDatabase();

    }



    public long Insert(Usuario usuario){


        try {
            ContentValues contentValues= getContentValues(usuario);

             Usuario u = new Usuario();


            resultado =  db.insert(NOME_TABELA, null,contentValues );
        return  resultado;

        }
        catch ( SQLException erro ){
            Toast.makeText(_context, "Erro ao inserir " +erro.getMessage(), Toast.LENGTH_LONG ).show();
            return 0;

        }


        finally {
            db.close();
        }
    }


    public Usuario SelecionarPorId(int Id){

        try {

            Cursor cursor = db.query(NOME_TABELA ,new String[]{"nome"} , "_id=?", new String[]{String.valueOf(Id)}, null, null, "nome" );
            Usuario usuario = new Usuario();

            if (cursor.moveToFirst()) {
                usuario.setNome(cursor.getString(cursor.getColumnIndex("nome")));
                return  usuario;

            }

            return null;
        }

        catch (SQLException erro){

            Toast.makeText(_context, "Erro ao Selecionar " +erro.getMessage(), Toast.LENGTH_LONG ).show();
            return null;


        }


        finally {
            db.close();
        }


    }


    private ContentValues getContentValues(Usuario u ) {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("nome", u.getNome());

        return contentvalues;
    }

}


