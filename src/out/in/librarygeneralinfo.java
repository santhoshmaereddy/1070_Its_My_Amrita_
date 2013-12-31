package out.in;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class librarygeneralinfo extends Activity{

	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		/* First Tab Content */
		TextView textView = new TextView(this);
		textView.setText("Library Information");
		setContentView(R.layout.libraryinfo);

		}
}
