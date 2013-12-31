package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MusicFP extends Activity implements OnClickListener{
	
	Button music12,music13,members;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musicfp);
        
        music12=(Button) findViewById(R.id.music12btn);
        music13=(Button) findViewById(R.id.music134btn);
        members=(Button) findViewById(R.id.musicteambtn);
        
        music12.setOnClickListener(this);
        music13.setOnClickListener(this);
        members.setOnClickListener(this);
	}

	
	public void onClick(View v) {
		// TODO Auto-generated method stub
	
		
		if(v.getId()==R.id.music12btn)
		{
			Intent i=new Intent("out.in.Music12");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.music134btn)
		{
			Intent i=new Intent("out.in.Music13");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.musicteambtn)
		{
			Intent i=new Intent("out.in.MusicMembers");
			startActivity(i);
		}	
	}

}
