package out.in;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class cyear2meci extends Activity {
/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);

/* First Tab Content */
TextView textView = new TextView(this);
textView.setText("Odd Sem Syllabus");
setContentView(R.layout.iiimec);

}
}