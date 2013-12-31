package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SpicmacayFP extends Activity implements OnClickListener{
	
	
	Button spic12,spic13,members;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spicmacayfp);
        
        spic12=(Button) findViewById(R.id.spicmacay12btn);
        spic13=(Button) findViewById(R.id.spicmacay134btn);
        members=(Button) findViewById(R.id.spicmacayteambtn);
        
        spic12.setOnClickListener(this);
        spic13.setOnClickListener(this);
        members.setOnClickListener(this);
        
	}

	public void onClick(View v) {
		
		if(v.getId()==R.id.spicmacay12btn)
		{
			Intent i=new Intent("out.in.Spicmacay12");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.spicmacay134btn)
		{
			Intent i=new Intent("out.in.Spicmacay13");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.spicmacayteambtn)
		{
			Intent i=new Intent("out.in.SpicmacayMembers");
			startActivity(i);
		}	
	}

	
}
