package com.kaiser.kpaftervisit;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.widget.TextView;

public class PastVisits extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visit_summary);
        
        String text1 = "You need to take care of your <b>blood pressure</b>. You are still far above our discussed goal.";
            text1 = text1 + "Please continue and possibly take more care to diet. If you don’t improve, drugs may be necessary";
            
        TextView advice = (TextView) findViewById(R.id.visitSummaryAdvice);
        advice.setText(Html.fromHtml(text1));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
