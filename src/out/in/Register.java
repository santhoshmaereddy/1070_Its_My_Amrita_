package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Register extends Activity implements OnClickListener{
	
	EditText user,pass;
	Button insert,view;

	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.register);
	        
	        user=(EditText)findViewById(R.id.ed1);
	        pass=(EditText)findViewById(R.id.ed2);
	        insert=(Button)findViewById(R.id.b1);
	        view=(Button)findViewById(R.id.b2);
	        insert.setOnClickListener(this);
	        view.setOnClickListener(this);
	         
	 }

	public void onClick(View v) {
		
		if(v.getId()==R.id.b1)
		{
			DatabaseConnectionProvider dcp=new DatabaseConnectionProvider(this);
			dcp.open();
			String u=user.getText().toString();
			String p=pass.getText().toString();
			long r=dcp.insertData(u, p);
			dcp.close();
			if(r>0)
				Toast.makeText(getApplicationContext(), "Record Inserted Successfully", 5000).show();
		}
		else if(v.getId()==R.id.b2)
		{
			Intent i=new Intent("out.in.ViewDataActivity");
			startActivity(i);
		}
		
	}

}
