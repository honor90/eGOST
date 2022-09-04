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
import app.firstapp.egost.pasel.CapacitorActivity;
import app.firstapp.egost.pasel.CapacitorkpeActivity;
import app.firstapp.egost.pasel.CapacitoroksActivity;
import app.firstapp.egost.pasel.CapacitorperActivity;
import app.firstapp.egost.pasel.CapacitorpodActivity;
import app.firstapp.egost.pasel.CapacitorproxActivity;
import app.firstapp.egost.pasel.DroselActivity;
import app.firstapp.egost.pasel.InductanceActivity;
import app.firstapp.egost.pasel.ReleActivity;
import app.firstapp.egost.pasel.ResfotoActivity;
import app.firstapp.egost.pasel.ResistorActivity;
import app.firstapp.egost.pasel.ResnelActivity;
import app.firstapp.egost.pasel.ResperActivity;
import app.firstapp.egost.pasel.RespodActivity;
import app.firstapp.egost.pasel.TransformatorActivity;


public class PaselActivity extends Activity implements
ActionBar.OnNavigationListener{
	
	private String[] data = new String[] { "��������� ��������", "�������� ��������",  "�������", "�������� ����������", "������������������� �������"};		
    private ArrayList <HashMap<String, Object>> actEl;	
    private InterstitialAd interstitial;	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pasel);
		
		
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
        

        
        ListView listView = (ListView)findViewById(R.id.paselView);
        actEl = new ArrayList<HashMap<String,Object>>();
        HashMap<String, Object> hm;

        hm = new HashMap<String, Object>();
        hm.put("pastext", "�������� ����������");
        hm.put("pasimg", R.drawable.resistor); //��� �� � ��������� ��� �����������
     
        actEl.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put("pastext", "�������� ����������");
        hm.put("pasimg",  R.drawable.rper); //��� �� � ��������� ��� �����������
        
        actEl.add(hm);    
        
        hm = new HashMap<String, Object>();
        hm.put("pastext", "�������� ������������");
        hm.put("pasimg",  R.drawable.rpod); //��� �� � ��������� ��� �����������
        
        actEl.add(hm);   
               
        
        hm = new HashMap<String, Object>();
        hm.put("pastext", "������������� � ��������");
        hm.put("pasimg",  R.drawable.v); //��� �� � ��������� ��� �����������
        
        actEl.add(hm);          
        
        hm = new HashMap<String, Object>();
        hm.put("pastext", "������������");
        hm.put("pasimg",  R.drawable.fres); //��� �� � ��������� ��� �����������
        
        actEl.add(hm);        
        
        hm = new HashMap<String, Object>();
        hm.put("pastext", "����������� ����������");
        hm.put("pasimg",  R.drawable.conden); //��� �� � ��������� ��� �����������
        
        actEl.add(hm); 
        
        hm = new HashMap<String, Object>();
        hm.put("pastext", "����������� ��������");
        hm.put("pasimg",  R.drawable.coks); //��� �� � ��������� ��� �����������      
        
        actEl.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put("pastext", "����������� ������������");
        hm.put("pasimg",  R.drawable.cpod); //��� �� � ��������� ��� �����������      
        
        actEl.add(hm);      
        
        hm = new HashMap<String, Object>();
        hm.put("pastext", "����������� ����������");
        hm.put("pasimg",  R.drawable.cper); //��� �� � ��������� ��� �����������      
        
        actEl.add(hm);     
        
        hm = new HashMap<String, Object>();
        hm.put("pastext", "����������� ���������");
        hm.put("pasimg",  R.drawable.cpr); //��� �� � ��������� ��� �����������      
        
        actEl.add(hm);         
        
        hm = new HashMap<String, Object>();
        hm.put("pastext", "��������� ���� ���");
        hm.put("pasimg",  R.drawable.kpe); //��� �� � ��������� ��� �����������      
        
        actEl.add(hm);           
        
        hm = new HashMap<String, Object>();
        hm.put("pastext", "������� �������������");
        hm.put("pasimg",  R.drawable.induct); //��� �� � ��������� ��� �����������
        
        actEl.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put("pastext", "�������������");
        hm.put("pasimg",  R.drawable.trans); //��� �� � ��������� ��� �����������
        
        actEl.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put("pastext", "����");
        hm.put("pasimg",  R.drawable.rele); //��� �� � ��������� ��� �����������
        
        actEl.add(hm);
        
        hm = new HashMap<String, Object>();
        hm.put("pastext", "��������");
        hm.put("pasimg",  R.drawable.dr); //��� �� � ��������� ��� �����������
        
        actEl.add(hm);       
        
       SimpleAdapter actelview = new SimpleAdapter(this, 
    		   actEl, 
                                                 R.layout.layout_list, new String[]{
                                                 "pastext",         //������� �����
                                                 "pasimg"          //���� ��������
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
     			Intent intent0 = new Intent(getApplicationContext(),ResistorActivity.class);
    			startActivity(intent0);             		
            	break;
            	case 1:            	
     			Intent intent1 = new Intent(getApplicationContext(),ResperActivity.class);
    			startActivity(intent1);             		
            	break;
            	case 2:            	
     			Intent intent2 = new Intent(getApplicationContext(),RespodActivity.class);
    			startActivity(intent2);             		
            	break;   
            	case 3:            	
     			Intent intent3 = new Intent(getApplicationContext(),ResnelActivity.class);
    			startActivity(intent3);             		
            	break;            	
            	case 4:            	
     			Intent intent4 = new Intent(getApplicationContext(),ResfotoActivity.class);
    			startActivity(intent4);             		
            	break;     
            	case 5:            	
     			Intent intent5 = new Intent(getApplicationContext(),CapacitorActivity.class);
    			startActivity(intent5);             		
            	break;           	
            	case 6:            	
     			Intent intent6 = new Intent(getApplicationContext(),CapacitoroksActivity.class);
    			startActivity(intent6);             		
            	break;    
            	case 7:            	
     			Intent intent7 = new Intent(getApplicationContext(),CapacitorpodActivity.class);
    			startActivity(intent7);             		
            	break;         
            	case 8:            	
     			Intent intent8 = new Intent(getApplicationContext(),CapacitorperActivity.class);
    			startActivity(intent8);             		
            	break;          
            	case 9:            	
     			Intent intent9 = new Intent(getApplicationContext(),CapacitorproxActivity.class);
    			startActivity(intent9);             		
            	break;   
            	case 10:            	
     			Intent intent10 = new Intent(getApplicationContext(),CapacitorkpeActivity.class);
    			startActivity(intent10);             		
            	break;    
            	case 11:            	
     			Intent intent11 = new Intent(getApplicationContext(),InductanceActivity.class);
    			startActivity(intent11);             		
            	break;            	
            	case 12:            	
     			Intent intent12 = new Intent(getApplicationContext(),TransformatorActivity.class);
    			startActivity(intent12);             		
            	break; 
            	case 13:            	
     			Intent intent13 = new Intent(getApplicationContext(),ReleActivity.class);
    			startActivity(intent13);             		
            	break;          	
            	case 14:            	
     			Intent intent14 = new Intent(getApplicationContext(),DroselActivity.class);
    			startActivity(intent14);             		
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
