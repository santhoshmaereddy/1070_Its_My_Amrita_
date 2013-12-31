
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

public class MathFaculty extends Activity implements OnItemClickListener{
	

	public static final String[] titles = new String[] { 
		"Dr. B. VENKATESH \n Associate Professor and HOD",
		"Dr. K. V. NAGARAJA  \n Professor",
		"K. MURALI \n Assistant Professor (Sr. Gr.)",
		"K. N. MEERA \n Assistant Professor (Sr. Gr.)",
		"GEETHA K. N. \n Assistant Professor (Sr. Gr.)",
		"Dr. DEEPA GUPTA \n Assistant Professor (Sr. Gr.)",
		"SARADA JAYAN \n Assistant Professor(Sr. Gr.)",
		"Dr. NEETU SREEVASTAVA \n Assistant Professor (Sr. Gr.)",
		"V. KESAVULU NAIDU \n Assistant Professor(Sr. Gr.)",
		"Dr. JAYA SHREE D. \n Assistant Professor (Sr. Gr.)",
		"MAMTHA T. M. \n Assistant Professor  "
		
		
	 
	 };

public static final String[] descriptions = new String[] {
" Qualification : M. Sc., M. Phil., Ph. D.\n Research Interests: Numerical Analysis, Finite Element Methods, Complex Variables and Partial Differential Equations  \n Email: b_venkatesh@blr.amrita.edu ",
"Qualification : M. Sc., M. Phil., Ph. D. \n Research Interests: Numerical Analysis, Finite Element Method, Transforms and Partial Differential Equations  \n Email: kv_nagaraja@blr.amrita.edu ",
"Qualification : M. Sc. , M. Phil., PGDCA [ Pursuing Ph. D.]  \n Research Interests: Discrete Mathematics, Graph Theory  \n Email: k_murali@blr.amrita.edu ",
"Qualification : M. Sc., M. Phil. [ Pursuing Ph. D.]  \n Research Interests: Discrete Mathematics, Graph Theory, Probability and Statistics, Random Processes, Queuing Theory \n Email: kn_meera@blr.amrita.edu ",
"Qualification : M. Sc. [ Pursuing Ph. D.]  \n Research Interests: Discrete Mathematics, Graph Theory, Numerical Analysis \n Email: kn_geetha@blr.amrita.edu ",
"Qualification : M. Sc., Ph. D.  \n Research Interests:Natural Language Processing, Machine Learning, Information Retrieval  \n Email: g_deepa@blr.amrita.edu ",
"Qualification : M. Sc., [ Pursuing Ph. D.]  \n Research Interests: Operations Research, Optimization Techniques, Numerical Analysis, Finite Element Methods \n Email: j_sarada@blr.amrita.edu ",
"Qualification : M. Sc., Ph. D.  \n Research Interests: Fluid Dynamics, Linear Algebra, Calculus \n Email: s_neetu@blr.amrita.edu ",
"Qualification : M. Sc. [Pursuing Ph. D.]  \n Research Interests: Numerical Methods and Finite Element Methods  \n Email: v_kesavulu@blr.amrita.edu ",
"Qualification : M. Sc., M. Phil., Ph. D.  \n Research Interests: Algebra, Fuzzy Matrix Theory, Operations Research  \n Email: d_jayashree@blr.amrita.edu ",
"Qualification : M. Sc., M. Phil, [ Pursuing Ph. D.]  \n Research Interests: Graphic Theory, Operations Research, Numerical Analysis and Magneto Hydro Dynamics  \n Email: tm_mamatha@blr.amrita.edu ",
""
};

public static final Integer[] images = {
	R.drawable.b_venkatesh,
	R.drawable.k_v_nagaraja,
	R.drawable.k_murali,
	R.drawable.k_n_meera,
	R.drawable.geethakn_maths,
	R.drawable.deepa_guptha_maths,
	R.drawable.sarada_jayan,
	R.drawable.neetu_srivastava,
	R.drawable.kesavulu_naidu,
	R.drawable.jayashree_maths,
	R.drawable.mamatha_t_m_maths,
	
	
	

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
