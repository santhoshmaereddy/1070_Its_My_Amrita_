package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class EcoclubFP extends Activity implements OnClickListener{
	
	Button ecoclub12,ecoclub13,members;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ecoclubfp);

        ecoclub12=(Button) findViewById(R.id.ecoclub12btn);
        ecoclub13=(Button) findViewById(R.id.ecoclub134btn);
        members=(Button) findViewById(R.id.ecoclubteambtn);
        
        ecoclub12.setOnClickListener(this);
        ecoclub13.setOnClickListener(this);
        members.setOnClickListener(this);

        
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
	
		
		if(v.getId()==R.id.ecoclub12btn)
		{
			Intent i=new Intent("out.in.Ecoclub12");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.ecoclub134btn)
		{
			Intent i=new Intent("out.in.Ecoclub13");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.ecoclubteambtn)
		{
			Intent i=new Intent("out.in.EcoclubMembers");
			startActivity(i);
		}	
	}
}
