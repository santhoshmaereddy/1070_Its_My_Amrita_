package out.in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class activities extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
	ImageView contentImage;
	Button a,b;
    @Override        
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.gridview);
            contentImage=(ImageView)findViewById(R.id.contentImage);
        
            //a.setOnClickListener(this);
            //b.setOnClickListener(this);
            
            GridView gridview = (GridView) findViewById(R.id.gridview);
            gridview.setAdapter(new ImageAdapter(this));

            gridview.setOnItemClickListener(new OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                    Toast.makeText(activities.this, "" + position, Toast.LENGTH_SHORT).show();
                    if(position==0)
                    {
                    	setContentView(R.layout.zoom1);
            			contentImage=(ImageView)findViewById(R.id.contentImage);
            			contentImage.setImageResource(R.drawable.act1);
            			a=(Button)findViewById(R.id.b1);
        	            b=(Button)findViewById(R.id.b2);
            			a.setOnClickListener(new OnClickListener() {
            				
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent i=new Intent("out.in.activities");
								startActivity(i);
							}
						});
            			b.setOnClickListener(new OnClickListener() {
							
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent j=new Intent("out.in.activityslideshow");
								startActivity(j);
								
							}
						});
            			contentImage.setOnClickListener(new OnClickListener() {
							
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent k=new Intent("out.in.a1");
								startActivity(k);
							}
						});
            			
                    }
                    else if(position==1)
                    {
                    	setContentView(R.layout.zoom1);
            			contentImage=(ImageView)findViewById(R.id.contentImage);
            			contentImage.setImageResource(R.drawable.act2);
            			a=(Button)findViewById(R.id.b1);
        	            b=(Button)findViewById(R.id.b2);
            			a.setOnClickListener(new OnClickListener() {
            				
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent i=new Intent("out.in.activities");
								startActivity(i);
							}
						});
            			b.setOnClickListener(new OnClickListener() {
							
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent j=new Intent("out.in.activityslideshow");
								startActivity(j);
								
							}
						});
contentImage.setOnClickListener(new OnClickListener() {
							
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent k=new Intent("out.in.a2");
								startActivity(k);
							}
						});
                    }
                    if(position==2)
                    {
                    	setContentView(R.layout.zoom1);
            			contentImage=(ImageView)findViewById(R.id.contentImage);
            			contentImage.setImageResource(R.drawable.act3);
            			a=(Button)findViewById(R.id.b1);
        	            b=(Button)findViewById(R.id.b2);
            			a.setOnClickListener(new OnClickListener() {
            				
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent i=new Intent("out.in.activities");
								startActivity(i);
							}
						});
            			b.setOnClickListener(new OnClickListener() {
							
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent j=new Intent("out.in.activityslideshow");
								startActivity(j);
								
							}
						});
contentImage.setOnClickListener(new OnClickListener() {
							
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent k=new Intent("out.in.a3");
								startActivity(k);
							}
						});
                    }
                    if(position==3)
                    {
                    	setContentView(R.layout.zoom1);
            			contentImage=(ImageView)findViewById(R.id.contentImage);
            			contentImage.setImageResource(R.drawable.act4);
            			a=(Button)findViewById(R.id.b1);
        	            b=(Button)findViewById(R.id.b2);
            			a.setOnClickListener(new OnClickListener() {
            				
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent i=new Intent("out.in.activities");
								startActivity(i);
							}
						});
            			
            			b.setOnClickListener(new OnClickListener() {
							
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent j=new Intent("out.in.activityslideshow");
								startActivity(j);
								
							}
						});
contentImage.setOnClickListener(new OnClickListener() {
							
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent k=new Intent("out.in.a4");
								startActivity(k);
							}
						});
                    }
                    if(position==4)
                    {
                    	setContentView(R.layout.zoom1);
            			contentImage=(ImageView)findViewById(R.id.contentImage);
            			contentImage.setImageResource(R.drawable.act5);
            			a=(Button)findViewById(R.id.b1);
        	            b=(Button)findViewById(R.id.b2);
            			a.setOnClickListener(new OnClickListener() {
            				
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent i=new Intent("out.in.activities");
								startActivity(i);
							}
						});
            			
b.setOnClickListener(new OnClickListener() {
							
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent j=new Intent("out.in.activityslideshow");
								startActivity(j);
								
							}
						});
contentImage.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent k=new Intent("out.in.a5");
		startActivity(k);
	}
});
					
                    }
                    if(position==5)
                    {
                    	setContentView(R.layout.zoom1);
            			contentImage=(ImageView)findViewById(R.id.contentImage);
            			contentImage.setImageResource(R.drawable.act6);
            			a=(Button)findViewById(R.id.b1);
        	            b=(Button)findViewById(R.id.b2);
            			a.setOnClickListener(new OnClickListener() {
            				
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent i=new Intent("out.in.activities");
								startActivity(i);
							}
						});
            			
b.setOnClickListener(new OnClickListener() {
							
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent j=new Intent("out.in.activityslideshow");
								startActivity(j);
								
							}
						});
contentImage.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent k=new Intent("out.in.a6");
		startActivity(k);
	}
});
                    }
                    if(position==6)
                    {
                    	setContentView(R.layout.zoom1);
            			contentImage=(ImageView)findViewById(R.id.contentImage);
            			contentImage.setImageResource(R.drawable.act8);
            			a=(Button)findViewById(R.id.b1);
        	            b=(Button)findViewById(R.id.b2);
            			a.setOnClickListener(new OnClickListener() {
            				
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent i=new Intent("out.in.activities");
								startActivity(i);
							}
						});
b.setOnClickListener(new OnClickListener() {
							
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent j=new Intent("out.in.activityslideshow");
								startActivity(j);
								
							}
						});
contentImage.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent k=new Intent("out.in.a8");
		startActivity(k);
	}
});
                    }
                    if(position==7)
                    {
                    	setContentView(R.layout.zoom1);
            			contentImage=(ImageView)findViewById(R.id.contentImage);
            			contentImage.setImageResource(R.drawable.act9);
            			a=(Button)findViewById(R.id.b1);
        	            b=(Button)findViewById(R.id.b2);
            			a.setOnClickListener(new OnClickListener() {
            				
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent i=new Intent("out.in.activities");
								startActivity(i);
							}
						});
            			
b.setOnClickListener(new OnClickListener() {
							
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent j=new Intent("out.in.activityslideshow");
								startActivity(j);
								
							}
						});
contentImage.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent k=new Intent("out.in.a7");
		startActivity(k);
	}
});
                    }
                    
                }
            });
            
        }

	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}