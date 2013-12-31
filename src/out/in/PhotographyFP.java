package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PhotographyFP extends Activity implements OnClickListener{
	
	
	Button photo12,photo13,members; 
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photographyfp);
	
        photo12=(Button) findViewById(R.id.photography12btn);
        photo13=(Button) findViewById(R.id.photography134btn);
        members=(Button) findViewById(R.id.photographyteambtn);
        
        photo12.setOnClickListener(this);
        photo13.setOnClickListener(this);
        members.setOnClickListener(this);
	
	}
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
	
		
		if(v.getId()==R.id.photography12btn)
		{
			Intent i=new Intent("out.in.Photography12");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.photography134btn)
		{
			Intent i=new Intent("out.in.Photography13");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.photographyteambtn)
		{
			Intent i=new Intent("out.in.PhotographyMembers");
			startActivity(i);
		}	
	}


}
