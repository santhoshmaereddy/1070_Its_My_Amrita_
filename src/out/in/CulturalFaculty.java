
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

public class CulturalFaculty extends Activity implements OnItemClickListener{
	

	public static final String[] titles = new String[] { 
		"G. S. JYOTSNA \n Assistant Professor (Sr. Gr.)and HOD",
		"V. SHANKAR KUMARAN \n Teaching Assistant",
		"MANIKANTAN \n Yoga Instructor",
		"K. KESAVAN \n Cultural Education Instructor"
		
		 
	 };

public static final String[] descriptions = new String[] {

"Qualification : M. A., B. Ed. \n Areas of Interest: Principles of Teaching English, American Literature  \n Email: gs_jyotsna@blr.amrita.edu ",
"Qualification : M. Sc.(Yogic Science), B. Sc. \n Research Interests:	 \n Email: v_shankar@blr.amrita.edu ",
"Qualification : Diploma in Yoga, Y. T. T. C (Yoga Teacher Training Course), Y. I. C. (Yoga Instructor Course) \n Research Interests:  \n Email: s_manikantan@blr.amrita.edu ",
"Qualification : M. Sc. (Yoga), B. Com., M. Com. \n Research Interests:  \n Email: k_kesavan@blr.amrita.edu "

};

public static final Integer[] images = {
	R.drawable.jyotsna_g_s,
	R.drawable.shankar_kumaran_cult,
	R.drawable.blank,
	R.drawable.keshvan_cultural
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
