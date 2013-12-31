package out.in;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.os.Handler;
import java.util.Timer;
import java.util.TimerTask;

public class activityslideshow extends Activity {
	
	public int currentimageindex=0;
	Timer timer;
	TimerTask task;
	ImageView slidingimage;
	
	private int[] IMAGE_IDS = {
			R.drawable.act1, R.drawable.act2, R.drawable.act3,
			R.drawable.act4,R.drawable.act5, R.drawable.act6, R.drawable.act7,
			R.drawable.act8
		};
	
	
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slideshow);
        final Handler mHandler = new Handler();

        // Create runnable for posting
        final Runnable mUpdateResults = new Runnable() {
            public void run() {
            	
            	AnimateandSlideShow();
            	
            }
        };
		
        int delay = 1000; // delay for 1 sec.

        int period = 4000; // repeat every 4 sec.

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {

        public void run() {

        	 mHandler.post(mUpdateResults);

        }

        }, delay, period);
        
		 
		       
    }

    public void onClick(View v) {
    
        finish();
        android.os.Process.killProcess(android.os.Process.myPid());
      }
    
    /**
     * Helper method to start the animation on the splash screen
     */
    private void AnimateandSlideShow() {
    	
    	
    	slidingimage = (ImageView)findViewById(R.id.ImageView3_Left);
   		slidingimage.setImageResource(IMAGE_IDS[currentimageindex%IMAGE_IDS.length]);
   		
   		currentimageindex++;
    	
   		Animation rotateimage = AnimationUtils.loadAnimation(this, R.anim.custom_anim);
    	  
        
    	  slidingimage.startAnimation(rotateimage);
          
          	 
        
    }
    
     
    
    
}