package com.kaiser.kpaftervisit;

import java.io.IOException;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HealthData extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HealthData.this.overridePendingTransition(R.anim.slide_left, R.anim.slide_right_out);
        setContentView(R.layout.healthdata);
        assignButtons();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void assignButtons(){
        Button settings = (Button) findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(HealthData.this, Settings.class);
                HealthData.this.startActivity(intent);
			}
		});
        
        Button whatsNext = (Button) findViewById(R.id.whatsNextButton);
        whatsNext.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(HealthData.this, WhatsNext.class);
                HealthData.this.startActivity(intent);
			}
		});
        
        Button progress = (Button) findViewById(R.id.progress);
        progress.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(HealthData.this, Progress.class);
                HealthData.this.startActivity(intent);
			}
		});
        Button home = (Button) findViewById(R.id.homeButton);
        home.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(HealthData.this, MainActivity.class);
                HealthData.this.startActivity(intent);
			}
		});
        
        Button data = (Button) findViewById(R.id.healthData);
        data.setBackgroundResource(R.drawable.datah2);
        
    }
}
