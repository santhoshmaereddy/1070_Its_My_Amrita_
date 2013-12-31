
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

public class CivilFaculty extends Activity implements OnItemClickListener{
	

	public static final String[] titles = new String[] { 
		"Dr. NAGARAJ B. N. \n Dean, Academics ",
		"SHANKARA  \n Assistant Professor (Sr. Gr.)",
		"SHALI S. \n Assistant Professor (Sr. Gr.)",
		"RUHHI BHATEJA \n Assistant Professor (Sr. Gr.)",
		"SMITA SINGH \n Assistant Professor (Sr. Gr.)"
		
	 
	 };

public static final String[] descriptions = new String[] {
" Qualification : B. E., M. Tech., Ph. D. \n Research Interests: \n Email: bn_nagaraj@blr.amrita.edu ",
"Qualification : M. Tech., [ Pursuing Ph. D. ] \n Research Interests: Engineering Mechanics, Structural Analysis and Design, Environmental Studies	\n Email: k_shankara@blr.amrita.edu ",
"Qualification : M. Tech. \n Research Interests: Structural Dynamics	 \n Email: s_shali@blr.amrita.edu ",
"Qualification : M. E. \n Research Interests: Environmental Engineering	 \n Email: b_ruhhi@blr.amrita.edu ",
"Qualification : M. Tech. \n Research Interests: Engineering Mechanics, Analysis and Design of Bridges  \n Email: smita_singh@blr.amrita.edu "
        
};

public static final Integer[] images = {
	R.drawable.blank,
	R.drawable.shankara,
	R.drawable.shali_s,
	R.drawable.ruhi_bhateja,
	R.drawable.smita
	
	
	

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
