package com.oreilly.demo.pa.ch03.testapp;

import android.app.Activity;
import android.os.Bundle;

import com.oreilly.demo.pa.ch03.testapp.R;

public class TestActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
