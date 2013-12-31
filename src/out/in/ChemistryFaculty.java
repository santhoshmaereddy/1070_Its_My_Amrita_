
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

public class ChemistryFaculty extends Activity implements OnItemClickListener{
	

	public static final String[] titles = new String[] { 
		"Dr. B. L. BHASKAR \n Assistant Professor and HOD",
		"B. H. NANJUNDAREDDY  \n Assistant Professor (Sr. Gr.) ",
		"Dr. T. M. MOHAN KUMAR \n Assistant Professor (Sr. Gr.)",
		"B. S. GIRIDHAR REDDY \n Assistant Professor (Sr. Gr.)",
		"Dr. AKANKSHA SAXENA PANDIT \n Assistant Professor (Sr. Gr.)",
		"Dr. AMRITA THAKUR \n Assistant Professor(Sr. Gr.)",
		"ANIL KUMAR S. \n Assistant Professor"
		
		 
	 };

public static final String[] descriptions = new String[] {

"Qualification : M. Sc., Ph. D., P. D. F. \n Research Interests:Analytical Chemistry \n Email: bl_bhaskar@blr.amrita.edu ",
"Qualification : M. Sc. , B. Ed. \n Research Interests: Polymer Chemistry  \n Email: bh_nanjundareddy@blr.amrita.edu ",
"Qualification : M. Sc., Ph. D. \n Research Interests: Phthalocyanine Chemistry, Charge Transfer Complexes, Conducting Polymers  \n Email: tm_mohankumar@blr.amrita.edu ",
"Qualification : M. Sc. [ Pursuing Ph. D.] \n Research Interests: Biodegradable Polymers  \n Email: ",
"Qualification : M. Sc., Ph. D. \n Research Interests: Polymer Chemistry  \n Email: s_akanksha@blr.amrita.edu ",
   "Qualification : M. Sc., Ph. D. \n Research Interests: Bio Inorganic Chemistry  \n Email: t_amrita@blr.amrita.edu ",
   "Qualification : M. Sc. \n Research Interests: Analytical Chemistry, Nano Materials \n Email: s_anilkumar@blr.amrita.edu ",
   
};

public static final Integer[] images = {
	R.drawable.b_l_baskar,
	R.drawable.nanjunda_reddy,
	R.drawable.t_m_mohan_kumar,
	R.drawable.giridharreddy,
	R.drawable.akanksha_saxena,
	R.drawable.amrita_thakur,
	R.drawable.anil_kumar_s
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
