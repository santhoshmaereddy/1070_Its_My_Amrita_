package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MovieFP extends Activity implements OnClickListener{

	Button mov12,mov13,members;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moviefp);
        mov12=(Button) findViewById(R.id.movie12btn);
        mov13=(Button) findViewById(R.id.movie134btn);
        members=(Button) findViewById(R.id.movieteambtn);
        
        mov12.setOnClickListener(this);
        mov13.setOnClickListener(this);
        members.setOnClickListener(this);
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
	
		
		if(v.getId()==R.id.movie12btn)
		{
			Intent i=new Intent("out.in.Movie12");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.movie134btn)
		{
			Intent i=new Intent("out.in.Movie13");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.movieteambtn)
		{
			Intent i=new Intent("out.in.MovieMembers");
			startActivity(i);
		}	
	}
}
