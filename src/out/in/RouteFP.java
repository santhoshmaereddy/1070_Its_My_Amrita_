package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RouteFP extends Activity implements OnClickListener {
	Button getroutebtn,route;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.routemap);
        
        
        
        getroutebtn=(Button) findViewById(R.id.googlemapbtn);
        
        getroutebtn.setOnClickListener(this);
       
        
        
}

	
	
	
	public void onClick(View v) {
		
		if(v.getId()==R.id.googlemapbtn);
		{
			Intent i1= new Intent("out.in.Route");
			startActivity(i1);
		}
		
		
		
		
	}
}
