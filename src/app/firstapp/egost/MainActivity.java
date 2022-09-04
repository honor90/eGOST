package app.firstapp.egost;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends Activity
{
    /** ���������� onCreate ���������� ���� ���, � ������ 
        �������� ���������� activity. */
    @Override
	protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
      //������ title bar

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        
        setContentView(R.layout.splash);
        
        Thread logoTimer = new Thread()
        {
            public void run()
            {
                try
                {
                    int logoTimer = 0;
                    while(logoTimer < 5000)
                    {
                        sleep(100);
                        logoTimer = logoTimer +100;
                    };
	    			Intent intent1 = new Intent(getApplicationContext(),HomeActivity.class);
	    			startActivity(intent1);
                } 
                catch (InterruptedException e)
                {
                    // TODO: ������������� ��������������� ���� catch.
                    e.printStackTrace();
                }
                finally
                {
                    finish();
                }
            }
        };
        logoTimer.start();
    }
}
