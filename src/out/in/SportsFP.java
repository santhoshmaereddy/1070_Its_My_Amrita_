package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;





public class SportsFP extends Activity implements OnClickListener{
	
	 Button sports12,sports13,members;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sportsfp);
        
        sports12=(Button) findViewById(R.id.sports12btn);
        sports13=(Button) findViewById(R.id.sports134btn);
        members=(Button) findViewById(R.id.sportsteambtn);
        
        sports12.setOnClickListener(this);
        sports13.setOnClickListener(this);
        members.setOnClickListener(this);
        
	}

	public void onClick(View v) {
		
		if(v.getId()==R.id.sports12btn)
		{
			Intent i=new Intent("out.in.Sports12");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.sports134btn)
		{
			Intent i=new Intent("out.in.Sports13");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.sportsteambtn)
		{
			Intent i=new Intent("out.in.SportsMembers");
			startActivity(i);
		}	
	}

		
		
	}

