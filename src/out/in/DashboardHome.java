package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class DashboardHome extends Activity{
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        
        
        
        
     // Dashboard Faculty button
        Button btn_faculty = (Button) findViewById(R.id.facultybtn);
        
        // Dashboard Courses button
        Button btn_courses = (Button) findViewById(R.id.syllabusbtn);
        
        // Dashboard Clubs And Forums button
        Button btn_clubs = (Button) findViewById(R.id.clubsbtn);
        
        // Dashboard routemap button
        Button btn_route = (Button) findViewById(R.id.snapsbtn);
        
        // Dashboard Feedback button
        Button btn_feedback = (Button) findViewById(R.id.feedbackbtn);
        
        // Dashboard Photos button
        Button btn_photos = (Button) findViewById(R.id.snapsbtn);
        
        /**
         * Handling all button click events
         * */
        
        // Listening to Faculty button click
        btn_faculty.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching Faculty Screen
				Intent i = new Intent(getApplicationContext(), AllFaculty.class);
				startActivity(i);
			}
		});
        
       // Listening Courses button click
        btn_courses.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching Courses Screen
				Intent i = new Intent(getApplicationContext(), courses.class);
				startActivity(i);
			}
		});
        
        // Listening ForumsFP button click
        btn_clubs.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching ForumsFP Screen
				Intent i = new Intent(getApplicationContext(), ClubsForumsFP.class);
				startActivity(i);
			}
		});
        
        // Listening to Feedback button click
        btn_feedback.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching Feedback Screen
				Intent i = new Intent(getApplicationContext(), FeedbackFP.class);
				startActivity(i);
			}
		});
        
        // Listening to Snapshots button click
        btn_photos.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching Snapshots Screen
				Intent i = new Intent(getApplicationContext(), SnapsFP.class);
				startActivity(i);
			}
		});
        
        // Listening to RouteFP button click
        btn_route.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching RouteFP Screen
				Intent i = new Intent(getApplicationContext(), RouteFP.class);
				startActivity(i);
			}
		});
 
        
        
	}

}
