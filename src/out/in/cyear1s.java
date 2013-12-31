package out.in;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class cyear1s extends Activity {
/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);

/* Second Tab Content */
TextView textView = new TextView(this);
textView.setText("Even Sem Syllabus");
setContentView(R.layout.year1ii);

}
}