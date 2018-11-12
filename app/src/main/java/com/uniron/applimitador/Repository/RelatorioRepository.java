package com.uniron.applimitador.Repository;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class RelatorioRepository {

    private Context _context;
    ConexaoRepository con;
    SQLiteDatabase db;

    public   static final String RELATORIO_REPOSITORY_SCRIPT = "CREATE TABLE tbl_relatorio (\n" +
            "    id             INTEGER  PRIMARY KEY AUTOINCREMENT,\n" +
            "    data           DATETIME NOT NULL,\n" +
            "    tempoUtilizado DOUBLE   NOT NULL\n" +
            ");";


}
