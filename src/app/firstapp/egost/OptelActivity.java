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
import app.firstapp.egost.optel.OptdActivity;
import app.firstapp.egost.optel.OptrActivity;
import app.firstapp.egost.optel.OpttActivity;
import app.firstapp.egost.optel.OpttransActivity;


public class OptelActivity  extends Activity implements
ActionBar.OnNavigationListener {
	
	 private String[] data = new String[] {"ќптроны","јктивные элементы", "ѕассивные элементы", "Ёлементы коммутации", "Ёлектроакустические приборы"};	
	 
	 
    private ArrayList <HashMap<String, Object>> optEL;

    private InterstitialAd interstitial;	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.optel);
	
		
	    // —оздание межстраничного объ€влени€.
	    interstitial = new InterstitialAd(this);
	    interstitial.setAdUnitId("ca-app-pub-5003430254904692/2874513166");

	    // —оздание запроса объ€влени€.
	    AdRequest adRequest = new AdRequest.Builder().build();

	    // «апуск загрузки межстраничного объ€влени€.
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
       
       
       
       
       ListView listView = (ListView)findViewById(R.id.optelView);
       optEL = new ArrayList<HashMap<String,Object>>();
       HashMap<String, Object> hm;

       hm = new HashMap<String, Object>();
       hm.put("opttext", "ќптрон резистивный");
       hm.put("optimg", R.drawable.optres); //тут мы еЄ добавл€ем дл€ отображени€
    
       optEL.add(hm);
       
       hm = new HashMap<String, Object>();
       hm.put("opttext", "ќптрон диодный");
       hm.put("optimg", R.drawable.optdiod); //тут мы еЄ добавл€ем дл€ отображени€
    
       optEL.add(hm);    
       
       hm = new HashMap<String, Object>();
       hm.put("opttext", "ќптрон тиристорный");
       hm.put("optimg", R.drawable.opttir); //тут мы еЄ добавл€ем дл€ отображени€
    
       optEL.add(hm);        
       
       hm = new HashMap<String, Object>();
       hm.put("opttext", "ќптрон транзисторный");
       hm.put("optimg",  R.drawable.opttr); //тут мы еЄ добавл€ем дл€ отображени€
       
       optEL.add(hm);
       
       
   
       
       
      SimpleAdapter optelview = new SimpleAdapter(this, 
    		  optEL, 
                                                R.layout.layout_list, new String[]{
                                                "opttext",         //верхний текст
                                                "optimg"          //наша картинка
                                                }, new int[]{
                                                R.id.text1, //ссылка на объект отображающий текст
                                                R.id.img}); //добавили ссылку в чем отображать картинки из list.xml
               
       listView.setAdapter(optelview);
       listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE); 		
		

       
       
       
       listView.setOnItemClickListener(new OnItemClickListener() {
           public void onItemClick(AdapterView<?> parent, View view,
               int position, long id) {
           	switch ((int)id){
           	case 0:
    			Intent intent0 = new Intent(getApplicationContext(),OptrActivity.class);
   			startActivity(intent0);             		
           	break;       
           	case 1:
    			Intent intent1 = new Intent(getApplicationContext(),OptdActivity.class);
   			startActivity(intent1);             		
           	break;          
           	case 2:
    			Intent intent2 = new Intent(getApplicationContext(),OpttActivity.class);
   			startActivity(intent2);             		
           	break;     
           	case 3:
    			Intent intent3 = new Intent(getApplicationContext(),OpttransActivity.class);
   			startActivity(intent3);             		
           	break;                  	
           	}
           }
         });
       
       
	}

	
	  // ¬ызовите displayInterstitial(), когда будете готовы показать межстраничное объ€вление.
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
		  			Intent intent4 = new Intent(getApplicationContext(),SwitchingActivity.class);
		 			startActivity(intent4); 			  
				  break;	
			  case 4:
		  			Intent intent5 = new Intent(getApplicationContext(),OkustelActivity.class);
		 			startActivity(intent5); 			  
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
