
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

public class PhysicsFaculty extends Activity implements OnItemClickListener{
	

	public static final String[] titles = new String[] { 
		"Dr. KUMARASWAMY G. N. \n Assistant Professor (Sr. Gr.) and HOD",
		"K. N. VENKATACHALAIAH  \n Assistant Professor (Sr. Gr.) ",
		"MANJUNATHA H.  \n Assistant Professor (Sr. Gr.)",
		"DHARANI KANAKARAJ  \n Assistant Professor (Sr. Gr.)",
		"PRAVEEN D.  \n Assistant Professor (Sr. Gr.)"
		
		 
	 };

public static final String[] descriptions = new String[] {

"Qualification : M. Sc., Ph. D. \n Research Interests: Condensed Matter Physics  \n Email: gnk_swamy@blr.amrita. edu ",
"Qualification : M. Sc., M. Phil. \n Research Interests: Polymer Physics  \n Email: kn_venkatachalaiah@blr.amrita.edu ",
"Qualification : M. Sc. \n Research Interests: Conducting Polymers  \n Email: h_manjunath@blr.amrita. edu ",
"Qualification : M. Sc., M. Phil. \n Research Interests: Molecular Quantum Mechanics, Bioinformatics  \n Email: m_dharani@blr.amrita.edu ",
 "Qualification : M. Sc., [ Pursuing Ph. D.] \n Research Interests: Solid State Ionics, Active Galactic Nucleus, Monte-Carlo Simulations \n Email: d_praveen@blr.amrita.edu "             
        
};

public static final Integer[] images = {
	R.drawable.kumaraswami_g,
	R.drawable.vekitachalaiah,
	R.drawable.manjunatha_h,
	R.drawable.m_dharani,
	R.drawable.praveen_d_physics
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
