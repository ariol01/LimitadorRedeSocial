package com.uniron.applimitador.Repository;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class UsuarioRepository {

    private Context _context;
    ConexaoRepository con;
    SQLiteDatabase db;

    public   static final String USUARIO_REPOSITORY_SCRIPT =  "CREATE TABLE tbl_usuario (\n" +
            "    id   INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
            "    nome STRING  NOT NULL\n" +
            ");";


}


