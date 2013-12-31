
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

public class CIRFaculty extends Activity implements OnItemClickListener{
	

	public static final String[] titles = new String[] { 
		" K Shashidhar \n Center Head – Corporate and Industry Relations ",
		"Mrs. Asha Shyam \n Designation : Coordinator ",
		"A D Bala Krishnan \n Manager-Learning and Development",
		"Vadivelan Gopal\n Manager – Corporate and Industry Relations ",
		"Dainy.K.B \n CIR Assistant.",
		"Adity Chamuah \n Faculty- Learning & Development ",
		"Mrs. Karthika Nair.S",
		"Sujatha V \n Faculty  - L&D ( Aptitude)",
		"Sivaraman R \n Technical Faculty – Learning & Development",
		"Mohan R \n  Faculty - Mathematical Aptitude - L&D \n Corporate and Industry Relations ",
		
		 
	 };

public static final String[] descriptions = new String[] {

"Qualifications: B Tech Chemical Engineering, IIT Delhi \n Experience: 16 years (IT Industry), IBM, Cognizant, SCOPE International (Standard Chartered Bank) \n Areas of Specialization: Technology Leadership and Management, Architecture & Design, People Engagement, Process Design, Learning & Development \nE-mail : k_shashidhar@blr.amrita.edu ",
"Qualifications:  MA.,Experience: 23 years \n Areas of Specialization: Placement & Training \n Email : asha_shyam@blr.amrita.edu",
"Qualification: B.Sc Bangalore University,PG Diploma in Management \n Areas of Specialisation: Leadership Training,Emotional Intellegence,Soft Skills Training,Sales Skills Training and educational Coach \n Work Experience:  20 Years in Pharmaeutical Space, GM Training and Development of Dr Reddy's Lab(4 years), GM-Products,International Marketing in Micrao Labs Pv Ltd,Zonal Sales Manager of Wockhaurelt Pvt Ltd\n E-mail: ",

"Qualifications: B.Com., PGDM., M.Sc (Psychology) \n Experience: 10 Years  \n Areas of Specialization:  Placements and Training ",
"Qualification: M.Com,PGDCA (Pursuing PG  Diploma in T&D) \n Experience : 10 yrs in Education Sectors   \n Areas of Interest: Teaching , HR Mgt and Administration \n E mail : kb_dainy@blr.amrita.edu ",
"Qualifications: M.Phil (English) & M.Ed \n Experience: 6 years \n Areas of Specialization: English Language Teaching. Psycholinguistics ",
"Qualifications:  MA, MBA \n Experience: 4 years (Learning and Development), Tata Consultancy Services, Escube Technologies, Amrita Vishwa Vidyapeetham   \n Areas of Specialization: Instructional Designing, Technical Communication, Soft skills Training ",
" Qualification: M Sc(Computer Science) B Ed (Maths) \n Experience – 2 yrs in Teaching and 1 yr in IT \n Areas of Interes : Teaching   \n Email : sujus78@gmail.com",
"Qualifications: B.E., M.Tech \n Experience: 1.5 years in Cognizant Technology Solutions \n Areas of Specialization:  Physical Sensors, Chemical Sensors, Embedded System, Microcontrollers, Linux, Operating systems \n  E-mail: r_sivaraman@blr.amrita.edu",
"Qualification : MSc (Mathematics), IIT Madras \n Experience : 6 months \n Area of Specialization : ICT in Classroom Teaching, School level Mathematics, Logical ",

};

public static final Integer[] images = {
	R.drawable.sashidharan_cir,
	R.drawable.asha,
	R.drawable.blank,
	
	R.drawable.gopal_cir,
	R.drawable.dainy_cir,
	R.drawable.adit_cir,
	R.drawable.karthika_cir,
	R.drawable.sujatha_v_cir,
	R.drawable.sivaraman_cir,
	R.drawable.mohan_cir,

	
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
