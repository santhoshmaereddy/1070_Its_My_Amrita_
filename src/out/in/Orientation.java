package out.in;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Orientation extends Activity implements OnClickListener {

	private static final int SWIPE_MIN_DISTANCE = 12;
	private static final int SWIPE_THRESHOLD_VELOCITY = 2;

	private ViewFlipper vf;
	private Context mContext;
	private final GestureDetector detector = new GestureDetector(
			new MyGestureDetector());

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flipper);
		mContext = this;
		vf = (ViewFlipper) this.findViewById(R.id.vfShow);
		vf.setOnTouchListener(new OnTouchListener() {
	        public boolean onTouch(final View view, final MotionEvent event) {
	        	detector.onTouchEvent(event);
	            return true;
	        }
	    });

		//vf.addView(addImageView(R.drawable.oc1));
		
		vf.addView(addImageView(R.drawable.oc2));
		vf.addView(addImageView(R.drawable.oc3));
		vf.addView(addImageView(R.drawable.oc4));
		vf.addView(addImageView(R.drawable.oc5));
		vf.addView(addImageView(R.drawable.oc6));
		vf.addView(addImageView(R.drawable.oc7));
		vf.addView(addImageView(R.drawable.oc8));
		vf.addView(addImageView(R.drawable.oc9));
		//vf.addView(addImageView(R.drawable.oc10));
		//vf.addView(addImageView(R.drawable.oc11));
		//vf.addView(addImageView(R.drawable.oc12));
		//vf.addView(addImageView(R.drawable.oc13));
		vf.addView(addImageView(R.drawable.oc15));
		


	}

	View addImageView(int resId) {
		ImageView iv = new ImageView(this);
		iv.setImageResource(resId);

		return iv;
	}

	class MyGestureDetector extends SimpleOnGestureListener {
		@Override
		public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
				float velocityY) {
			try {

				// right to left swipe
				if (e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE
						&& Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
					vf.setInAnimation(AnimationUtils.loadAnimation(mContext,
							R.anim.left_in));
					vf.setOutAnimation(AnimationUtils.loadAnimation(mContext,
							R.anim.left_out));
					vf.showNext();
					return true;
				} else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE
						&& Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
					vf.setInAnimation(AnimationUtils.loadAnimation(mContext,
							R.anim.right_in));
					vf.setOutAnimation(AnimationUtils.loadAnimation(mContext,
							R.anim.right_out));
					vf.showPrevious();
					return true;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

			return false;
		}
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.vfShow)
		{
			Intent i=new Intent("out.in.zoom");
			startActivity(i);
		}
		
	}
}