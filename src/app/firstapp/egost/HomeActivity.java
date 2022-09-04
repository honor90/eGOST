package app.firstapp.egost;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HomeActivity extends Activity implements OnClickListener{
	
	private Button Actel;
	private Button Pasel;
	private Button Switching;
	private Button Optron;
	private Button Okustika;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	
		

	
		
		Actel = (Button) findViewById(R.id.but1);
		Actel.setOnClickListener(this);
		
		Pasel = (Button) findViewById(R.id.but2);
		Pasel.setOnClickListener(this);	
		
		Switching = (Button) findViewById(R.id.but3);
		Switching.setOnClickListener(this);		
		
		
		Optron = (Button) findViewById(R.id.but5);
		Optron.setOnClickListener(this);	
		
		Okustika = (Button) findViewById(R.id.but6);
		Okustika.setOnClickListener(this);			
		
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
	    getMenuInflater().inflate(R.menu.main, menu);
	    return true;
	}

	
@Override
public boolean onOptionsItemSelected(MenuItem item) {
    // Handle item selection
    switch (item.getItemId()) {
        case R.id.about_app:
            //здесь вызов активити или попапа с информацией о приложении
			Intent intent = new Intent(getApplicationContext(),AboutActivity.class);
			startActivity(intent);

            return true;
        default:
            return super.onOptionsItemSelected(item);
    }
}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.but1:
			Intent intent1 = new Intent(getApplicationContext(),ActelActivity.class);
			startActivity(intent1);
		break;
		case R.id.but2:
			Intent intent2 = new Intent(getApplicationContext(),PaselActivity.class);
			startActivity(intent2);
		break;
		case R.id.but3:
			Intent intent3 = new Intent(getApplicationContext(),SwitchingActivity.class);
			startActivity(intent3);
		break;		
		case R.id.but5:
			Intent intent5 = new Intent(getApplicationContext(),OptelActivity.class);
			startActivity(intent5);
		break;	
		case R.id.but6:
			Intent intent6 = new Intent(getApplicationContext(),OkustelActivity.class);
			startActivity(intent6);
		break;			
			}
	}	

}	
	
	
	
	
