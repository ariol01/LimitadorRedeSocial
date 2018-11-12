package com.uniron.applimitador.Repository;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class PausaProgramadaRepository {


    private Context _context;
    ConexaoRepository con;
    SQLiteDatabase db;

    public   static final String PAUSAPROGRAMADA_REPOSITORY_SCRIPT = "CREATE TABLE tbl_pausaprogramada (\n" +
            "    id    INT    PRIMARY KEY,\n" +
            "    tempo DOUBLE NOT NULL\n" +
            ");";


}
