package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AcromFP extends Activity implements OnClickListener{

Button acrom12,acrom13,members;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acromfp);
        acrom12=(Button) findViewById(R.id.acrom12btn);
        acrom13=(Button) findViewById(R.id.acrom134btn);
        members=(Button) findViewById(R.id.acromteambtn);
        
        acrom12.setOnClickListener(this);
        acrom13.setOnClickListener(this);
        members.setOnClickListener(this);
	
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(v.getId()==R.id.acrom12btn)
		{
			Intent i=new Intent("out.in.Acrom12");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.acrom134btn)
		{
			Intent i=new Intent("out.in.Acrom13");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.acromteambtn)
		{
			Intent i=new Intent("out.in.AcromMembers");
			startActivity(i);
		}	
		
	}
	
	

}