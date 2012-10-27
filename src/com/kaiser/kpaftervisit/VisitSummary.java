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

public class VisitSummary extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.past_visits);
        assignButtons();
        String summary = "";
        try {
			summary = printSummary("avs_summary1.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        TextView avsSummaryView1 = (TextView) findViewById(R.id.avsSummary1);
    	avsSummaryView1.setText(Html.fromHtml(summary));
    	
    	try {
			summary = printSummary("avs_summary2.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	TextView avsSummaryView2 = (TextView) findViewById(R.id.avsSummary2);
    	avsSummaryView2.setText(Html.fromHtml(summary));
    	
    	try {
			summary = printSummary("avs_summary3.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	TextView avsSummaryView3 = (TextView) findViewById(R.id.avsSummary3);
    	avsSummaryView3.setText(Html.fromHtml(summary));
    	
    	try {
			summary = printSummary("avs_summary4.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	TextView avsSummaryView4 = (TextView) findViewById(R.id.avsSummary4);
    	avsSummaryView4.setText(Html.fromHtml(summary));
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
				Intent intent = new Intent(VisitSummary.this, Settings.class);
                VisitSummary.this.startActivity(intent);
			}
		});
        
        Button whatsNext = (Button) findViewById(R.id.whatsNextButton);
        whatsNext.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(VisitSummary.this, WhatsNext.class);
                VisitSummary.this.startActivity(intent);
			}
		});
        
        Button progress = (Button) findViewById(R.id.progress);
        progress.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(VisitSummary.this, Progress.class);
                VisitSummary.this.startActivity(intent);
			}
		});
        Button healthData = (Button) findViewById(R.id.healthData);
        healthData.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(VisitSummary.this, HealthData.class);
                VisitSummary.this.startActivity(intent);
			}
		});
        Button home = (Button) findViewById(R.id.homeButton);
        home.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(VisitSummary.this, MainActivity.class);
                VisitSummary.this.startActivity(intent);
			}
		});
    }
}
