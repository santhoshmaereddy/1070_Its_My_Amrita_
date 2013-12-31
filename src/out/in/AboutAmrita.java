package out.in;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutAmrita extends Activity{
	
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);

	/* First Tab Content */
	TextView textView = new TextView(this);
	textView.setText("Amrita University");
	
	setContentView(R.layout.aboutamrita);

	}
}