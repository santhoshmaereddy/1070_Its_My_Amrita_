package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FeedbackFP extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    EditText e1;
    
	Button b;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);
        
        e1=(EditText) findViewById(R.id.feedtxt);
        b=(Button) findViewById(R.id.submitbtn);
        
        b.setOnClickListener(this);
        
        
    }

	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(v.getId()==R.id.submitbtn)
		{
			String dest = "itsmyamrita@gmail.com";
			
			String body = e1.getText().toString();
			
			String s="@sendmail itsmyamrita@gmail.com "+ body;
			//Toast.makeText(getApplicationContext(), s, 70000).show();
			 
			if(body.length()>0)
			{
			
			//Toast.makeText(getApplicationContext(), s, 70000).show();
			sendSMS("9243342000", s); 
			((EditText) findViewById(R.id.feedtxt)).setText("");
			}
			else
			{
				Toast.makeText(getApplicationContext(), "Please enter a Valid Feedback", 70000).show();
			}
		
		}
	
	}
	
	
	public void sendSMS(String phoneNumber, String r) {
		   

	    SmsManager smsManager = SmsManager.getDefault();
	    smsManager.sendTextMessage(phoneNumber, null, r, null, null);
	    Toast.makeText(getApplicationContext(), "Mail Sent To ItsMyAmrita We Sincerly Thank u for Your Valuable Feedback! ", Toast.LENGTH_LONG).show();
	    
	}
}


