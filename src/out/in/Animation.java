package out.in;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class Animation extends Activity{
	MediaPlayer ourSong;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.animation);
		
		
		ourSong=MediaPlayer.create(Animation.this, R.raw.song);
		
		SharedPreferences getPrefs=PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		
		boolean music=getPrefs.getBoolean("checkbox", true);
		
		if(music==true)
		{
		ourSong.start();
		}
	
		
		
		Thread timer=new Thread(){
			public void run(){
				try{
					sleep(2500);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				finally{
					Intent i =new Intent("out.in.Home");
					startActivity(i);
				}
			}
		};
		timer.start();
		
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		
		finish();
	}
	

}
