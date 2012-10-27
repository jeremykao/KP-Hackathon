package com.kaiser.kpaftervisit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Settings extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Settings.this.overridePendingTransition(R.anim.slide_left, R.anim.slide_right_out);
        setContentView(R.layout.main);        
        assignButtons();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void assignButtons(){
        Button home = (Button) findViewById(R.id.homeButton);
        home.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Settings.this, MainActivity.class);
                Settings.this.startActivity(intent);
			}
		});
        
        Button whatsNext = (Button) findViewById(R.id.whatsNextButton);
        whatsNext.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Settings.this, WhatsNext.class);
                Settings.this.startActivity(intent);
			}
		});
        
        Button progress = (Button) findViewById(R.id.progress);
        progress.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Settings.this, Progress.class);
                Settings.this.startActivity(intent);
			}
		});
        Button healthData = (Button) findViewById(R.id.healthData);
        healthData.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Settings.this, HealthData.class);
                Settings.this.startActivity(intent);
			}
		});
        
        Button settings = (Button) findViewById(R.id.settings);
        settings.setBackgroundResource(R.drawable.settingsh2);
        
    }
}
