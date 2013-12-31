package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class VidyuthFP extends Activity implements OnClickListener{
	
	Button vidyuth12,vidyuth13,members;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vidyuthfp);
        
        vidyuth12=(Button) findViewById(R.id.vidyuth12btn);
        vidyuth13=(Button) findViewById(R.id.vidyuth134btn);
        members=(Button) findViewById(R.id.vidyuthteambtn);
        
        vidyuth12.setOnClickListener(this);
        vidyuth13.setOnClickListener(this);
        members.setOnClickListener(this);
	
	}

	public void onClick(View v) {
		
		
		if(v.getId()==R.id.vidyuth12btn)
		{
			Intent i=new Intent("out.in.Vidyuth12");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.vidyuth134btn)
		{
			Intent i=new Intent("out.in.Vidyuth13");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.vidyuthteambtn)
		{
			Intent i=new Intent("out.in.VidyuthMembers");
			startActivity(i);
		}	
	}

}
