package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class ECIFFP extends Activity implements OnClickListener{

	Button ecif12,ecif13,members;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eciffp);
        ecif12=(Button) findViewById(R.id.ecif12btn);
        ecif13=(Button) findViewById(R.id.ecif134btn);
        members=(Button) findViewById(R.id.ecifteambtn);
        
        ecif12.setOnClickListener(this);
        ecif13.setOnClickListener(this);
        members.setOnClickListener(this);
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
	
		
		if(v.getId()==R.id.ecif12btn)
		{
			Intent i=new Intent("out.in.ECIF12");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.ecif134btn)
		{
			Intent i=new Intent("out.in.ECIF13");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.ecifteambtn)
		{
			Intent i=new Intent("out.in.ECIFMembers");
			startActivity(i);
		}	
	}
}
