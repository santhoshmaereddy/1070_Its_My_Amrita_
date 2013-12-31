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


public class CseFaculty extends Activity implements
OnItemClickListener{

	
	 public static final String[] titles = new String[] { "Dr.T S B SUDARSHAN \n Professor and Chairperson ",
         "Prof.RAJKUMAR P SREEDHARAN \n Professor", 
         "Dr. K SANGEETA IYER \n Associate Professor", 
         "Dr. AMUDHA J \n Associate Professor" ,
         "SUJA P \n Assistant Professor & Acc. Co-ordinator ", 
         "SUPRIYA M \n Assistant Professor", 
         "RADHA D \nAssistant Professor",
         "B UMA MAHESWARI \nAssistant Professor",
         "G RADHAKRISHNAN \nAssistant Professor & Vice-Chair",
         "SANGITA KHARE \nAssistant Professor ",
         "JUHI R SRIVASTAVA \n Assistant Professor ",
         "MEENA BELWAL \nAssistant Professor ", 
         "KAVITHA C R\nAssistant Professor ",
         "RAJESH M \nAssistant Professor ",
         
         "SASIKALA T  \n Assistant Professor ",
         "VINEETHA JAIN K V\nAssistant Professor",
         "LAKSHMI P \nAssistant Professor",
         "SREEBHA BHASKARAN \nAssistant Professor",
         "SHINU M R \nAssistant Professor",
         "AKANCHHA MISHRA\nAssistant Professor ",
         "BHARGAVI R UPADHYAY \nAssistant Professor ",
         "TRIPTY SINGH\nAssistant Professor",
         "NIPPUN KUMAAR A A\nAssistant Professor ",
         "SANTHANA LAKSHMI S\nSr.Lecturer",
          "Mr ULLAS\nSr.Lecturer ",
         "JYOTSNA C\nLecturer",
         "SREEVIDYA B\nLecturer",
         "NALINI S.\nLecturer",
         "K V VIDYA\nLecturer",
         "MANJU VENUGOPAL\nLecturer ",
         "PRIYANKA VIVEK\nLecturer",
         "CHANDRIKA K R\nLecturer",
         "S.Saravanan \n Designation:Assistant Professor",
         "ANIRUDDHA BHATTACHARJYA \n Assistant Professor ",
         "Lakshmi MP Setty \n Faculty Associate"
         
	 
	 };

 public static final String[] descriptions = new String[] {
         "Qualification : B.E., M.E., Ph.D. \n\n Research Interests: Computer Architecture, Memory Design for Embedded Systems, Crypto- Hardware Design Reconfigurable System Design, Multicore Architectures, Web Caching, Caching for Streaming Media Objects in " +
         "Fixed and Mobile Networks, Web Mining. \n\n Email: tsb_sudarshan@blr.amrita.edu",
         "Qualification : B.Sc(Engineering), DIISc Electronic Design Technology) \n \n Research Interests: Large Systems Architecture, Real-time Embedded Systems, VLSI Desgin, Software Engineering tools and Environments \n\n  Email: raj_sreedharan@blr.amrita.edu",
         "Qualification : M.Sc. , Ph.D.(IISc) \nResearch Interests: High Performance Computational Engineering, Partial Differential equations, Finite Difference methods, Finite Element Methods, Computer Languages and Computer Graphics. \nEmail: k_sangeeta@blr.amrita.edu ",
         "Qualification : M.Tech. Ph.D. \nResearch Interests: Image Processing ,Computer Vision , Soft Computing ,Computational visual attention system, Cognitive Vision, Pattern Recognition , Attention allocation in various fields & marketing ,robotics etc .\n Email: j_amudha@blr.amrita.edu ",
         "Qualification : M.Tech., [Pursuing Ph.D.] \nResearch Interests: Image Processing, Computer Graphics,Emotion Recognization \n ,Email: p_suja@blr.amrita.edu ",
         "Qualification : M.Tech.,[Pursuing Ph.D.] \n Research Interests: Cloud Computing,Network Security. \n Email: m_supriya@blr.amrita.edu ",
         "Qualification : M.Tech. \nResearch Interests: Cryptography,Network Security.\nEmail: d_radha@blr.amrita edu ",
         "Qualification : M.E., [Pursuing Ph.D.]\nResearch Interests: Mobile agents,Overlay Networks,Mobile and Adhoc Networks \n Email: b_uma@blr.amrita.edu ",
         "Qualification : M.E. (IISc. Bangalore),[Pursuing Ph.D.]\nResearch Interests: Software Engineering, Software Architectures,Data Mining. \nEmail: g_radhakrishnan@blr.amrita.edu ",
         "Qualification : M.Tech. \nResearch Interests: Embedded Systems, Signal processing. \nEmail: k_sangita@blr.amrita edu ",
         "Qualification : M.Tech., [Pursuing Ph.D] \nResearch Interests: Mobile and Adhoc Networks \nEmail: s_juhi@blr.amrita.edu ",
         "Qualification : M.Tech. [Pursuing Ph.D]\nResearch Interests: Computer Architecture, Compiler Design for Multicore Architecture\nEmail: b_meena@blr.amrita.edu ",
         "Qualification : B.E. , M.Tech.\nResearch Interests: Network Security & Cryptography \nEmail: cr_kavitha@blr.amrita edu ",
         "Qualification : B.Tech., M.Tech.,[Pursuing Ph.D.]\nResearch Interests: Mobile and Wireless Networks, Robotics. \nEmail: m_rajesh@blr.amrita.edu ",
         
         "Qualification : M.E. \nResearch Interests: Data Mining. \nEmail: t_sasikala@blr.amrita.edu" ,
         "Qualification : B.E., M.Tech\nResearch Interests: Embedded Systems,Mobila and Adhoc Networks\nEmail: jain_vineetha@blr.amrita.edu ",
         "Qualification : B.Tech., M.Tech \nResearch Interests:Embedded Systems,Computer Architecture \nEmail: p_lakshmi@blr.amrita edu ",
         "Qualification : B.Tech., M.Tech\nResearch Interests: Embedded Systems, Computer Networks.\nEmail: b_sreebha@blr.amrita.edu ",
         "Qualification : M.E. \nResearch Interests: Computer Networks. \nEmail: mr_shinu@blr.amrita.edu ",
         "Qualification : M.Tech.[Pursuing Ph.D.]\nResearch Interests: Data Mining. \nEmail: m_akanchha@blr.amrita.edu ",
         "Qualification : M.Tech.[Pursuing Ph.D.]\nResearch Interests: Computer Architecture, Multicore Architecture,Parallel Computing.\nEmail: u_bhargavi@blr.amrita.edu",
         "Qualification : M.Tech., [Pursuing Ph.D.] \nResearch Interests: Artificial Intelligence,Medical Image Processing,Netwok Designing,Network Security,Netwok Administration,Pattern Recognization\nEmail: tripty_singh@blr.amrita.edu",
         "Qualification : M.Tech.[Pursuing Ph.D.]\nResearch Interests: Robotics, Sensor Networks.\nEmail: aa_nippunkumaar@blr.amrita.edu ",
         "Qualification : M.S., [Pursuing Ph.D]\nResearch Interests: Cryptography and Netwok Security.\nEmail: s_lakshmi@blr.amrita.edu ",
         "Qualification : MCA\nResearch Interests: Network Design and Implementation, Network Security\nEmail:s_ullas(at)blr.amrita.edu",
         "Qualification : B.Tech.,[Pursuing M.Tech] \nResearch Interests:Image Processing \nEmail: c_jyotsna@blr.amrita.edu ",
         "Qualification : B.E.,[Pursuing M.Tech]\nResearch Interests: \nEmail: b_sreevidya@blr.arita.edu ",
         "Qualification : B.E., [Pursuing M.Tech]\nResearch Interests: \nEmail: s_nalini@blr.amrita.edu ",
         "Qualification : M.Sc., MCA. \nResearch Interests: Database Management Systems. \nEmail: k_vidya@blr.amrita.edu ",
         "Qualification : M C A. \nResearch Interests: Database Management Systems.\nEmail: v_manju@blr.amrita.edu ",
         "Qualification : B.E. \nResearch Interests:Software Engineering,C Programming,Data Mining \nEmail: v_priyanka@blr.amrita.edu ",
         "Qualification : MSc., MPhil.\nResearch Interests: Distributed Computing.\nEmail: kr_chandrika@blr.amrita.edu",
         "Qualification: B.E(CSE), M.E(CSE), \n Area of specialization: System Software Concepts, Computer Architecture, Microprocessor, Assembly Programming Languages,J2EE \n Area of Interests:Data Mining, Computer Networks \n Mail id: s_saravanan@blr.amrita.edu, saranpons3@gmail.com",
         "Qualification : M.Tech., [Pursuing Ph.D.] \n Research Interests: RFID-based Sensor Networks, Wireless Sensor Networks,Information Security, Multimedia Applications, Mobile Communications. \n Email: a_bhattacharjya@blr.amrita.edu",
         "Qualification : B.E, M.S. \n Research Interests: Networking, Virtualization and Mobile computing \n Email: mp_lakshmi@blr.amrita.edu "
         
         
 };

 public static final Integer[] images = { R.drawable.chairman,
	 R.drawable.raj_kumar_p,R.drawable.sangeeta_iyer,R.drawable.amudha_j,R.drawable.suja_p,
	 R.drawable.supriya_m,R.drawable.radha,R.drawable.uma_maheshwari,R.drawable.g_radhakrishnan,
	 R.drawable.sngita_kare,
	 R.drawable.juhi_r_srivatsava,
	 R.drawable.meena_belwal,R.drawable.kavaitha_c_r,R.drawable.rajesh_m,
	 R.drawable.sasikala,R.drawable.vineetha_k_v,
	 R.drawable.lakshmi_p,R.drawable.sreeba_bhaskaran,
	 R.drawable.sinu,R.drawable.akanchha_mishra,R.drawable.bhargavi_r_upadhyay,
	 R.drawable.tripti_singh,R.drawable.nippun_kumaar,
	 R.drawable.santhanalakshmi_s,R.drawable.ullas,R.drawable.jyotsna_c,
	 R.drawable.sreevidya,R.drawable.nalini,R.drawable.k_v_vidya,
	 R.drawable.manju_venigopal,R.drawable.priyanka_vivek,R.drawable.chandrika,
	 R.drawable.saravanan_s_cse,
	 R.drawable.aniruddha_bhattacharjya_cse,
	 R.drawable.lakshmi_m_p_shetty_cse
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
             R.layout.csefaculty, rowItems);
     listView.setAdapter(adapter);
     listView.setOnItemClickListener(this);
 }
 
 
 
 public void onItemClick(AdapterView<?> parent, View view, int position,
         long id) {
     
 }
}


