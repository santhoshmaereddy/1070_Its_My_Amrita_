package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DanceFP extends Activity implements OnClickListener{
	
	
	Button dance12,dance13,members;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dancefp);
        dance12=(Button) findViewById(R.id.dance12btn);
        
        members=(Button) findViewById(R.id.danceteambtn);
        
        dance12.setOnClickListener(this);
        
        members.setOnClickListener(this);
        
        
	}
	public void onClick(View v) {
		// TODO Auto-generated method stub
	
		
		if(v.getId()==R.id.dance12btn)
		{
			Intent i=new Intent("out.in.Dance12");
			startActivity(i);
		}
		
		
		else if(v.getId()==R.id.danceteambtn)
		{
			Intent i=new Intent("out.in.DanceMembers");
			startActivity(i);
		}	
	}


}
