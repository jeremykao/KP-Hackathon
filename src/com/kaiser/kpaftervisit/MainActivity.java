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

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        
        Button pastVisits = (Button) findViewById(R.id.pastVisits);
        pastVisits.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, PastVisits.class);
                MainActivity.this.startActivity(intent);
			}
		});
        
        Button visitSummary = (Button) findViewById(R.id.visitsSummary);
        visitSummary.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, VisitSummary.class);
                MainActivity.this.startActivity(intent);
			}
		});
        
        try{
        	printSummary();
        }
        catch(IOException e){
        	Log.d("printSummary", "IO EXCEPTION MOTHA FUCAS");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void printSummary() throws IOException{
    	Parser parserForData = new Parser( this, "avs_summary.txt");
    	String[] parsedData = parserForData.stringParse();
    	String summary = "<b>Hello " + parsedData[0] + "!</b><br /> Here's a summary of your last visit to " + parsedData[1] + "\n";
    	summary = summary + "<br /><b>Visit Date:</b> " + parsedData[2] + "<br /><b>Reason:</b> " + parsedData[3] + "<br /><b>Cause:</b> " + parsedData[4];
    	summary = summary + "<br /><b>Action:</b> " + parsedData[5] + "<br /><b>Next Appointment:</b> " + parsedData[6];
    	
    	TextView avsSummaryView = (TextView) findViewById(R.id.avsSummary);
    	avsSummaryView.setText(Html.fromHtml(summary));
    }
}
