package br.com.geodatapaises;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Criado por Vinicius Lima RA:201313379
 */

public class PaisesDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Paises.db";
    public static final String SQL_CREATE_PAIS =
            "CREATE TABLE " + PaisesContract.PaisEntry.TABLE_NAME + "(" +
                    PaisesContract.PaisEntry._ID + " INTEGER PRIMARY KEY,"+
                    PaisesContract.PaisEntry.COLUMN_NAME_NOME + " TEXT," +
                    PaisesContract.PaisEntry.COLUMN_NAME_REGIAO + " TEXT," +
                    PaisesContract.PaisEntry.COLUMN_NAME_CAPITAL + " TEXT," +
                    PaisesContract.PaisEntry.COLUMN_NAME_CODIGO3 + " TEXT)";
    public static final String SQL_DROP_PAIS =
            "DROP TABLE IF EXISTS " + PaisesContract.PaisEntry.TABLE_NAME;

    public PaisesDbHelper(Context contexto){
        super(contexto, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_PAIS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DROP_PAIS);
        db.execSQL(SQL_CREATE_PAIS);
    }
}