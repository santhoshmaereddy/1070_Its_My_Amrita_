package out.in;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Eresources extends Activity{
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		/* First Tab Content */
		TextView textView = new TextView(this);
		textView.setText("E-Resources");
		setContentView(R.layout.eresources);

		}

}
