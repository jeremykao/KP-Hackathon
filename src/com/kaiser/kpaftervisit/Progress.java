package com.kaiser.kpaftervisit;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Progress extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Progress.this.overridePendingTransition(R.anim.slide_left, R.anim.slide_right_out);
        setContentView(R.layout.progress);
        assignButtons();
        
        //Bitmap b = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        //Canvas c = new Canvas(b);
        //ProgressBar progressBar = new ProgressBar(5,5,90,90,c);
        
        //View canvasView = (View) findViewById(R.id.canvasView);
        //canvasView.addView(c);
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
				Intent intent = new Intent(Progress.this, Settings.class);
                Progress.this.startActivity(intent);
			}
		});
        
        Button whatsNext = (Button) findViewById(R.id.whatsNextButton);
        whatsNext.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Progress.this, WhatsNext.class);
                Progress.this.startActivity(intent);
			}
		});
        
        Button home = (Button) findViewById(R.id.homeButton);
        home.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Progress.this, MainActivity.class);
                Progress.this.startActivity(intent);
			}
		});
        Button healthData = (Button) findViewById(R.id.healthData);
        healthData.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Progress.this, HealthData.class);
                Progress.this.startActivity(intent);
			}
		});
        
    }
}
