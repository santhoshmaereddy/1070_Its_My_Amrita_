package out.in;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class Home extends Activity implements OnClickListener {

	Button faculty,courses,timetable,clubs,snapshots,route,feedback,aboutamrita,lib;
	
	
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.home);
	       
	        faculty=(Button) findViewById(R.id.facultabcbtn);
	        courses=(Button) findViewById(R.id.coursesbtn);
	       // timetable=(Button) findViewById(R.id.timetablebtn);
	        clubs=(Button) findViewById(R.id.clubsbtn);
	        snapshots=(Button) findViewById(R.id.snapsbtn);
	        route=(Button) findViewById(R.id.routebtn);
	        feedback=(Button) findViewById(R.id.feedbackbtn);
	        
	        aboutamrita=(Button) findViewById(R.id.aboutamritabtn);
	        lib=(Button) findViewById(R.id.librarybtn);
 
	        faculty.setOnClickListener(this);
	        courses.setOnClickListener(this);
	        //timetable.setOnClickListener(this);
	        clubs.setOnClickListener(this);
	        snapshots.setOnClickListener(this);
	        route.setOnClickListener(this);
	        feedback.setOnClickListener(this);
	       
	        aboutamrita.setOnClickListener(this);
	        lib.setOnClickListener(this);
	   
	        
	 }

	 public void onClick(View v) {
			// TODO Auto-generated method stub
		
		
		if(v.getId()==R.id.facultabcbtn)
		{
			Intent i=new Intent("out.in.AllFaculty");
			startActivity(i);
			
		}

		else if(v.getId()==R.id.coursesbtn)
		{
			Intent i=new Intent("in.out.courses");
			startActivity(i);
		}
		
		/*else if(v.getId()==R.id.timetablebtn)
		{
			Intent i=new Intent("out.in.TimeTableFP");
			startActivity(i);
		}*/
		else if(v.getId()==R.id.clubsbtn)
		{
			Intent i=new Intent("out.in.ClubsForumsFP");
			startActivity(i);
		}
		else if(v.getId()==R.id.snapsbtn)
		{
			Intent i=new Intent("out.in.SnapsFP");
			startActivity(i);
		}
		else if(v.getId()==R.id.routebtn)
		{
			Intent i=new Intent("out.in.RouteFP");
			startActivity(i);
		}
		else if(v.getId()==R.id.feedbackbtn)
		{
			Intent i=new Intent("out.in.FeedbackFP");
			startActivity(i);
		}
	
		else if(v.getId()==R.id.aboutamritabtn)
		{
			Intent i=new Intent("out.in.AmritaHomeActivity");
			startActivity(i);
		}
		else if(v.getId()==R.id.librarybtn)
		{
			Intent i=new Intent("out.in.LibraryActivity");
			startActivity(i);
		
		}
	
	 
	 }
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		MenuInflater menuform=getMenuInflater();
		menuform.inflate(R.layout.menu, menu);
		
		return true;
	}
	
	
	
	public boolean onOptionsItemSelected(MenuItem item)
    {
    	 switch (item.getItemId())
         {
    	 case  R.id.aboutus:
    		 Intent i=new Intent("out.in.AboutUS");
     		startActivity(i);
     		
    		 break;
    	 case  R.id.prefernces:
    		 
    		 Intent p=new Intent("out.in.Prefs");
      		startActivity(p);
    		 
    		 break;
    		 
case  R.id.exit:
	
	 Intent q=new Intent("out.in.Help");
		startActivity(q);
    		
    		 break;
         }
    	 return true;
        
		
		
    }

	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		// TODO Auto-generated method stub
		
		if(item.getItemId()==R.id.aboutus)
    	{
    		Intent i=new Intent("out.in.AboutUS");
    		startActivity(i);
    		return true;
    	}
		return super.onMenuItemSelected(featureId, item);
	}
    
	
	
	
	
	
	
}