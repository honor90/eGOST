package app.firstapp.egost.swiching;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import app.firstapp.egost.ActelActivity;
import app.firstapp.egost.OkustelActivity;
import app.firstapp.egost.OptelActivity;
import app.firstapp.egost.PaselActivity;
import app.firstapp.egost.R;
import app.firstapp.egost.SwitchingActivity;


public class SwrActivity extends Activity implements
ActionBar.OnNavigationListener {

	 private String[] data = new String[] {"—оединители", "јктивные элементы", "ѕассивные элементы", "ќптроны", "Ёлементы коммутации", "Ёлектроакустические приборы"};	
	 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.swr);
		
		// Look up the AdView as a resource and load a request.
		AdView adView = (AdView)this.findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		adView.loadAd(adRequest);
		
    ActionBar bar = getActionBar();
    bar.setHomeButtonEnabled(true);
    bar.setDisplayHomeAsUpEnabled(true);
    
    
    bar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
    		R.layout.my_list_item, data);
    adapter.setDropDownViewResource(R.layout.my_list_item);
    bar.setListNavigationCallbacks(adapter, this); 
    
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
			  case 5:
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
			Intent intent1 = new Intent(getApplicationContext(),SwitchingActivity.class);
			startActivity(intent1);
        break;           
    }
       return super.onOptionsItemSelected(item);
}		

}