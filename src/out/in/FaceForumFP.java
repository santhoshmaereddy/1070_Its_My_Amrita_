package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FaceForumFP extends Activity implements OnClickListener{

Button face12,face13,members;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faceforumfp);
        face12=(Button) findViewById(R.id.face12btn);
        face13=(Button) findViewById(R.id.face134btn);
        members=(Button) findViewById(R.id.faceteambtn);
        
        face12.setOnClickListener(this);
        face13.setOnClickListener(this);
        members.setOnClickListener(this);
	
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
	
		
		if(v.getId()==R.id.face12btn)
		{
			Intent i=new Intent("out.in.Face12");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.face134btn)
		{
			Intent i=new Intent("out.in.Face13");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.faceteambtn)
		{
			Intent i=new Intent("out.in.FaceMembers");
			startActivity(i);
		}	
	}

}
