package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AmritaAppActivity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    Button a,b,c,d;
	@Override
    public void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        a=(Button)findViewById(R.id.b1);
        b=(Button)findViewById(R.id.b2);
        c=(Button)findViewById(R.id.b3);
        d=(Button)findViewById(R.id.b4);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        
    }

	public void onClick(View v) {
		// TODO Auto-generated method stub
	
		if(v.getId()==a.getId())
		{
			
			
		}
		else if(v.getId()==b.getId())
		{
			Intent i=new Intent("in.out.courses");
			startActivity(i);
		}
		else if(v.getId()==c.getId())
		{
			
		}
		else if(v.getId()==d.getId())
		{
			
		}
	}
}