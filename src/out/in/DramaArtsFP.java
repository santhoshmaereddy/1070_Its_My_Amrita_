package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DramaArtsFP extends Activity implements OnClickListener{
	
	Button drama12,drama13,members;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dramaartsfp);
        
        
        drama12=(Button) findViewById(R.id.drama12btn);
       
        members=(Button) findViewById(R.id.dramateambtn);
        
        drama12.setOnClickListener(this);
       
        members.setOnClickListener(this);
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
	
		
		if(v.getId()==R.id.drama12btn)
		{
			Intent i=new Intent("out.in.DramaArts12");
			startActivity(i);
		}
		
		
		else if(v.getId()==R.id.dramateambtn)
		{
			Intent i=new Intent("out.in.DramaMembers");
			startActivity(i);
		}	
	}

	
	
}
