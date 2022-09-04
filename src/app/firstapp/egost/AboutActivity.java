package app.firstapp.egost;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public class AboutActivity extends Activity implements
ActionBar.OnNavigationListener {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		
		
       ActionBar bar = getActionBar();
       bar.setHomeButtonEnabled(true);
       bar.setDisplayHomeAsUpEnabled(true);
       
      
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





		@Override
		public boolean onNavigationItemSelected(int itemPosition, long itemId) {
			// TODO Auto-generated method stub
			return false;
		}

}