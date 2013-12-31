package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AmritadaraFP extends Activity implements OnClickListener{
	
	Button music,dramaarts,dance,photography,literary,press,spicmacay,jnanavani,ecoclub,sports,pranana,movie;
	
	
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.amritadharafp);
        
        music=(Button) findViewById(R.id.musicbtn);
        dramaarts=(Button) findViewById(R.id.dramabtn);
        dance=(Button) findViewById(R.id.dancebtn);
        photography=(Button) findViewById(R.id.photographybtn);
        literary=(Button) findViewById(R.id.literarybtn);
        press=(Button) findViewById(R.id.pressbtn);
        spicmacay=(Button) findViewById(R.id.spicmacaybtn);
        jnanavani=(Button) findViewById(R.id.jnanavanibtn);
        ecoclub=(Button) findViewById(R.id.ecoclubbtn);
        sports=(Button) findViewById(R.id.sportsbtn);
        pranana=(Button) findViewById(R.id.prananabtn);
        movie=(Button) findViewById(R.id.moviebtn);
        
        
        
        music.setOnClickListener(this);
        dramaarts.setOnClickListener(this);
        dance.setOnClickListener(this);
        photography.setOnClickListener(this);
        literary.setOnClickListener(this);
        press.setOnClickListener(this);
        spicmacay.setOnClickListener(this);
        jnanavani.setOnClickListener(this);
        ecoclub.setOnClickListener(this);
        sports.setOnClickListener(this);
        
        pranana.setOnClickListener(this);
        movie.setOnClickListener(this);
        
       
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
	
		
		if(v.getId()==R.id.musicbtn)
		{
			Intent i=new Intent("out.in.MusicFP");
			startActivity(i);
		}
		else if(v.getId()==R.id.dramabtn)
		{
			Intent i=new Intent("out.in.DramaArtsFP");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.dancebtn)
		{
			Intent i=new Intent("out.in.DanceFP");
			startActivity(i);
		}
		else if(v.getId()==R.id.photographybtn)
		{
			Intent i=new Intent("out.in.PhotographyFP");
			startActivity(i);
		}
		else if(v.getId()==R.id.literarybtn)
		{
			Intent i=new Intent("out.in.LiteraryFP");
			startActivity(i);
		}
		else if(v.getId()==R.id.pressbtn)
		{
			Intent i=new Intent("out.in.PressFP");
			startActivity(i);
		}
		else if(v.getId()==R.id.spicmacaybtn)
		{
			Intent i=new Intent("out.in.SpicmacayFP");
			startActivity(i);
		}
		else if(v.getId()==R.id.jnanavanibtn)
		{
			Intent i=new Intent("out.in.JnanavaniFP");
			startActivity(i);
		}
		else if(v.getId()==R.id.ecoclubbtn)
		{
			Intent i=new Intent("out.in.EcoclubFP");
			startActivity(i);
		}
		else if(v.getId()==R.id.sportsbtn)
		{
			Intent i=new Intent("out.in.SportsFP");
			startActivity(i);
		}
		else if(v.getId()==R.id.prananabtn)
		{
			Intent i=new Intent("out.in.PrananaFP");
			startActivity(i);
		}
		else if(v.getId()==R.id.moviebtn)
		{
			Intent i=new Intent("out.in.MovieFP");
			startActivity(i);
		}
		
		
		
		
		
	}


}
