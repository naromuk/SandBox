package com.narom.tipcalculator;

import android.app.Activity;
import android.os.Bundle;

public class CalculatorActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    protected void onStart() {
        super.onStart();

    }


    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public CharSequence onCreateDescription() {
        return super.onCreateDescription();
    }
}
