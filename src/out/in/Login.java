package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends Activity implements OnClickListener{
	
	EditText userentered,passentered;
	Button loggedin;

	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.login);
	        
	        userentered=(EditText) findViewById(R.id.user1);
	        passentered=(EditText) findViewById(R.id.pass1);
	        
	        loggedin=(Button) findViewById(R.id.loginhome);
	        loggedin.setOnClickListener(this);
	        
	        
	       
	 }

	 public void onClick(View v) {
			// TODO Auto-generated method stub
		
		
		if(v.getId()==R.id.loginhome)
		{
			DatabaseConnectionProvider dcp=new DatabaseConnectionProvider(this);

			String uname = userentered.getText().toString();
            String pass = passentered.getText().toString();
			
            if(uname.equals("") || uname == null){
                Toast.makeText(getApplicationContext(), "email Empty", Toast.LENGTH_SHORT).show();
			}
            else if(pass.equals("") || pass == null){
                Toast.makeText(getApplicationContext(), "Empty Password", Toast.LENGTH_SHORT).show();
			}	
            else if(dcp.validateUser(uname,pass))
            {
            	Intent l1=new Intent("out.in.CseFaculty");
        		
        		
            	startActivity(l1);

            }
            
            
            
            
            
            
            
            
            
	}

}
}
