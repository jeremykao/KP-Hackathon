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

public class WhatsNext extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WhatsNext.this.overridePendingTransition(R.anim.slide_left, R.anim.slide_right_out);
        setContentView(R.layout.what_next);
        assignButtons();
        printInfo();
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
				Intent intent = new Intent(WhatsNext.this, Settings.class);
                WhatsNext.this.startActivity(intent);
			}
		});
        
        Button home = (Button) findViewById(R.id.homeButton);
        home.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(WhatsNext.this, MainActivity.class);
                WhatsNext.this.startActivity(intent);
			}
		});
        
        Button progress = (Button) findViewById(R.id.progress);
        progress.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(WhatsNext.this, Progress.class);
                WhatsNext.this.startActivity(intent);
			}
		});
        Button healthData = (Button) findViewById(R.id.healthData);
        healthData.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(WhatsNext.this, HealthData.class);
                WhatsNext.this.startActivity(intent);
			}
		});
        
        Button what_next = (Button) findViewById(R.id.whatsNextButton);
        what_next.setBackgroundResource(R.drawable.todoh2);
        
    }
    public void printInfo(){
    	TextView text1 = (TextView) findViewById(R.id.what_nextTV1);
    	TextView text2 = (TextView) findViewById(R.id.what_nextTV2);
    	TextView text3 = (TextView) findViewById(R.id.what_nextTV3);
    	TextView text4 = (TextView) findViewById(R.id.what_nextTV4);
    	TextView text5 = (TextView) findViewById(R.id.what_nextTV5);
    	
    	text1.setText("Take 2 pills of Benicar Daily");
    	text2.setText("Exercise Daily");
    	text3.setText("Do not consume too much Sodium");
    	text4.setText("Losing Weight and Exercising helps a lot");
    	text5.setText("Let's try to see lower readings next time!");
    }
}
