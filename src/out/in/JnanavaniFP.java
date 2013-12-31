package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class JnanavaniFP extends Activity implements OnClickListener{
	
	Button jnana12,jnan13,members;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jnanavanifp);
        
        
        jnana12=(Button) findViewById(R.id.jnanavani12btn);
        jnan13=(Button) findViewById(R.id.jnanavani134btn);
        members=(Button) findViewById(R.id.jnanavaniteambtn);
        
        jnana12.setOnClickListener(this);
        jnan13.setOnClickListener(this);
        members.setOnClickListener(this);
	}


	
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
	
		
		if(v.getId()==R.id.jnanavani12btn)
		{
			Intent i=new Intent("out.in.Jnanavani12");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.jnanavani134btn)
		{
			Intent i=new Intent("out.in.Jnanavani13");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.jnanavaniteambtn)
		{
			Intent i=new Intent("out.in.JnanavaniMembers");
			startActivity(i);
		}	
	}

}
