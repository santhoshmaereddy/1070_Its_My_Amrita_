package out.in;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SnapsFP extends Activity implements android.view.View.OnClickListener{

	
	Button a,b,c;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snapshots);
        a=(Button)findViewById(R.id.b1);
       
        b=(Button)findViewById(R.id.b2);
       
        c=(Button)findViewById(R.id.b3);
      a.setOnClickListener(this);
      b.setOnClickListener(this);
      c.setOnClickListener(this);
	
}
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.b1)
		{
			Intent i=new Intent("out.in.Campus");
			startActivity(i);
		}
		else if(v.getId()==R.id.b2)
		{
			Intent i=new Intent("out.in.ActivitiesImages");
			startActivity(i);
		}
		else if(v.getId()==R.id.b3)
		{
			Intent i=new Intent("out.in.Orientation");
			startActivity(i);
		}
		
	}
}
