package out.in;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class courses extends Activity implements OnClickListener{
	Button a,b,c,d;
	String branch[]={"CSE","ECE","MEC","EEE","EIE"};
	@Override
    public void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.courses);
        a=(Button)findViewById(R.id.b5);
        b=(Button)findViewById(R.id.b6);
        c=(Button)findViewById(R.id.b7);
        d=(Button)findViewById(R.id.b8);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        
    }
	public void onClick(View v) {
		// TODO Auto-generated method stub
	
		AlertDialog.Builder ob;
		
		switch(v.getId())
		{
			case R.id.b5:
			{
				Intent i=new Intent("in.out.cyear1");
				startActivity(i);
				
				break;
			}
			case R.id.b6:
			{
				ob=new AlertDialog.Builder(this);
				ob.setTitle("Choose branch");
				ob.setItems(branch, new DialogInterface.OnClickListener() {
					
					public void onClick(DialogInterface dialog, int which) {
						
						Toast.makeText(getApplicationContext(), "You have selected "+branch[which]+" branch.", 5000).show();
						if(which==0)
						{
							Intent i=new Intent("in.out.Cyear1cse");
							startActivity(i);
						}
						else if(which==1)
						{
							Intent j=new Intent("in.out.Cyear2ece");
							startActivity(j);
						}
						else if(which==2)
						{
							Intent k=new Intent("in.out.Cyear2mec");
							startActivity(k);
						}
						else if(which==3)
						{
							Intent l=new Intent("in.out.Cyear2eee");
							startActivity(l);
						}
						else if(which==4)
						{
							Intent m=new Intent("in.out.Cyear2eie");
							startActivity(m);
						}
					}
				});
				ob.show();
				break;
			}
			case R.id.b7:
			{
				ob=new AlertDialog.Builder(this);
				ob.setTitle("Choose branch");
				ob.setItems(branch, new DialogInterface.OnClickListener() {
					
					public void onClick(DialogInterface dialog, int which) {
						
						Toast.makeText(getApplicationContext(), "You have selected "+branch[which]+" branch.", 5000).show();
						if(which==0)
						{
							Intent i=new Intent("in.out.TabBarExample");
							startActivity(i);
						}
						else if(which==1)
						{
							Intent j=new Intent("in.out.Cyear3ece");
							startActivity(j);
						}
						else if(which==2)
						{
							Intent k=new Intent("in.out.Cyear3mec");
							startActivity(k);
						}
						else if(which==3)
						{
							Intent l=new Intent("in.out.Cyear3eee");
							startActivity(l);
						}
						else if(which==4)
						{
							Intent m=new Intent("in.out.Cyear3eie");
							startActivity(m);
						}
					}
				});
				ob.show();
				break;
			}
			case R.id.b8:
			{
				ob=new AlertDialog.Builder(this);
				ob.setTitle("Choose branch");
				ob.setItems(branch, new DialogInterface.OnClickListener() {
					
					public void onClick(DialogInterface dialog, int which) {
						
						Toast.makeText(getApplicationContext(), "You have selected "+branch[which]+" branch.", 5000).show();
						if(which==0)
						{
							Intent i=new Intent("in.out.Cyear4cse");
							startActivity(i);
						}
						else if(which==1)
						{
							Intent j=new Intent("in.out.Cyear4ece");
							startActivity(j);
						}
						else if(which==2)
						{
							Intent k=new Intent("in.out.Cyear4mec");
							startActivity(k);
						}
						else if(which==3)
						{
							Intent l=new Intent("in.out.Cyear4eee");
							startActivity(l);
						}
						else if(which==4)
						{
							Intent m=new Intent("in.out.Cyear4eie");
							startActivity(m);
						}
					}
				});
				ob.show();
				break;
			}
		}
	}

	

}
