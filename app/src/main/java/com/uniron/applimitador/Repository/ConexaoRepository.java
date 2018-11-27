package com.uniron.applimitador.Repository;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConexaoRepository extends SQLiteOpenHelper {


    private static  final int VERSAO = 2;
    private static final String NOME_BANCO = "db_medidortempo";
    private Context _context;

    public ConexaoRepository(Context context) {
        super(context, NOME_BANCO, null, VERSAO);

        _context = context;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {


        db.execSQL(AplicativoRepository.APLICATIVO_REPOSITORY_SCRIPT );
        db.execSQL(PausaProgramadaRepository.PAUSAPROGRAMADA_REPOSITORY_SCRIPT );
        db.execSQL(UsuarioRepository.USUARIO_REPOSITORY_SCRIPT);
        db.execSQL(RelatorioRepository.RELATORIO_REPOSITORY_SCRIPT);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
