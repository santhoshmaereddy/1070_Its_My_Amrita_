package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PressFP extends Activity implements OnClickListener{
	
	
	Button press12,press13,members;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pressfp);
        
        
        press12=(Button) findViewById(R.id.press12btn);
        press13=(Button) findViewById(R.id.press134btn);
        members=(Button) findViewById(R.id.pressteambtn);
        
        press12.setOnClickListener(this);
        press13.setOnClickListener(this);
        members.setOnClickListener(this);
	}


	public void onClick(View v) {
		
		if(v.getId()==R.id.press12btn)
		{
			Intent i=new Intent("out.in.Press12");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.press134btn)
		{
			Intent i=new Intent("out.in.Press13");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.pressteambtn)
		{
			Intent i=new Intent("out.in.PressMembers");
			startActivity(i);
		}	
	}

	
	

}
