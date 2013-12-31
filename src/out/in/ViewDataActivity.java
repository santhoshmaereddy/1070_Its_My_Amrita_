package out.in;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewDataActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		TextView tv;
		super.onCreate(savedInstanceState);
		setContentView(R.layout.viewdataxml);
		tv=(TextView)findViewById(R.id.t1);
		DatabaseConnectionProvider dcp=new DatabaseConnectionProvider(this);
		dcp.open();
		String res=dcp.viewData();
		dcp.close();
		tv.setText(res);
	}

}
