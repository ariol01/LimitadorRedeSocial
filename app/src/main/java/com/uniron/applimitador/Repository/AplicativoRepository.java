package com.uniron.applimitador.Repository;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class AplicativoRepository {

private Context _context;
ConexaoRepository con;
SQLiteDatabase db;

public   static final String APLICATIVO_REPOSITORY_SCRIPT = "CREATE TABLE tbl_aplicativo (\n" +
        "    pid           INT    PRIMARY KEY,\n" +
        "    nome          STRING NOT NULL,\n" +
        "    tempoExecucao DOUBLE NOT NULL\n" +
        ");\n";


}
