package out.in;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class LibraryActivity extends TabActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.abouttab);


	TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);

	TabSpec firstTabSpec = tabHost.newTabSpec("tid1");
	TabSpec secondTabSpec = tabHost.newTabSpec("tid1");
	TabSpec thirdTabSpec = tabHost.newTabSpec("tid1");
	
	/** TabSpec setIndicator() is used to set name for the tab. */
	/** TabSpec setContent() is used to set content for a particular tab. */
	firstTabSpec.setIndicator("General Information").setContent(new Intent(this,librarygeneralinfo.class));
	secondTabSpec.setIndicator("Services").setContent(new Intent(this,LibraryServices.class));
	thirdTabSpec.setIndicator("E-Resources").setContent(new Intent(this,Eresources.class));
	

	/** Add tabSpec to the TabHost to display. */
	tabHost.addTab(firstTabSpec);
	tabHost.addTab(secondTabSpec);
	tabHost.addTab(thirdTabSpec);
	}
}