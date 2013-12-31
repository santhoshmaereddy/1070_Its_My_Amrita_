package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ClubsForumsFP extends Activity implements OnClickListener{
	Button tech,amritadara;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clubsforumsfp);
        
        tech=(Button) findViewById(R.id.techclubsbtn);
        amritadara=(Button) findViewById(R.id.amritadarabtn);
        
        tech.setOnClickListener(this);
        amritadara.setOnClickListener(this);
        

}

	public void onClick(View v) {
		// TODO Auto-generated method stub
	
		
		if(v.getId()==R.id.techclubsbtn)
		{
			Intent i=new Intent("out.in.TechClubsForumsFP");
			startActivity(i);
			
		}
		else if(v.getId()==R.id.amritadarabtn)
		{
			Intent i=new Intent("out.in.AmritadaraFP");
			startActivity(i);
			
		}
		
		
	}

}