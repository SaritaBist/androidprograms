package com.sarita.databasepraactice;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDBHelper extends SQLiteOpenHelper {
    private static final String dataBase_name="sarita";
    private static final int  dataBase_version=1;
    private static final String table_name="Student";
    private static final String Id_col="id";
    private static final String Name_col="name";
    private static final String Roll_col="roll";
    private static final String Level_col="level";


    public MyDBHelper(Context context) {

        super(context, dataBase_name, null, dataBase_version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "CREATE TABLE " +table_name+"("+Id_col +" INTEGER PRIMARY KEY AUTOINCREMENT,"+Name_col+" TEXT,"+Roll_col+" TEXT,"+Level_col+" TEXT)";
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void AddNewStudent(String sname,String slevel,String sroll)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(Name_col,sname);
        values.put(Roll_col,sroll);
        values.put(Level_col,slevel);
        db.insert(table_name,null,values);
        db.close();
    }
    public Cursor viewStudent()
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor resultSet=db.rawQuery("select * from "+table_name,null);
        resultSet.moveToFirst();
        return  resultSet;
    }

}
