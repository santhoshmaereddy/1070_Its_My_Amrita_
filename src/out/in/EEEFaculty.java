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

public class EEEFaculty extends Activity implements OnItemClickListener{
	

	public static final String[] titles = new String[] { 
		"Dr. SHIKHA TRIPATHI \n Professor and Chairperson ",
		"Dr. RASHMI M. R. \n Associate Professor & Vice-Chair",
		"MINI SUJITH  \n Assistant Professor (Sr. Gr.)",
		"SREEJA KOCHUVILA \nAssistant Professor (Sr. Gr.)",
		"M. NITHYA \n Assistant Professor (Sr. Gr.)",
		"V. S. KIRTHIKA DEVI \n Assistant Professor (Sr. Gr.) ",
		"K. DEEPA \n Assistant Professor (Sr. Gr.) ",
		"MAMATHA I. \n Assistant Professor (Sr. Gr.) ",
		"ANJANA JAIN \n Assistant Professor (Sr. Gr.)",
		"ILANGO K. \n Assistant Professor (Sr. Gr.) ",
		"SREEKALA MANMADHAN \n Assistant Professor (Sr. Gr.)",
		"V. SAILAJA \n Assistant Professor (Sr. Gr.) ",
        "LEKSHMI S.  \n Assistant Professor (Sr. Gr.)",
        "SUDHA YADAV \n Assistant Professor (Sr. Gr.)",
        "LAKSHMI P. \n Assistant Professor ",
        "SYAMA S. \n Assistant Professor ",
        "MAHALAKSHMI D. \n Assistant Professor ",
        "MANITHA P. V. \n Assistant Professor ",
        "H. R. GIRISH \n Sr. Lecturer and Deputy Controller of Examinations",
        "K. SIREESHA \n Lecturer"
	 
	 };

public static final String[] descriptions = new String[] {
"Qualification :B. Tech., M. E., Ph. D.\nResearch Interests: Digital Signal / Image Processing, Image compression & Image Watermarking, Software Defined Radio  \n Email: t_shikha@blr.amrita.edu  ",
"Qualification : Ph. D.  \n Research Interests:Electric Drives, Multilevel and Modular Converters, Intelligent Control Techniques  \n Email: m_resmi@blr.amrita.edu ",
"Qualification : M. Tech.  \n Research Interests: Power Electronics, Power Quality, Non-Conventional Energy Sources \n Email: mini_sujith@blr.amrita.edu ",
"Qualification : M. Tech., [ Pursuing Ph. D.]  \n Research Interests: Robotics, Control Systems \nEmail: k_sreeja@blr.amrita.edu ",
"Qualification : M. E.  \n Research Interests: Embedded Systems \n Email: m_nithya@blr.amrita.edu ",
"Qualification : M. E.  \n Research Interests: Power Electronics, Digital Systems \n Email: s_kirthika@blr.amrita.edu",
"Qualification : M. E., [ Pursuing Ph. D.]  \n Research Interests: Power Electronics, Drives, Intelligent Control Techniques & Control System \n Email: k_deepa@blr.amrita edu ",
"Qualification : M. Tech., [ Pursuing Ph.D. ] \n Research Interests: Signal/Image Processing, VLSI Architecture for Signal/Image Processing \n Email: i_mamtha@blr.amrita.edu ",
"Qualification : M. E.  \n Research Interests: Control Systems, Power Systems \n Email: a_anjanajain@blr.amrita.edu ",
"Qualification : M. E., [ Pursuing Ph. D.] \n Research Interests: Power Electronics Drives and Machines Control, Renewable Energy Sources and Power Quality, Power Systems \nEmail: k_ilango@blr.amrita.edu ",
"Qualification : B. Tech., M. S.  \n Research Interests: Biomedical Instrumentation, Biomedical Signal Processing \n Email: m_sreekala@blr.amrita.edu",
"Qualification : M. Tech.  \n Research Interests: Power Electronics, Converters, Drives, Power Systems \n Email: v_sailaja@blr.amrita.edu ",
"Qualification : M. Tech. \n Research Interests: Power Converters, Control Systems \n Email: s_lekshmiblr.amrita.edu ",
"Qualification : M. Tech.  \n Research Interests: VLSI Design, Solid State Devices, Digital Design, Analog Circuit Design \n Email: sy_sudha@blr.amrita.edu ",
"Qualification : M. Tech.  \n Research Interests: Power Quality, FACTS Devices, FPGA and Embedded Systems \n Email: prasad_lakshmi@blr.amrita.edu ",
"Qualification : M. Tech.  \n Research Interests: Electric Machines and Drives, Industrial Automation \n Email: s_syama@blr.amrita.edu ",
"Qualification : M. Tech.  \n Research Interests:Renewable Energy Sources, Electrical Drives, FACTS Controllers Email: d_mahalakshmi@blr.amrita.edu ",
"Qualification : M. Tech.  \n Research Interests:Power Quality, Power Converters \n Email: pv_manitha@blr.amrita.edu ",
"Qualification : B. Tech.  \n Research Interests: Power Electronics , Electric Drives and Control Systems  \n Email: hr_girish@blr.amrita.edu ",
"Qualification : B. Tech, [ Pursuing M. Tech. ] \n Research Interests: Mixed Siganl Analysis for Low Power Application, Digital System Design, PLL Design for Power Coverters \nEmail: k_sireesha@blr.edu "



              
        
};

public static final Integer[] images = { R.drawable.shikha,
	R.drawable.rashmi_mr,
	R.drawable.mini_sujith,
	R.drawable.sreeja_kochuvila,
	R.drawable.nithya,
	R.drawable.krithika,
	R.drawable.k_deepa,
	R.drawable.mamatha,
	R.drawable.anjana_jain,
	R.drawable.illango,
	R.drawable.sreekala,
	R.drawable.v_sailaja,
	R.drawable.lakshmi_s,
	R.drawable.sudha_yadhav,
	R.drawable.laxmi,
	R.drawable.syama,
	R.drawable.mahalakshmi,
	R.drawable.manitha,
	R.drawable.h_r_girish,
	R.drawable.k_sherisha
	
	
	

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
