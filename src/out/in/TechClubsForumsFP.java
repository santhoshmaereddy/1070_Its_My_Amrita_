package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TechClubsForumsFP extends Activity implements OnClickListener{
	
	Button face,ecif,vidyuth,mech,acrom;
	
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.techclubs);
        
        ecif=(Button) findViewById(R.id.ecifbtn);
        face=(Button) findViewById(R.id.facefpbtn);
        vidyuth=(Button) findViewById(R.id.vidyuthbtn);
        mech=(Button) findViewById(R.id.ingineumbtn);
        acrom=(Button) findViewById(R.id.acrombtn);
        
        ecif.setOnClickListener(this);
        face.setOnClickListener(this);
        vidyuth.setOnClickListener(this);
        mech.setOnClickListener(this);
        acrom.setOnClickListener(this);
	}


	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(v.getId()==R.id.ecifbtn)
		{
			Intent i=new Intent("out.in.ECIFFP");
			startActivity(i);
		}
		else if(v.getId()==R.id.facefpbtn)
		{
			Intent i=new Intent("out.in.FaceForumFP");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.vidyuthbtn)
		{
			Intent i=new Intent("out.in.VidyuthFP");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.ingineumbtn)
		{
			Intent i=new Intent("out.in.IngineumFP");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.acrombtn)
		{
			Intent i=new Intent("out.in.AcromFP");
			startActivity(i);
		}
	}

}
