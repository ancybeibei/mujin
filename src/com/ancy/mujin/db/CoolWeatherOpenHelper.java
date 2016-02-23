package com.ancy.mujin.db;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

	public static final String CREATE_PROVINCE = "create teble province ("
			            +"id integer primary key autoincrement,"
			            +"province_name text,"
			            +"province_code text)";
	public static final String CREATE_CITY = "create table city ("
			            +"id integer primary key autoincrement,"
			            +"id city_name text,"
			            +"id_code text,"
			            +"province_id integer)";
	public static final String CREATE_COUNTY = "create table county("
			            +"id integer primary key antoincrement,"
			            +"county_name text,"
			            +"county_code text,"
			            +"city_id integer)";
	
	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
       db.execSQL(CREATE_PROVINCE);
       db.execSQL(CREATE_CITY);
       db.execSQL(CREATE_COUNTY);
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

}
