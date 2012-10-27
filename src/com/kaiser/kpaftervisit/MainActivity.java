package com.kaiser.kpaftervisit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button pastVisits = (Button) findViewById(R.id.pastVisits);
        pastVisits.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Intent intent = new Intent(MainActivity.this, PastVisits.class);
                //MainActivity.this.startActivity(intent);
				setContentView(R.layout.past_visits);
			}
		});
        
        Button visitSummary = (Button) findViewById(R.id.visitsSummary);
        visitSummary.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setContentView(R.layout.visit_summary);
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
