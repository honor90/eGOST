package app.firstapp.egost;

import java.util.ArrayList;
import java.util.HashMap;

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
import app.firstapp.egost.actel.DiodActivity;
import app.firstapp.egost.actel.DshotkiActivity;
import app.firstapp.egost.actel.FdiodActivity;
import app.firstapp.egost.actel.FtransistorActivity;
import app.firstapp.egost.actel.MicrochipActivity;
import app.firstapp.egost.actel.ThyristorActivity;
import app.firstapp.egost.actel.TransistorAvtivity;
import app.firstapp.egost.actel.TrmnogoActivity;
import app.firstapp.egost.actel.TrodnoperActivity;
import app.firstapp.egost.actel.TrpolActivity;
import app.firstapp.egost.actel.ZenerActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;


public class ActelActivity extends Activity implements
ActionBar.OnNavigationListener {
	
	 private String[] data = new String[] { "�������� ��������", "��������� ��������", "�������", "�������� ����������", "������������������� �������"};	
	 
	 
     private ArrayList <HashMap<String, Object>> actEl;
     	
     private InterstitialAd interstitial;
     
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.actel);
		
	    // �������� �������������� ����������.
	    interstitial = new InterstitialAd(this);
	    interstitial.setAdUnitId("ca-app-pub-5003430254904692/2874513166");

	    // �������� ������� ����������.
	    AdRequest adRequest = new AdRequest.Builder().build();

	    // ������ �������� �������������� ����������.
	    interstitial.loadAd(adRequest);    
	    
	    interstitial.setAdListener(new AdListener() { @Override public void onAdLoaded() { displayInterstitial();} });
   
	    
        ActionBar bar = getActionBar();
        bar.setHomeButtonEnabled(true);
        bar.setDisplayHomeAsUpEnabled(true);
        
        
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
            R.layout.my_list_item, data);
        adapter.setDropDownViewResource(R.layout.my_list_item);
        bar.setListNavigationCallbacks(adapter, this);  	
        
        
        
        
        ListView listView = (ListView)findViewById(R.id.actelView);
        actEl = new ArrayList<HashMap<String,Object>>();
        HashMap<String, Object> hm;

        hm = new HashMap<String, Object>();
        hm.put("acttext", "���������� ����������");
        hm.put("actimg", R.drawable.transistor); //��� �� � ��������� ��� �����������
     
        actEl.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put("acttext", "���������� �������");
        hm.put("actimg", R.drawable.tpol); //��� �� � ��������� ��� �����������
     
        actEl.add(hm);    
        
        hm = new HashMap<String, Object>();
        hm.put("acttext", "���������� ��������������");
        hm.put("actimg", R.drawable.todn); //��� �� � ��������� ��� �����������
     
        actEl.add(hm);    
        
        hm = new HashMap<String, Object>();
        hm.put("acttext", "���������� ���������������");
        hm.put("actimg", R.drawable.trmn); //��� �� � ��������� ��� �����������
     
        actEl.add(hm);      
        
        hm = new HashMap<String, Object>();
        hm.put("acttext", "��������������");
        hm.put("actimg", R.drawable.tr_ligth_icon); //��� �� � ��������� ��� �����������
     
        actEl.add(hm);          
        
        hm = new HashMap<String, Object>();
        hm.put("acttext", "����");
        hm.put("actimg",  R.drawable.diod); //��� �� � ��������� ��� �����������
        
        actEl.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put("acttext", "��������");
        hm.put("actimg",  R.drawable.tiristor); //��� �� � ��������� ��� �����������
        
        actEl.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put("acttext", "�����������");
        hm.put("actimg",  R.drawable.st); //��� �� � ��������� ��� �����������
        
        actEl.add(hm); 
        
        hm = new HashMap<String, Object>();
        hm.put("acttext", "���� �����, �������");
        hm.put("actimg",  R.drawable.dshot); //��� �� � ��������� ��� �����������
        
        actEl.add(hm);  
        
        hm = new HashMap<String, Object>();
        hm.put("acttext", "����- � ���������");
        hm.put("actimg",  R.drawable.svet); //��� �� � ��������� ��� �����������
        
        actEl.add(hm);        
        
        hm = new HashMap<String, Object>();
        hm.put("acttext", "����������");
        hm.put("actimg",  R.drawable.mic); //��� �� � ��������� ��� �����������
        
        actEl.add(hm);
        
    
        
        
       SimpleAdapter actelview = new SimpleAdapter(this, 
    		   actEl, 
                                                 R.layout.layout_list, new String[]{
                                                 "acttext",         //������� �����
                                                 "actimg"          //���� ��������
                                                 }, new int[]{
                                                 R.id.text1, //������ �� ������ ������������ �����
                                                 R.id.img}); //�������� ������ � ��� ���������� �������� �� list.xml
                
        listView.setAdapter(actelview);
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE); 		
		

        
        
        
        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                int position, long id) {
            	switch ((int)id){
            	case 0:
     			Intent intent0 = new Intent(getApplicationContext(),TransistorAvtivity.class);
    			startActivity(intent0);             		
            	break;
            	case 1:
     			Intent intent1 = new Intent(getApplicationContext(),TrpolActivity.class);
    			startActivity(intent1);             		
            	break;   
            	case 2:
     			Intent intent2 = new Intent(getApplicationContext(),TrodnoperActivity.class);
    			startActivity(intent2);             		
            	break; 
            	case 3:            	
     			Intent intent3 = new Intent(getApplicationContext(),TrmnogoActivity.class);
    			startActivity(intent3);             		
            	break;  
            	case 4:             	
     			Intent intent4 = new Intent(getApplicationContext(), FtransistorActivity.class);
    			startActivity(intent4);             		
            	break; 
            	case 5:             	
     			Intent intent5 = new Intent(getApplicationContext(), DiodActivity.class);
    			startActivity(intent5);             		
            	break;  
            	case 6:             	
     			Intent intent6 = new Intent(getApplicationContext(), ThyristorActivity.class);
    			startActivity(intent6);             		
            	break;
            	case 7:             	
     			Intent intent7 = new Intent(getApplicationContext(), ZenerActivity.class);
    			startActivity(intent7);             		
            	break;         
            	case 8:             	
     			Intent intent8 = new Intent(getApplicationContext(), DshotkiActivity.class);
    			startActivity(intent8);             		
            	break;           
            	case 9:             	
     			Intent intent9 = new Intent(getApplicationContext(), FdiodActivity.class);
    			startActivity(intent9);             		
            	break;   
            	case 10:  
            	Intent intent10 = new Intent(getApplicationContext(), MicrochipActivity.class);
    			startActivity(intent10);             		
            	break;               	
            	}
            }
          });
        
        displayInterstitial();   
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
		  			Intent intent1 = new Intent(getApplicationContext(),PaselActivity.class);
		 			startActivity(intent1); 			  
				  break;
			  case 2:
		  			Intent intent2 = new Intent(getApplicationContext(),OptelActivity.class);
		 			startActivity(intent2); 			  
				  break;	
			  case 3:
		  			Intent intent3 = new Intent(getApplicationContext(),SwitchingActivity.class);
		 			startActivity(intent3); 			  
				  break;	
			  case 4:
		  			Intent intent4 = new Intent(getApplicationContext(),OkustelActivity.class);
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
