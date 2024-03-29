package com.kaiser.kpaftervisit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

public class SplashScreen extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        
        Handler handler = new Handler();
        
        // run a thread after 2 seconds to start the home screen
        handler.postDelayed(new Runnable() {
 
            public void run() {
 
                // make sure we close the splash screen so the user won't come back when it presses back key
 
                finish();
                // start the home screen
 
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                SplashScreen.this.startActivity(intent);
 
            }
 
        }, 2000); // time in milliseconds (1 second = 1000 milliseconds) until
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.splash_screen, menu);
        return true;
    }
}
