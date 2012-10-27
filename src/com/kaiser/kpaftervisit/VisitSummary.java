package com.kaiser.kpaftervisit;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class VisitSummary extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visit_summary);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
