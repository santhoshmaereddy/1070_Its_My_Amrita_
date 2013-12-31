package out.in;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class DatabaseConnectionProvider {
	
	String tbName="Login";
	String col1="username";
	String col2="pass";
	Context con;
	DatabaseHelper dbh;
	SQLiteDatabase sld;
	
	DatabaseConnectionProvider(Context c)
	{
		con=c;
	}
	
	DatabaseConnectionProvider open()
	{
		dbh=new DatabaseHelper(con, "Student", null, 1);
		sld=dbh.getWritableDatabase();
		return this;
	}
	
	void close()
	{
		dbh.close();
	}
	
	long insertData(String us,String ps)
	{
		ContentValues cv=new ContentValues();
		cv.put(col1, us);
		cv.put(col2, ps);
		long l=sld.insert(tbName, null, cv);
		return l;
	}
	
	public boolean validateUser(String username, String password){
        Cursor c = sld.rawQuery(
                 "SELECT * FROM " +tbName+ " WHERE "
                         + col1 + "='" + username +"'AND "+col2+"='"+password+"'" ,  null);
        if (c.getCount()>0)
           return true;
        
           return false;
     }
	
	
	String viewData()
	{
		String res="";
		String col[]={col1,col2};
		Cursor c=sld.query(tbName, col, null, null, null, null, null);
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
		{
			res+=c.getString(0)+"    "+c.getString(1)+"\n";
		}
		return res;
	}
	
	
	
	class DatabaseHelper extends SQLiteOpenHelper
	{

		public DatabaseHelper(Context context, String name,
				CursorFactory factory, int version) {
			super(context, name, factory, version);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			
			db.execSQL("create table "+tbName+" ( "+col1+" Text primary key, "+col2+" Text)");
			
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
