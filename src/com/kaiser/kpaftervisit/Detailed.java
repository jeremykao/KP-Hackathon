package com.kaiser.kpaftervisit;

import java.io.IOException;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Detailed extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed);
        assignButtons();
        
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public String printSummary(String fileName) throws IOException{
    	Parser parserForData = new Parser( this, fileName);
    	String[] parsedData = parserForData.stringParse();
    	String summary = "<b>Hello " + parsedData[0] + "!</b><br /> Here's a summary of your last visit to " + parsedData[1] + "\n";
    	summary = summary + "<br /><b>Visit Date:</b> " + parsedData[2] + "<br /><b>Reason:</b> " + parsedData[3] + "<br /><b>Cause:</b> " + parsedData[4];
    	summary = summary + "<br /><b>Action:</b> " + parsedData[5] + "<br /><b>Next Appointment:</b> " + parsedData[6];
    	
    	return summary;
    }
    
    public void assignButtons(){
        Button settings = (Button) findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Detailed.this, Settings.class);
                Detailed.this.startActivity(intent);
			}
		});
        Button whatsNext = (Button) findViewById(R.id.whatsNextButton);
        whatsNext.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Detailed.this, WhatsNext.class);
                Detailed.this.startActivity(intent);
			}
		});
        
        Button progress = (Button) findViewById(R.id.progress);
        progress.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Detailed.this, Progress.class);
                Detailed.this.startActivity(intent);
			}
		});
        Button healthData = (Button) findViewById(R.id.healthData);
        healthData.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Detailed.this, HealthData.class);
                Detailed.this.startActivity(intent);
			}
		});
        Button home = (Button) findViewById(R.id.homeButton);
        home.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Detailed.this, MainActivity.class);
                Detailed.this.startActivity(intent);
			}
		});
    }
}
