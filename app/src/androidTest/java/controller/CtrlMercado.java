package controller;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import model.Empresa;

public class CtrlMercado {

    private List<Empresa> listEmprsa = new ArrayList<>();

    public static List<Empresa> getEmpresa (Context context){
        List<Empresa> list = new ArrayList<>();
        SQLiteDatabase db = new DBSQLite(context).getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM Empresa", null);

        if (cursor.moveToFirst()){
            do{
                long id = cursor.getLong(cursor.getColumnIndexOrThrow("id"));
                String nombre = cursor.getString(cursor.getColumnIndexOrThrow("nombre"));
                int facturacion = cursor.getInt(cursor.getColumnIndexOrThrow("facturacion"));
                long id_sector = cursor.getLong(cursor.getColumnIndexOrThrow("sector_id"));
            }while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return list;
    }
}
