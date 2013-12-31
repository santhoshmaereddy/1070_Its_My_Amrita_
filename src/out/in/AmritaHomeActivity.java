package out.in;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class AmritaHomeActivity extends TabActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.abouttab);


	TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);

	TabSpec firstTabSpec = tabHost.newTabSpec("tid1");
	TabSpec secondTabSpec = tabHost.newTabSpec("tid1");
	/** TabSpec setIndicator() is used to set name for the tab. */
	/** TabSpec setContent() is used to set content for a particular tab. */
	firstTabSpec.setIndicator("Amrita University").setContent(new Intent(this,AboutAmrita.class));
	secondTabSpec.setIndicator("Bangalore Campus").setContent(new Intent(this,AboutBangalore.class));

	/** Add tabSpec to the TabHost to display. */
	tabHost.addTab(firstTabSpec);
	tabHost.addTab(secondTabSpec);

	}
}