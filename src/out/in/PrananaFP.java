package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class PrananaFP extends Activity implements OnClickListener{

	Button pra12,pra13,members;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prananafp);
        pra12=(Button) findViewById(R.id.pranana12btn);
       
        members=(Button) findViewById(R.id.prananateambtn);
        
        pra12.setOnClickListener(this);
       
        members.setOnClickListener(this);
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
	
		
		if(v.getId()==R.id.pranana12btn)
		{
			Intent i=new Intent("out.in.Pranana12");
			startActivity(i);
		}
		
		
		
		else if(v.getId()==R.id.prananateambtn)
		{
			Intent i=new Intent("out.in.PrananaMembers");
			startActivity(i);
		}	
	}
}
