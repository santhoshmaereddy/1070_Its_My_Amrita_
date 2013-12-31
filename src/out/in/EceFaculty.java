package out.in;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class EceFaculty extends Activity implements OnItemClickListener{

	
	public static final String[] titles = new String[] { 
		"Dr. SHIKHA TRIPATHI \n Professor and Chairperson ",
		"Dr. PUKHRAJ VAYA \nProfessor","S. RAVISHANKAR \nProfessor",
         "Dr. N. S. MURTY \nProfessor", 
         "Dr. DHANESH G. KURUP \nProfessor",
         "Dr. T. K. RAMESH\n Associate Professor ",
         "GANAPATHI HEGDE\nAssistant Professor (Sr. Gr.) ",
         "GIRIRAJA C. V.\nAssistant Professor (Sr. Gr.) ",
         "R. KARTHIKEYAN \nAssistant Professor (Sr. Gr.) ",
         "LATHA\nAssistant Professor (Sr. Gr.) ",
         "HEMANTH KUMAR G. \nAssistant Professor (Sr. Gr.) ",
         "S. LALITHA \n Assistant Professor (Sr. Gr.) ",
         "M. VINODHINI \n Assistant Professor (Sr. Gr.) ",
         "KIRTI S. PANDE  \n Assistant Professor (Sr. Gr.) ",
         "R. V. SANJIKA DEVI \n Assistant Professor (Sr. Gr.) ",
         "C. BABU \nAssistant Professor and M. Tech. Coordinator (Sr. Gr.) ",
         "S. SUMATHI \n Assistant Professor (Sr. Gr.)",
         "P. SATISH KUMAR \n Assistant Professor(Sr. Gr.) ",
         "JEYANTHI R. \nAssistant Professor (Sr. Gr.) ",
         "PONNI M. \nAssistant Professor (Sr. Gr.) ",
         "R. SUNITHA \n Assistant Professor (Sr.Gr) ",
         "SUSMITHA VEKKOT  \nAssistant Professor (Sr. Gr.) ",
         "NEETA MISHRA  \nAssistant Professor (Sr.Gr.)",
         "K. JEEVA PRIYA \nAssistant Professor (Sr. Gr.) ",
         "VIBHA MEHROTRA \nAssistant Professor (Sr. Gr.) ",
         "JAYASREE M. OLI \n Assistant Professor (Sr. Gr.)",
         "M. S. SANKARI \n Assistant Professor (Sr. Gr.)",
         "ALOK KUMAR JHA \nAssistant Professor (Sr. Gr.) ",
         "KAVITHA N. PILLAI  \nAssistant Professor ",
         "SWAMINADHAN R. \n Assistant Professor ",
         "SONALI GUPTA \nAssistant Professor ",
         "NAGA V. SATYANARAYANA MURTHY \n Assistant Professor",
         "SAGAR B. \nAssistant Professor ",
         "PARUL MATHUR \n Assistant Professor ",
         "NIDHI GANGRADE \n Assistant Professor ",
         "VIGNESH V. \n Assistant Professor ",
         "KAVITA BALIGER \nAssistant Professor",
         "ANJALI B. S. \n Assistant Professor ",
         "BHAVANA V. \nLecturer ",
      
	 
	 };

public static final String[] descriptions = new String[] {
"Qualification :B. Tech., M. E., Ph. D.\nResearch Interests: Digital Signal / Image Processing, Image compression & Image Watermarking, Software Defined Radio  \n Email: t_shikha@blr.amrita.edu  ",
"Qualification : M. Sc., M. Sc. (Tech.), Ph. D.,\nResearch Interests: Teaching, Research and Development in Microelectronic and High Speed Semiconductor Photonic Devices, Transfer of Technology, Management of Technical Resources in the Academic and Industrial Environment \nEmail: pr_vaya@blr.amrita.edu  ",
"Qualification : M. Tech. [Pursuing Ph. D.] \nResearch Interests: Image Processing, VLSI for Signal Processing \nEmail: s_ravishankar@blr.amrita.edu ",              
 "Qualification : M. Sc. (Tech.), M. B. A., M. S. B., Ph. D.\n Research Interests: VLSI Technology and Design, Green Energy Harvesting \n Email: ns_murty@blr.amrita.edu ",       
 "Qualification : B. Tech, M. E., Ph. D.\nResearch Interests: RF Engineering, Signal Processing, Wireless Systems \nEmail: dg_kurup@blr.amrita.edu ",
 "Qualification : M. S. (Electronics and Control Engineering), Ph. D.\nResearch Interests: Optical Networks, Digital and Analog Electronics\nEmail: tk_ramesh@blr.amrita.edu ",
 "Qualification : M. Tech., [ Pursuing Ph. D. ]\nResearch Interests: VLSI Systems, Computer Algorithms \n Email:ganapathi_hegde@blr.amrita.edu ",
 "Qualification : M. E., [ Pursuing Ph. D. ] \nResearch Interests: Signal Processing, Photonics, Communication \nEmail: cv_giriraja@blr.amrita.edu ",
 "Qualification : M. E., [ Pursuing Ph. D. ] \nResearch Interests: Process control, Intelligent control \nEmail: r_karthikeyan@blr.amrita.edu ",
 "Qualification : M. Tech., [ Pursuing Ph. D. ] \nResearch Interests: Digital Signal Processing\n Email: s_latha@blr.amrita edu ",
 " Qualification : M. E. \n Research Interests: Power Electronics, Electromagnetics & Communication \n Email: g_hemanthkumar@blr.amrita edu ",
 "Qualification : M. Tech. \nResearch Interests: Signal Processing, Image Processing \nEmail: s_lalitha@blr.amrita edu ",
 "Qualification : M. Tech. \nResearch Interests: Communication, Networking and VLSI Design \n Email: m_vinodhini@blr.amrita.edu ",
 "Qualification : M. Tech.  \n Research Interests: VLSI Design, Processor Design \n Email: sp_kirti@blr.amrita.edu ",
 "Qualification : M. E.  \n Research Interests: Communication, Networking \n Email: r_sanjika@blr.amrita.edu ",
 "Qualification : M. E. (VLSI Design)  \nResearch Interests: CMOS VLSI Design, HDL Programming  \n Email: c_babu@blr.amrita edu ",
 "Qualification : M. E. (Communication Systems)  \n Research Interests : Digital Signal Processing, Digital Image Processing, Multimedia Compression Techniques  \n Email: s_sumathi@blr.amrita.edu ",
 "Qualification : M. E.  \nResearch Interests: VLSI, Analog Design, CMOS, Digital Design \n Email: p_sathishkumar@blr.amrita.edu ",
 "Qualification : M. Tech.  \nResearch Interests: Process Control, Automation, Data Validation \n Email: r_jeyanthi@blr.amrita.edu",
 "Qualification : M. Tech. [ Pursuing Ph. D. ]  \n Research Interests: VLSI \n Email: m_ponni@blr.amrita.edu",
 "Qualification : M. Tech.  \n Research Interests: Communication Systems, Electronic Circuits, Signal Processing \n Email: r_sunitha@blr.amrita.edu ",
 "Qualification : M. S.  \nResearch Interests: Signal and Image processing, Embedded systems \nEmail: v_susmitha@blr.amrita.edu ",
 "Qualification : M. Tech.  \nResearch Interests: Digital Communication, Wireless Communication, Signal Theory \nEmail: m_neeta@blr.amrita.edu",
 "Qualification : M. E.  \nResearch Interests: Signal Processing, Measurements & Instrumentation, Image Processing \nEmail: k_jeevapriya@blr.amrita.edu",
 "Qualification : M. Tech.  \n Research Interests: Communication Technologies, Information and Coding Theory \n Email: m_vibha@blr.amrita.edu",
 "Qualification : B. E., M. Tech. \nResearch Interests: Microprocessors and Microcontrollers, Computer Networking, Embedded Systems \n Email: m_jayashree@blr.amrita.edu ",
 "Qualification : B. E., M. Tech. \n Research Interests: Electronic Circuit Design, Communication System, Computer Networks \n Email: s_sankari@blr.amrita.edu ",
 "Qualification : M. Tech.  \n Research Interests: Photonics, Integrated Optics, MOEMS, Fiber-Optics, Electromagnetics, Lasers  \nEmail: alok_jha@blr.amrita.edu ",
 "Qualification : M. Tech.  \n Research Interests: Communication Engineering, Electronic Circuits \n Email: n_kavithapillai@blr.amrita.edu ",
 "Qualification : M. Tech.  \n Research Interests: Analog and Digital Integrated Circuit Design \nEmail: r_swaminadhan@blr.amrita.edu",
 "Qualification : M. Tech.  \n Research Interests: Low power VLSI Design, Digital Design, Hardware Description Languages, Digital Signal Processing \n Email:a_sonali@blr.amrita.edu",
 "Qualification : M. Tech. (VLSI Design & Embedded Systems) \n Research Interests: ASIC, FPGA Designs and Functional Verification Using System Verilog and Verification Methodologies, Complex System On Chip Architectures \n Email: nvs_murthy@blr.amrita.edu ",
 "Qualification : M. Tech., A. I. E.  \n Research Interests: Image Processing, Signals and Systems  \n Email: b_sagar@blr.amrita.edu ",
 "Qualification : M. TECH. (Embedded System)  \n Research Interests: Microwave and Radar Communication, Digital Image Processing  \nEmail: p_mathur@blr.amrita.edu ",
 "Qualification : B. E. (ECE), M. Tech. (Electronics) \n Research Interests: Digital Communication, Wireless Communication  \n Email: g_nidhi@blr.amrita.edu ",
 "Qualification : M. Tech. (VLSI Design).  \n Research Interests: Digital Integrated Circuits, Low Power CMOS Design, Microelectronic Devices & Circuits \n Email: v_vignesh@blr.amrita.edu ",
 "Qualification : M. Tech. (VLSI & Embedded System) \n Research Interests: Wireless Sensors, Image Processing\n Email: b_kavita@blr.amrita.edu ",
 "Qualification : M. Tech. \n Research Interests: Instrumentation, Digital Design, Hardware Description Language, FPGA \n Email: bs_anjali@blr.amrita.edu ",
 "Qualification : B. Tech. [ Pursuing M. Tech. ]  \n Research Interests: Digital Electronics, Digital Signal Processing, Microprocessors and Microcontrollers, Embedded Systems \nEmail: v_bhavana@blr.amrita.edu ",
 
 
 
 
 
};

public static final Integer[] images = { R.drawable.shikha,
	R.drawable.vaya,R.drawable.ravishankar_s,
	R.drawable.ns_murty,
	R.drawable.dhanesh,
	R.drawable.t_k_ramesh,
	R.drawable.ganapathy_hagde,
	R.drawable.giriraja_c_v,
	R.drawable.karthikeyan,
	R.drawable.latha,
	R.drawable.hemanth_kumar_g,
	R.drawable.lalitha_s,
	R.drawable.m_vinodhini,
	R.drawable.keerthi_pande,
	R.drawable.r_v_sanjika_devi,
	R.drawable.babu_c,
	R.drawable.sumati,
	R.drawable.sathish_kumar_p,
	R.drawable.r_jayanthi,
	R.drawable.ponni,
	R.drawable.sunitha_r,
	R.drawable.susmitha,
	R.drawable.neeta,
	R.drawable.jeevapriya,
	R.drawable.vibha,
	R.drawable.jayasreeoli_m,
	R.drawable.m_s_sankari,
	R.drawable.alok_kumar_jha,
	R.drawable.kavitha,
	R.drawable.swaminathan,
	R.drawable.sonali,
	R.drawable.naga_v_satyanarayana_murthy,
	R.drawable.sagar_b,
	R.drawable.parul_mathur,
	R.drawable.nidhi_gangrade,
	R.drawable.vignesh_v,
	R.drawable.kavita_baliger,
	R.drawable.anjali_b_s,
	R.drawable.bhavana
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
            R.layout.ecefaculty, rowItems);
    listView.setAdapter(adapter);
    listView.setOnItemClickListener(this);
}



public void onItemClick(AdapterView<?> parent, View view, int position,
        long id) {
   
}
	
	

	
	
}
