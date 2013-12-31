
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

public class MechFaculty extends Activity implements OnItemClickListener{
	

	public static final String[] titles = new String[] { 
		"Dr. RAKESH S. G. \n Professor & Associate Dean ",
		"Dr. NAGARAJA S. R.  \n Professor and Chairman",
		"Dr. PRADEEP HEGDE \n Associate Professor",
		"M. V. PHANIBHUSHANA \n Assistant Professor (Sr. Gr.) ",
		"Dr. T. SRINIVAS RAO \n Assistant Professor (Sr. Gr.)",
		"Dr. VEERESH KUMAR G. B. \n Assistant Professor (Sr. Gr.)",
		"VINOD KOTEBAVI \n Assistant Professor (Sr. Gr.) ",
		"RAVI KUMAR V.  \n Assistant Professor (Sr. Gr.)",
		"RAGHAVENDRA RAVIKIRAN K.  \n Assistant Professor (Sr. Gr.)",
		"JANAKI R.  \n Assistant Professor (Sr. Gr.)",
		"R. PRAMOD \n Assistant Professor (Sr. Gr.)",
		"PRASHANTH B. N. \n Assistant Professor (Sr. Gr.)",
		"SHASHI KUMAR M. E. \n Assistant Professor (Sr. Gr.)",
		"S. BHANU PRAKASH \n Assistant Professor (Sr. Gr.)",
		"ULHAS K. ANNIGERI \n Assistant Professor (Sr. Gr.)",
		"DEBJYOTHI SAHU  \n Assistant Professor",
		"MOHAN KUMAR S. \n Assistant Professor",
		"Y. P. DEEPTHI \n Assistant Professor",
		"DILEEP B. P. \n Assistant Professor",
		"BALASUBRAMANYA H. S. \n Assistant Professor",
		"PRAKASH MARIMUTHU K \n Assistant Professor"
	 
	 };

public static final String[] descriptions = new String[] {
"Qualification : M. E., Ph. D. \n Research Interests: Gas Dynamics, Refrigeration and Air Conditioning  \n Email: sg_rakesh@blr.amrita.edu ",
"Qualification : M. Tech., Ph. D. \n Research Interests: Shock Waves, Applications of Shock Waves, Gas Dynamics, Dynamic Behaviour of Materials, Impact Dynamics \n Email: sr_nagaraja@blr.amrita.edu",
"Qualification : M. Tech., Ph. D. \n Research Interests: Numerical Heat Transfer, Heat Sinks, Semiconductor Cooling \n Email: pg_hegde@blr.amrita.edu ",
"Qualification : M. E., [ Pursuing Ph. D. ] \n Research Interests: Composite Materials  \n Email: mv_phanibhushana@blr.amrita.edu ",
"Qualification : M. Tech., Ph. D.\n Research Interests: Operations Management, Supply Chain Management  \n Email: t_srinivas@blr.amrita.edu ",
"Qualification : M. Tech., Ph. D. \n Research Interests: Material Science and Metallurgy, Composite Materials, Artificial Neural Networks  \n Email: gb_veeresh@blr.amrita.edu",
"Qualification : M. E. \n Research Interests: I.C. Engines, Alternate Fuels  \n Email: k_vinod@blr.amrita.edu",
"Qualification : M. E., [ Pursuing Ph. D.] \n Research Interests: Tribology, Vibrations, Machine Design, Control Engineering, Composite Materials \n Email: v_ravikumar@blr.amrita.edu",
"Qualification : M. Tech. \n Research Interests: CAD/CAM, Robotics, Automobile Engineering  \n Email: kr_ravikiran@blr.amrita.edu ",
"Qualification : M. Tech. \n Research Interests: Computer Integrated Manufacturing, Operations Research, Simulation and Modelling of Manufacturing Systems, Materials Science \n Email: r_janaki@blr.amrita.edu ",
"Qualification : M.Tech., [ Pursuing Ph. D.] \n Research Interests: Finite Element Method (FEM), Design, Composites & Fracture Mechanics, Vibrations  \n Email: r_pramod@blr.amrita.edu ",
"Qualification : M. Tech., [ Pursuing Ph. D.] \n Research Interests: Product Lifecycle Management, CAD/CAM, Robotics \n Email: bn_prashanth@blr.amrita.edu ",
"Qualification : M. Tech., [ Pursuing Ph. D.] \n Research Interests:Concurrent Engineering, Finite Element Method, Vibrations, Composite Materials \n Email: me_shashikumar@blr.amrita.edu ",
"Qualification : M. Tech. \n Research Interests: Gas Turbines, Heat Transfer, Fluid Mechanics, I.C Engines and Computational Fluid Dynamics  \n Email: b_prakash@blr.amrita.edu ",
"Qualification : M. Tech. \n Research Interests: Manufacturing Science, Material Science  \n Email: uk_annigeri@blr.amrita.edu ",
"Qualification : M. Tech., [ Pursuing Ph. D.] \n Research Interests: Computational Fluid Dynamics  \n Email: s_debjyoti@blr.amrita.edu ",
"Qualification : M. Tech., [ Pursuing Ph. D.] \n Research Interests: FEM, Fracture Mechanics, Composite Materials\n Email: s_mohankumar@blr.amrita.edu ",
"Qualification : M. Tech., [ Pursuing Ph. D.] \n Research Interests: Manufacturing Science \n Email: p_deepthi@blr.amrita.edu ",
"Qualification : M. Tech., [ Pursuing Ph. D.] \n Research Interests: MMC, CAD/CAM, Operations Research \n Email: bp_dileep@blr.amrita.edu ",
"Qualification : M. Tech., [ Pursuing Ph. D.] \n Research Interests: Tribology, Material Science, Composite Materials \n Email: hs_balasubramanya@blr.amrita.edu ",
"Qualification : M. Tech. \n Research Interests: CAD/CAM, Manufacturing Science \n Email: k_prakash@blr.amrita.edu "

              
        
};

public static final Integer[] images = {
	R.drawable.rakesh_s_g,
	R.drawable.nagaraja_s_r,
	R.drawable.pradeep_g_hegde,
	R.drawable.phanibhushana,
	R.drawable.srinivas_r_rao,
	R.drawable.veeresh_kumar,
	R.drawable.m_vinod,
	R.drawable.ravi_kumar_v,
	R.drawable.raghavendra,
	R.drawable.janaki,
	R.drawable.pramod_r,
	R.drawable.prashanth,
	R.drawable.shashikumar,
	R.drawable.bhanu_prakash,
	R.drawable.blank,
	R.drawable.debjyoti_bahu,
	R.drawable.mohan,
	R.drawable.y_p_deepthi,
	R.drawable.dileep_b_p,
	R.drawable.balasubramanya,
	R.drawable.prakash_marimuthu_k
	
	

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
