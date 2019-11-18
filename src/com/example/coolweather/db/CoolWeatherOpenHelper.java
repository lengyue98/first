package com.example.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper{
	public static final String CREATE_PROVTNCE = "create table Privince("
			+"id integer primary key autoincrement,"
			+"province_name text"
			+"province_code text";
	public static final String CREATE_CITY = "create table City("
			+"id integer primary key autoincrement,"
			+"City_name text"
			+"City_code text"
			+"province_id integer)";
	public static final String CREATE_COUNTRY = "create table Country("
			+"id integer primary key autoincrement,"
			+"country_name text"
			+"country_code text"
			+"city_id integer)";
	public CoolWeatherOpenHelper(Context context,String name,CursorFactory factory,
			int version) {
		super(context,name,factory,version);
	}
	
			
	@Override
	public void onCreate(SQLiteDatabase db){
		db.execSQL(CREATE_PROVTNCE);
		db.execSQL(CREATE_CITY);
		db.execSQL(CREATE_COUNTRY);
	}
	@Override
	public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
		
	}

}
