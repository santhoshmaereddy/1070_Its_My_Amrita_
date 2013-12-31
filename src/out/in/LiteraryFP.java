package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LiteraryFP extends Activity implements OnClickListener{
	Button lit12,lit13,members;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.literaryfp);
        
        
        lit12=(Button) findViewById(R.id.literary12btn);
        lit13=(Button) findViewById(R.id.literary134btn);
        members=(Button) findViewById(R.id.literaryteambtn);
        
        lit12.setOnClickListener(this);
        lit13.setOnClickListener(this);
        members.setOnClickListener(this);
	}
	public void onClick(View v) {
		// TODO Auto-generated method stub
	
		
		if(v.getId()==R.id.literary12btn)
		{
			Intent i=new Intent("out.in.Literary12");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.literary134btn)
		{
			Intent i=new Intent("out.in.Literary13");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.literaryteambtn)
		{
			Intent i=new Intent("out.in.LiteraryMembers");
			startActivity(i);
		}	
	}
	
}
