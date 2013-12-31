package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class IngineumFP extends Activity implements OnClickListener{
	
	Button mech12,mech13,members;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingineumfp);
        mech12=(Button) findViewById(R.id.ingineum12btn);
        mech13=(Button) findViewById(R.id.ingineum134btn);
        members=(Button) findViewById(R.id.ingineumteambtn);
        
        mech12.setOnClickListener(this);
        mech13.setOnClickListener(this);
        members.setOnClickListener(this);
	
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
	
		
		
		if(v.getId()==R.id.ingineum12btn)
		{
			Intent i=new Intent("out.in.Ingineum12");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.ingineum134btn)
		{
			Intent i=new Intent("out.in.Ingineum13");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.ingineumteambtn)
		{
			Intent i=new Intent("out.in.IngineumMembers");
			startActivity(i);
		}	
	}


}
