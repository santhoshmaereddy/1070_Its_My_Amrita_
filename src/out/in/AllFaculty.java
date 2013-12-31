package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AllFaculty extends Activity implements OnClickListener{

	Button csbtn,ecebtn,eeebtn,mechbtn,engbtn,civbtn,matbtn,phybtn,chmbtn,cirbtn,cultbtn;
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.allfaculty);
	
	        
	        csbtn=(Button) findViewById(R.id.csebtn);
	        ecebtn=(Button) findViewById(R.id.ecebtn);
	        eeebtn=(Button) findViewById(R.id.eeebtn);
	        mechbtn=(Button)findViewById(R.id.mechbtn);
	        engbtn=(Button)findViewById(R.id.englishbtn);
	        civbtn=(Button)findViewById(R.id.civilbtn);
	        matbtn=(Button)findViewById(R.id.mathsbtn);
	        phybtn=(Button)findViewById(R.id.physicsbtn);
	        chmbtn=(Button)findViewById(R.id.chemistrybtn);
	        cirbtn=(Button)findViewById(R.id.cirbtn);
	        cultbtn=(Button)findViewById(R.id.cultbtn);
	        
	        csbtn.setOnClickListener(this);
	        ecebtn.setOnClickListener(this);
	        eeebtn.setOnClickListener(this);
	        mechbtn.setOnClickListener(this);
	        engbtn.setOnClickListener(this);
	        civbtn.setOnClickListener(this);
	        matbtn.setOnClickListener(this);
	        phybtn.setOnClickListener(this);
	        chmbtn.setOnClickListener(this);
	        cultbtn.setOnClickListener(this);
	        cirbtn.setOnClickListener(this);
	        
	        
	        
}

	 public void onClick(View v) {
			// TODO Auto-generated method stub
			
		
		
		if(v.getId()==R.id.csebtn)
		{
			Intent i=new Intent("out.in.CseFaculty");
			startActivity(i);
			
		}
		else if(v.getId()==R.id.ecebtn)
		{
			Intent i=new Intent("out.in.EceFaculty");
			startActivity(i);
			
		}
		else if(v.getId()==R.id.eeebtn)
		{
			Intent i=new Intent("out.in.EEEFaculty");
			startActivity(i);
			
		}
		
		else if(v.getId()==R.id.mechbtn)
		{
			Intent i=new Intent("out.in.MechFaculty");
			startActivity(i);
			
		}

		else if(v.getId()==R.id.englishbtn)
		{
			Intent i=new Intent("out.in.EnglishFaculty");
			startActivity(i);
			
		}
		else if(v.getId()==R.id.civilbtn)
		{
			Intent i=new Intent("out.in.CivilFaculty");
			startActivity(i);
			
		}
		else if(v.getId()==R.id.mathsbtn)
		{
			Intent i=new Intent("out.in.MathFaculty");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.physicsbtn)
		{
			Intent i=new Intent("out.in.PhysicsFaculty");
			startActivity(i);
		}
		else if(v.getId()==R.id.chemistrybtn)
		{
			Intent i=new Intent("out.in.ChemistryFaculty");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.cultbtn)
		{
			Intent i=new Intent("out.in.CulturalFaculty");
			startActivity(i);
		}
		else if(v.getId()==R.id.cirbtn)
		{
			Intent i=new Intent("out.in.CIRFaculty");
			startActivity(i);
		}
		
	}
}
