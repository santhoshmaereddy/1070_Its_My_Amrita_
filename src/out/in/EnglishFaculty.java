
package out.in;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class EnglishFaculty extends Activity implements OnItemClickListener{
	

	public static final String[] titles = new String[] { 
		"G. S. JYOTSNA \n Assistant Professor (Sr. Gr.) and HOD ",
		"DEEPTHI JANARDHAN  \n Assistant Professor (Sr. Gr.) ",
		"SMITA SAIL \n Assistant Professor (Sr. Gr) ",
		"PAROMITA GANGULY \n Assistant Professor",
		"Dr. SUKANYA SAHA Lecturer",
		"S.Deepa Kumari"
		
	 
	 };

public static final String[] descriptions = new String[] {
"Qualification : M. A., B. Ed. \n Areas of Interest: Principles of Teaching English, American Literature  \n Email: gs_jyotsna@blr.amrita.edu ",
"Qualification : M. A., PGDHRM  \n Areas of Interest: American Literature  \n Email: j_deepthi@blr.amrita. edu ",
"Qualification : M. A.\n Areas of Interest: Post Colonial Literature  \n Email: s_smita@blr.amrita.edu ",
"Qualification : M. A., P. G. Diploma (in Mass Communication)\n Areas of Interest : English Comedies of George Bernard Shaw and His Socialistic Approach \n Email: g_paromita@blr.amrita.edu",
"Qualification : M. A., B. Ed., M. Phil., Ph. D. \n Areas of Interest: Linguistic and Stylistic Study of Fiction  \n Email: s_sukanya@blr.amrita.edu ",
"Qualification : M. A., M. Phil.SET \n Areas of Interest: Postcolonial Studies, Translation Studies  \n Email: s_deepakumari@blr.amrita.edu ",
              
        
};

public static final Integer[] images = {
	R.drawable.jyotsna_g_s,
	R.drawable.deepthi_janardhanan,
	R.drawable.smitha_sail,
	R.drawable.paromita,
	R.drawable.sukanya_saha,
	R.drawable.geetha_english
	

};

ListView listView;
List<RowItem> rowItems;
	

public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main1);

    rowItems = new ArrayList<RowItem>();
    for (int i = 0; i < titles.length; i++) {
        RowItem item = new RowItem(images[i], titles[i], descriptions[i]);
        rowItems.add(item);
    }

    listView = (ListView) findViewById(R.id.list);
    CustomListViewAdapter adapter = new CustomListViewAdapter(this,
            R.layout.eeefaculty, rowItems);
    listView.setAdapter(adapter);
    listView.setOnItemClickListener(this);
}



public void onItemClick(AdapterView<?> parent, View view, int position,
        long id) {
    
}
	
	

	

}
