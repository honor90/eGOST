package app.firstapp.egost;

import java.util.ArrayList;
import java.util.HashMap;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import app.firstapp.egost.R;
import app.firstapp.egost.okustel.GidfonActivity;
import app.firstapp.egost.okustel.GolgrActivity;
import app.firstapp.egost.okustel.MicrofonActivity;
import app.firstapp.egost.okustel.TelefonActivity;
import app.firstapp.egost.okustel.ZvgolActivity;
import app.firstapp.egost.okustel.ZvonActivity;


public class OkustelActivity extends Activity implements
ActionBar.OnNavigationListener {
	
	 private String[] data = new String[] { "������������������� �������", "�������� ��������", "��������� ��������", "�������", "�������� ����������"};	
	 
	 
    private ArrayList <HashMap<String, Object>> ocEl;

    private InterstitialAd interstitial;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ocustel);
		
	    // �������� �������������� ����������.
	    interstitial = new InterstitialAd(this);
	    interstitial.setAdUnitId("ca-app-pub-5003430254904692/2874513166");

	    // �������� ������� ����������.
	    AdRequest adRequest = new AdRequest.Builder().build();

	    // ������ �������� �������������� ����������.
	    interstitial.loadAd(adRequest);    
	    
	    interstitial.setAdListener(new AdListener() { @Override public void onAdLoaded() {displayInterstitial();} });
		
		
       ActionBar bar = getActionBar();
       bar.setHomeButtonEnabled(true);
       bar.setDisplayHomeAsUpEnabled(true);
       
       
       bar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

       ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
           R.layout.my_list_item, data);
       adapter.setDropDownViewResource(R.layout.my_list_item);
       bar.setListNavigationCallbacks(adapter, this);  	
       
       
       
       
       ListView listView = (ListView)findViewById(R.id.ocustelView);
       ocEl = new ArrayList<HashMap<String,Object>>();
       HashMap<String, Object> hm;

       hm = new HashMap<String, Object>();
       hm.put("octext", "��������");
       hm.put("ocimg", R.drawable.micr); //��� �� � ��������� ��� �����������
    
       ocEl.add(hm);
       
       hm = new HashMap<String, Object>();
       hm.put("octext", "�������");
       hm.put("ocimg", R.drawable.tel); //��� �� � ��������� ��� �����������
    
       ocEl.add(hm);  
       
       hm = new HashMap<String, Object>();
       hm.put("octext", "������� ����������������");
       hm.put("ocimg", R.drawable.gol); //��� �� � ��������� ��� �����������
    
       ocEl.add(hm);        
       
       hm = new HashMap<String, Object>();
       hm.put("octext", "��������������");
       hm.put("ocimg", R.drawable.golovka); //��� �� � ��������� ��� �����������
    
       ocEl.add(hm);       
   
       hm = new HashMap<String, Object>();
       hm.put("octext", "�������� � ����������");
       hm.put("ocimg", R.drawable.gid); //��� �� � ��������� ��� �����������
    
       ocEl.add(hm);
       
       hm = new HashMap<String, Object>();
       hm.put("octext", "������ � �������");
       hm.put("ocimg", R.drawable.zv); //��� �� � ��������� ��� �����������
    
       ocEl.add(hm);           
       
      SimpleAdapter ocustelview = new SimpleAdapter(this, 
   		   ocEl, 
                                                R.layout.layout_list, new String[]{
                                                "octext",         //������� �����
                                                "ocimg"          //���� ��������
                                                }, new int[]{
                                                R.id.text1, //������ �� ������ ������������ �����
                                                R.id.img}); //�������� ������ � ��� ���������� �������� �� list.xml
               
       listView.setAdapter(ocustelview);
       listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE); 		
		

       
       
       
       listView.setOnItemClickListener(new OnItemClickListener() {
           public void onItemClick(AdapterView<?> parent, View view,
               int position, long id) {
           	switch ((int)id){
           	case 0:
    			Intent intent0 = new Intent(getApplicationContext(),MicrofonActivity.class);
   			startActivity(intent0);             		
           	break;  
           	case 1:
    			Intent intent1 = new Intent(getApplicationContext(),TelefonActivity.class);
   			startActivity(intent1);             		
           	break;  
           	case 2:
    			Intent intent2 = new Intent(getApplicationContext(),GolgrActivity.class);
   			startActivity(intent2);             		
           	break; 
           	case 3:
    			Intent intent3 = new Intent(getApplicationContext(),ZvgolActivity.class);
   			startActivity(intent3);             		
           	break;     
           	case 4:
    			Intent intent4 = new Intent(getApplicationContext(),GidfonActivity.class);
   			startActivity(intent4);             		
           	break;   
           	case 5:
    			Intent intent5 = new Intent(getApplicationContext(),ZvonActivity.class);
   			startActivity(intent5);             		
           	break;               	
           	}
           }
         });
       
       
	}

	  // �������� displayInterstitial(), ����� ������ ������ �������� ������������� ����������.
	  public void displayInterstitial() {
	    if (interstitial.isLoaded()) {
	      interstitial.show();
	    }
	    
	  }	
	
	  @Override
	  public boolean onNavigationItemSelected(int itemPosition, long itemId) {
		  switch ((int)itemId){	  
		  
		  case 1:
	  			Intent intent1 = new Intent(getApplicationContext(),ActelActivity.class);
	 			startActivity(intent1); 			  
			  break;
			  case 2:
		  			Intent intent2 = new Intent(getApplicationContext(),PaselActivity.class);
		 			startActivity(intent2); 			  
				  break;
			  case 3:
		  			Intent intent3 = new Intent(getApplicationContext(),OptelActivity.class);
		 			startActivity(intent3); 			  
				  break;	
			  case 4:
		  			Intent intent4 = new Intent(getApplicationContext(),SwitchingActivity.class);
		 			startActivity(intent4); 			  
				  break;	
		  }
	    return false;
	  }
	  
		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
		    // Handle item selection
	        switch (item.getItemId()) {
	            case android.R.id.home:
	    			Intent intent1 = new Intent(getApplicationContext(),HomeActivity.class);
	    			startActivity(intent1);
	            break;           
	        }
	           return super.onOptionsItemSelected(item);
	}	  
	  		  

	  

}